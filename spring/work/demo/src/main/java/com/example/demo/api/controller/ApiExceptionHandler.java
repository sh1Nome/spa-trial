package com.example.demo.api.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private final Map<Class<? extends Exception>, String> messageMappings;

    private final String defaultMessage;

    public ApiExceptionHandler() {
        HashMap<Class<? extends Exception>, String> map = new HashMap<>();
        map.put(NoResourceFoundException.class, "404 not found");
        map.put(HttpMediaTypeNotSupportedException.class, "415 unsupported media type");
        this.messageMappings = Collections.unmodifiableMap(map);
        this.defaultMessage = "system error";
    }

    private String resolveMessage(Exception e) {
        return this.messageMappings.entrySet().stream()
                .filter(messageMapping -> messageMapping.getKey().isAssignableFrom(e.getClass())).findFirst()
                .map(messageMapping -> messageMapping.getValue()).orElse(this.defaultMessage);
    }

    private ApiError createApiError(Exception e) {
        ApiError err = new ApiError();
        err.setMessage(this.resolveMessage(e));
        return err;
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception e, Object body, HttpHeaders headers,
            HttpStatusCode statusCode, WebRequest request) {
        ApiError err = this.createApiError(e);
        return super.handleExceptionInternal(e, err, headers, statusCode, request);
    }

}
