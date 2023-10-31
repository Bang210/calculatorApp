package com.ll;

class Calc {
    static String rgx;
    static int[] expInt = new int[2];
    static int run(String exp) {

        if (exp.startsWith("(")) {
            exp = String.valueOf(run(exp.substring(1, exp.length() - 1)));
        }


        if (exp.contains("-")) {
            assign(exp, "\\-");
            return expInt[0] - expInt[1];
        }

        else if (exp.contains("+")) {
            assign(exp, "\\+");
            return expInt[0] + expInt[1];
        }

        else if (exp.contains("*")) {
            assign(exp, "\\*");
            return expInt[0] * expInt[1];
        }

        else if (exp.contains("/")) {
            assign(exp, "/");
            return expInt[0] / expInt[1];
        }
        return Integer.parseInt(exp);
    }

    static int[] assign(String exp, String rgx) {
        String[] expString = exp.split(rgx);
        expInt[0] = Integer.parseInt(expString[0].strip());
        expInt[1] = Integer.parseInt(expString[1].strip());
        return expInt;
    }
}