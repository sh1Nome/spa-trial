package com.example.demo.api.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.controller.FugaApi;
import com.example.demo.api.model.ResponseHogeFuga;

@RestController
public class FugaApiController implements FugaApi {

    @Override
    public ResponseEntity<ResponseHogeFuga> fugaGet() {
        ResponseHogeFuga response = new ResponseHogeFuga();
        response.setName("fuga画面");
        return ResponseEntity.ok(response);
    }

}
