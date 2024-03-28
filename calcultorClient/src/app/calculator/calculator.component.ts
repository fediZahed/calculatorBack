import { Component } from '@angular/core';
import { Operation } from '../model/operation';
import { CalculateService } from '../service/calculate.service';
import { Operator } from '../model/operandEnum';
import { MatSnackBar, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  operation: Operation = new Operation();
  public operatorValue = Operator;
  config = {  verticalPosition: 'top' as MatSnackBarVerticalPosition}
  constructor(private calculatorService: CalculateService, private snackBar : MatSnackBar ) {}
  result: number = 0;
   
  calculate(): void {
    this.calculatorService.calculate(this.operation)
      .subscribe(result => {
        this.result= result; 
      }, (error)=> {
       this.snackBar.open('Erreur de Calcul', 'Fermer', {
          duration: 2000,
          ...this.config
        });
      });
  }
}
