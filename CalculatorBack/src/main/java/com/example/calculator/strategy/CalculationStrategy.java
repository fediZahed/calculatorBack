package com.example.calculator.strategy;

import com.example.calculator.Enum.OperendEnum;
import com.example.calculator.model.OperationDto;

public abstract class CalculationStrategy {

  public static CalculationStrategy getCalculateStrategy(OperationDto operationDto) {
    return operationDto.getOperator().getCalculationStrategy();
  }

  public abstract double calculer(OperationDto operationDto);
}
