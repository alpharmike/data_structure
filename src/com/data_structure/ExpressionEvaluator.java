package com.data_structure;

public class ExpressionEvaluator {

    public ExpressionEvaluator() {

    }

    public boolean isAccepted(String expression) {
        Stack stack = new Stack();
        int index = 0;
        for (index = 0; index < expression.length(); ++index) {
            char currChar = expression.charAt(index);
            if (!isValid(currChar)) {
                return false;
            }

            else if (isOpeningChar(currChar)) {
                System.out.println(currChar);
                stack.push(currChar);
            } else if (isClosingChar(currChar)) {
                Character latestChar = (Character) stack.pop();
//                System.out.println(latestChar + " " + currChar);
                if (latestChar == null || !isMatched(latestChar, currChar)) {
                    System.out.println(latestChar + " " + currChar);
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isMatched(char openCharacter, char closeCharacter) {
        return (openCharacter == '(' && closeCharacter == ')') || (openCharacter == '{' && closeCharacter == '}') || (openCharacter == '[' && closeCharacter == ']');
    }

    public boolean isValid(char character) {
        String validChars = "(){}[]";

        return validChars.indexOf(character) != -1;
    }

    public boolean isOpeningChar(char character) {
        return character == '(' || character == '{' || character == '[';
    }

    public boolean isClosingChar(char character) {
        return character == ')' || character == '}' || character == ']';
    }


}
