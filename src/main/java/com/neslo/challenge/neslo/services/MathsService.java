package com.neslo.challenge.neslo.services;

import com.neslo.challenge.neslo.models.MathsCommand;
import org.springframework.stereotype.Service;

@Service
public class MathsService {



    public String processMathsEquation(MathsCommand request){

        double result ;

        switch(request.getOperator()){
            case  "+" :
                result =  this.add(request.getFirstOperand(),request.getSecondOperand());
                break;
            case  "-" :
                result = this.subtract(request.getFirstOperand(),request.getSecondOperand());
                break;
            case  "/" :
                result = this.divide(request.getFirstOperand(),request.getSecondOperand());
                break;
            case  "*" :
                result = this.multiply(request.getFirstOperand(),request.getSecondOperand());
                break;

               default:
                return "invalid";
        }


        return result+"";
    }

    private double subtract(double firstOperand, double secondOperand) {
       return firstOperand - secondOperand;

    }

    private double add(double firstOperand, double secondOperand) {
        return  firstOperand + secondOperand;

    }

    private double multiply(double firstOperand, double secondOperand) {
        return  firstOperand * secondOperand;

    }
    private double divide(double firstOperand, double secondOperand) {

        return  firstOperand / secondOperand;

    }


}
