package com.data_structure.Expressions;

import com.data_structure.Stack;

public class ExpressionConverter {
    Stack stack;

    public ExpressionConverter() {
        stack = new Stack();
    }

    public String infixToPostfix(String infix) {
        this.stack.makeEmpty();
        int index;
        StringBuilder postfix = new StringBuilder();
        for (index = 0; index < infix.length(); ++index) {
            char character = infix.charAt(index);
            if (this.isOperand(character)) {
                postfix.append(character);
            } else if (character == '(') {
                this.stack.push(character);
            } else if (character == ')') {
                while ((char)this.stack.getTopElement() != '(') {
                    postfix.append(this.stack.pop());
                }
                this.stack.pop();
            }

            else if (isOperator(character)) {
                if (this.stack.isEmpty() || (this.getPrecedence(character) > this.getPrecedence((char)this.stack.getTopElement()))) {
                    this.stack.push(character);
                } else {
                    char topOperator;
                    while (!this.stack.isEmpty() && this.getPrecedence(character) <= this.getPrecedence((char)this.stack.getTopElement())) {
                        topOperator = (char)this.stack.pop();
                        postfix.append(topOperator);
                    }
                    this.stack.push(character);
                }
            }
        }

        while (!this.stack.isEmpty()) {
            postfix.append(this.stack.pop());
        }

        return postfix.toString();
    }

    public float evaluatePostfix(String postfix) {
        this.stack.isEmpty();
        int index;
        for (index = 0; index < postfix.length(); ++index) {
            char character = postfix.charAt(index);
            if (this.isOperand(character)) {
                this.stack.push(Float.parseFloat(Character.toString(character)));
            } else { // in case it's an operator
                float operand2 = (float)this.stack.pop();
                float operand1 = (float)this.stack.pop();
                float result = this.applyOperator(operand1, operand2, character);
                this.stack.push(result);
            }
        }

        float finalResult = (float)this.stack.pop();
        return finalResult;
    }

    public float evaluateInfix(String infix) {
        return this.evaluatePostfix(this.infixToPostfix(infix));
    }

    public boolean isOperand(char character) {
        String operands = "0123456789";
        return operands.indexOf(character) != -1;
    }

    public boolean isOperator(char character) {
        String operators = "+-*/";
        return operators.indexOf(character) != -1;
    }

    public int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 0;
        } else if (operator == '*' || operator == '/') {
            return 1;
        } else {
            return -1; // for (
        }
    }

    public float applyOperator(float operand1, float operand2, char operator) {
        if (operator == '+') {
            return operand1 + operand2;
        }

        else if (operator == '-') {
            return operand1 - operand2;
        }

        else if (operator == '*') {
            return operand1 * operand2;

        }

        else { // it's / operator
            return operand1 / operand2;
        }
    }
}
