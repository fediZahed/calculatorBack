package com.example.calculator.controller;

import com.example.calculator.model.OperationDto;
import com.example.calculator.strategy.StrategyFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class CalculatorController {

  @PostMapping("/calculate")
  public ResponseEntity<Double> calculate(@RequestBody OperationDto operationDto) {
    Double resultCalculation = StrategyFactory.calculer(operationDto);
    return ResponseEntity.ok(resultCalculation);
  }
}
