package com.example.calculator.strategy;

import com.example.calculator.model.OperationDto;

public class SoustractionStragy extends CalculationStrategy {

  @Override
  public double calculer(OperationDto operationDto) {
    return operationDto.getOperand1() - operationDto.getOperand2();
  }
}
