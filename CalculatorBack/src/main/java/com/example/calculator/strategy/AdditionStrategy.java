package com.example.calculator.strategy;

import com.example.calculator.model.OperationDto;
import org.springframework.stereotype.Component;

@Component
public class AdditionStrategy extends CalculationStrategy {

  @Override
  public double calculer(OperationDto operationDto) {
    return operationDto.getOperand1() + operationDto.getOperand2();
  }
}
