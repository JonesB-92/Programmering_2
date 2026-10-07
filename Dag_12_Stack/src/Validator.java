public class Validator {
    //Opgave 3

    /**
     * Metoden skal ved brug af en stak validere, hvorvidt en
     * tekststreng indeholder parenteser, der passer sammen, og den skal understøtte (), {}, og []. For
     * metoden skal det f.eks. gælde at:
     * Følgende tekststreng returnerer true: (3+{5{99{*}}[23[{67}67]]})
     * Følgende tekststreng returnerer false: ({)}
     *
     * @param expression
     */
    public boolean validateBrackets(String expression) {
        // Smider alle de værdier, jeg vil tjekke ind i min stack.
        // Hver gang vi støder på åbenparentes, smider vi den i stack og tjekker om lukkeparentes matcher toppen af stacken,
        // når vi støder på sådan en
        StackI stack = new NodeStack();

        // Ekstrabetingelse for at hoppe ud af fori loopet asap.
        boolean validated = true;

        //Løb streng igennem som array
        for (int i = 0; i < expression.length() && validated; i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Hvis lukkeparentes som det første = false
                if (stack.isEmpty()) {
                    validated = false;
                }
                // Hvis ikke den første, sammenligner vi
                else if (ch == ')') {
                    if ((char) stack.peek() == '(') {
                        stack.pop();
                    }
                } else if (ch == '}') {
                    if ((char) stack.peek() == '{') {
                        stack.pop();
                    }
                } else if (ch == ']') {
                    if ((char) stack.peek() == '[') {
                        stack.pop();
                    }
                } else validated = false;
            }
        }
        if (!stack.isEmpty()) {
            validated = false;
        }
        return validated;
    }

    public boolean validateBracketsChat(String expression) {
        StackI stack = new NodeStack();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If it's an opening bracket, push it
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack empty, no matching opener — invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Otherwise check the top
                char top = (char) stack.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            // ignore all other characters
        }

        // valid only if stack is empty in the end
        return stack.isEmpty();
    }

}

