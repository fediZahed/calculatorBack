package com.example.calculator.strategy;

import com.example.calculator.exception.DivisionParZeroException;
import com.example.calculator.model.OperationDto;

public class DisivionStrategy extends CalculationStrategy {
  private static final int ZERO = 0;
  @Override
  public double calculer(OperationDto operationDto) {
    if (operationDto.getOperand2() == ZERO) {
      throw new DivisionParZeroException("division par zero");
    } else {
      return operationDto.getOperand1() / operationDto.getOperand2();
    }
  }
}
