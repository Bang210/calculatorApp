package com.ll;

class Calc {
    static int run(String exp) {
        String rgx;
        int[] expInt = new int[2];

        if (exp.contains("-")) {
            rgx = "\\-";
            String[] expString = exp.split(rgx);
            expInt[0] = Integer.parseInt(expString[0].strip());
            expInt[1] = Integer.parseInt(expString[1].strip());
            return expInt[0] - expInt[1];
        }

        else if (exp.contains("+")) {
            rgx = "\\+";
            String[] expString = exp.split(rgx);
            expInt[0] = Integer.parseInt(expString[0].strip());
            expInt[1] = Integer.parseInt(expString[1].strip());
            return expInt[0] + expInt[1];
        }

        else if (exp.contains("*")) {
            rgx = "\\*";
            String[] expString = exp.split(rgx);
            expInt[0] = Integer.parseInt(expString[0].strip());
            expInt[1] = Integer.parseInt(expString[1].strip());
            return expInt[0] * expInt[1];
        }

        else if (exp.contains("/")) {
            rgx = "/";
            String[] expString = exp.split(rgx);
            expInt[0] = Integer.parseInt(expString[0].strip());
            expInt[1] = Integer.parseInt(expString[1].strip());
            return expInt[0] / expInt[1];
        }
        return 0;
    }
}