package com.example.fullcalculator.util;

import java.util.Stack;

public class CalculatorUtil {
    public static String solveExpression(String expression) {
        System.out.println("Expression is " + expression);

        Stack<Double> values = new Stack<>();
        Stack<Character> operator = new Stack<>();
        try{
            char[] tokens = expression.toCharArray();
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i] == ' ')
                    continue;
                if (isNumber(tokens[i])) {
                    StringBuffer sbuf = new StringBuffer();
                    while (i < tokens.length && isNumber(tokens[i])) {
                        sbuf.append(tokens[i++]);
                    }
                    i--;
                    values.push(Double.parseDouble(sbuf.toString()));
                    System.out.println("Tokens" + tokens[i]);
                }
                if (isOperator(tokens[i])) {
                    while (!operator.empty() && hasPrecedence(tokens[i], operator.peek()))
                        values.push(applyOp(operator.pop(), values.pop(), values.pop()));
                    operator.push(tokens[i]);
                }
            }
            while (!operator.empty()) {
                values.push(applyOp(operator.pop(), values.pop(), values.pop()));
            }
            return values.pop().toString();
        }catch(Exception e){
            return  e.getMessage();
        }
    }

    private static double applyOp(Character operator, Double val1, Double val2) {
        switch (operator) {
            case '+':
                return val2 + val1;
            case '-':
                return val2 - val1;
            case '*':
                return val2 * val1;
            case '/':
                if (val1 == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return val2 / val1;
            case '%':
                return val2 % val1;
        }
        return 0;
    }

    private static boolean hasPrecedence(char op1, Character op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    private static boolean isNumber(char token) {
        return token >= '0' && token <= '9'|| token == '.';
    }

    private static boolean isOperator(char token) {
        return token == '+' || token == '-' || token == '*' || token == '/' || token == '%';
    }
}
