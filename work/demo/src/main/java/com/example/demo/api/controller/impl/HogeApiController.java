package com.example.demo.api.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.controller.HogeApi;
import com.example.demo.api.model.ResponseHogeFuga;

@RestController
public class HogeApiController implements HogeApi {

    @Override
    public ResponseEntity<ResponseHogeFuga> hogeGet() {
        ResponseHogeFuga response = new ResponseHogeFuga();
        response.setName("hoge画面");
        return ResponseEntity.ok(response);
    }

}
