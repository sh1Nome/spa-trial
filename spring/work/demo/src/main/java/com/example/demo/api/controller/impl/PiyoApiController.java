package com.example.demo.api.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.controller.PiyoApi;
import com.example.demo.api.model.RequestPiyo;
import com.example.demo.api.model.ResponsePiyo;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class PiyoApiController implements PiyoApi {

    @Override
    public ResponseEntity<ResponsePiyo> piyoPost(@Valid RequestPiyo body) {
        ResponsePiyo response = new ResponsePiyo();
        response.setName("piyo画面");
        response.setGreeting(body.getGreeting());
        return ResponseEntity.ok(response);
    }

}
