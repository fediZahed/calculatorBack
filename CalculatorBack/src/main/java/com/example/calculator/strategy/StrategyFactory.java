package com.example.calculator.strategy;

import com.example.calculator.model.OperationDto;

public abstract class StrategyFactory {

  public static double calculer(OperationDto operationDto) {
    return CalculationStrategy.getCalculateStrategy(operationDto).calculer(operationDto);
  }
}
