package com.example.calculator.Enum;

import com.example.calculator.strategy.AdditionStrategy;
import com.example.calculator.strategy.CalculationStrategy;
import com.example.calculator.strategy.DisivionStrategy;
import com.example.calculator.strategy.MultiplicationStrategy;
import com.example.calculator.strategy.SoustractionStragy;

public enum OperendEnum {
  ADD(new AdditionStrategy()),
  DIVISION(new DisivionStrategy()),
  SOUSSTRACTION(new SoustractionStragy()),
  MULTIPLICATION(new MultiplicationStrategy());


  private final CalculationStrategy calculationStrategy;

  OperendEnum(CalculationStrategy calculationStrategy) {
    this.calculationStrategy = calculationStrategy;
  }

  public CalculationStrategy getCalculationStrategy() {
    return calculationStrategy;
  }
}
