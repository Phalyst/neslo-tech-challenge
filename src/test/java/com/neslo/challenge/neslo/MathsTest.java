package com.neslo.challenge.neslo;

import com.neslo.challenge.neslo.models.MathsCommand;
import com.neslo.challenge.neslo.services.MathsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MathsTest {

    @Autowired
    private MathsService mathsService;

    @Test
    public void addTest(){

        MathsCommand mathsCommand = new MathsCommand();
        mathsCommand.setFirstOperand(10);
        mathsCommand.setSecondOperand(10);
        mathsCommand.setOperator("+");

        String result = mathsService.processMathsEquation(mathsCommand);

        Assert.assertEquals(result,"20.0");


    }

    @Test
    public void SubtractTest(){

        MathsCommand mathsCommand = new MathsCommand();
        mathsCommand.setFirstOperand(10);
        mathsCommand.setSecondOperand(5);
        mathsCommand.setOperator("-");

        String result = mathsService.processMathsEquation(mathsCommand);

        Assert.assertEquals(result,"5.0");


    }

    @Test
    public void MultiplyTest(){

        MathsCommand mathsCommand = new MathsCommand();
        mathsCommand.setFirstOperand(5);
        mathsCommand.setSecondOperand(5);
        mathsCommand.setOperator("*");

        String result = mathsService.processMathsEquation(mathsCommand);

        Assert.assertEquals(result,"25.0");


    }

    @Test
    public void divideTest(){

        MathsCommand mathsCommand = new MathsCommand();
        mathsCommand.setFirstOperand(25);
        mathsCommand.setSecondOperand(5);
        mathsCommand.setOperator("/");

        String result = mathsService.processMathsEquation(mathsCommand);

        Assert.assertEquals(result,"5.0");


    }
}
