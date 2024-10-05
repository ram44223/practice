package com.apipractice.controller;

import com.apipractice.entity.Register;
import com.apipractice.service.RegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    //http://localhost:8080/api/v1/register

    @PostMapping
    public ResponseEntity<Register> addString(@RequestBody Register register){
      Register reg= registerService.createRegister(register);
        return new ResponseEntity(reg, HttpStatus.CREATED);
    }
}
