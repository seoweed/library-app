package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController

public class CalculatorController {
    @GetMapping("/add")
    public int addTwoNumber(CalculatorAddRequest request) {
        return request.getNumber1()+ request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumber(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }



}










