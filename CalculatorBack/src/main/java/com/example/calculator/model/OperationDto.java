package com.example.calculator.model;

import com.example.calculator.Enum.OperendEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperationDto {
  private double operand1;
  private double operand2;
  private OperendEnum operator;
}
