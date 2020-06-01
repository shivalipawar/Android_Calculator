package com.example.fullcalculator.util;


import com.example.fullcalculator.MainActivity;

import org.junit.Assert;
import org.junit.Test;

import static com.example.fullcalculator.util.CalculatorUtil.solveExpression;
import static org.junit.Assert.assertEquals;

public class CalculatorUtilTest {
    @Test
    public void doAdditionFor2SingleDigitInt() {
        assertEquals(solveExpression("1+2"), "3.0");
        assertEquals(solveExpression("9+2"), "11.0");
        assertEquals(solveExpression("8.1+2.2"), "10.3");
    }

    @Test
    public void doSubtractionFor2SingleDigitInt() {
        assertEquals(solveExpression("1-2"), "-1.0");
        assertEquals(solveExpression("9-2"), "7.0");
    }

    @Test
    public void doMultiplicationFor2SingleDigitInt() {
        assertEquals(solveExpression("1*2"), "2.0");
        assertEquals(solveExpression("7*6"), "42.0");
    }

    @Test
    public void doDivisionByZeroToReturnError() {
        assertEquals(solveExpression("2/0"), "Cannot divide by zero");
    }

    @Test
    public void doDivisionFor2SingleDigitInt() {
        assertEquals(solveExpression("4/2"), "2.0");
    }

    @Test
    public void doModulusFor2SingleDigitInt() {
        assertEquals(solveExpression("8%2"), "0.0");
        assertEquals(solveExpression("2%4"), "2.0");
    }

    @Test
    public void doAdditionFor2DigitInt() {
        assertEquals(solveExpression("62+57"), "119.0");
        assertEquals(solveExpression("12+96"), "108.0");
    }

    @Test
    public void doSubtractionFor2DigitInt() {
        assertEquals(solveExpression("77-15"), "62.0");
        assertEquals(solveExpression("100-115"), "-15.0");
    }

    @Test
    public void doMultiplicationFor2DigitInt() {
        assertEquals(solveExpression("84*2"), "168.0");
        assertEquals(solveExpression("100*15"), "1500.0");
    }

    @Test
    public void doDivisionFor2DigitInt() {
        assertEquals(solveExpression("84/2"), "42.0");
        assertEquals(solveExpression("100/5"), "20.0");
    }

    @Test
    public void doModulusFor2DigitInt() {
        assertEquals(solveExpression("84%2"), "0.0");
        assertEquals(solveExpression("29%4"), "1.0");
    }

    @Test
    public void doAddAndSubtract() {
        assertEquals(solveExpression("84+2-75"), "11.0");
        assertEquals(solveExpression("77-81+22"), "18.0");
    }

    @Test
    public void doMultiplyAndDivideAndMod() {
        assertEquals(solveExpression("84*2/7"), "24.0");
        assertEquals(solveExpression("77/81*22"), "20.91358024691358");
        assertEquals(solveExpression("77/81*22%3"), "2.913580246913579");
    }

    @Test
    public void doMultiplyOrDivideOrModFirstThenAdd() {
        assertEquals(solveExpression("10+20*30"), "610.0");
        assertEquals(solveExpression("93/52+22"), "23.78846153846154");
        assertEquals(solveExpression("33%26+0.1"), "7.1");
    }

    @Test
    public void doMultiplyOrDivideOrModFirstThenSubtract() {
        assertEquals(solveExpression("10-20*30"), "-590.0");
        assertEquals(solveExpression("93/52-22"), "-20.21153846153846");
        assertEquals(solveExpression("13%0.2-8"), "-7.800000000000001");
    }

    @Test
    public void doAllOperation() {
        assertEquals(solveExpression("44-27*59+221/3+5%2"), "-0.33333333333325754");
        assertEquals(solveExpression("8%2+55-22*38/21"), "15.19047619047619");
        assertEquals(solveExpression("15*3-39/76+34%2"), "0.4868421052631504");
    }
}