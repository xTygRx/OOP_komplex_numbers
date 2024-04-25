package Action;

import java.util.ArrayList;


public abstract class ActionAbstract {
    public String sum(ArrayList<String> list){
        double[] extrctComlex1 = new double[2];

        extrctComlex1 = extractValidMnemonicPart(list.getFirst().toLowerCase());
        double[] extrctComlex2 = new double[2];
        extrctComlex2 = extractValidMnemonicPart(list.getLast().toLowerCase());

        double resaultVar = (extrctComlex1[0] + extrctComlex2[0]);
        double resaultMnim = (extrctComlex1[1] + extrctComlex2[1]);

        if (resaultMnim >= 0) return String.format("Результат сложения двух комплесных чисел " + resaultVar + " + " + resaultMnim + "i");
        else return String.format("Результат сложения двух комплесных чисел " + resaultVar + " " + resaultMnim + "i");
    }
    public String multi(ArrayList<String> list){
        double[] extrctComlex1 = new double[2];

        extrctComlex1 = extractValidMnemonicPart(list.getFirst().toLowerCase());
        double[] extrctComlex2 = new double[2];
        extrctComlex2 = extractValidMnemonicPart(list.getLast().toLowerCase());

        double resaultVar = (extrctComlex1[0] * extrctComlex2[0]) - (extrctComlex1[1] * extrctComlex2[1]);
        double resaultMnim = (extrctComlex1[0] * extrctComlex2[1]) + (extrctComlex1[1] * extrctComlex2[0]);

        if (resaultMnim >= 0) return String.format("Результат умножения двух комплесных чисел " + resaultVar + " + " + resaultMnim + "i");
        else return String.format("Результат умножения двух комплесных чисел " + resaultVar + " " + resaultMnim + "i");


    }
    public String div(ArrayList<String> list){
        double[] extrctComlex1 = new double[2];

        extrctComlex1 = extractValidMnemonicPart(list.getFirst().toLowerCase());
        double[] extrctComlex2 = new double[2];
        extrctComlex2 = extractValidMnemonicPart(list.getLast().toLowerCase());

        double resaultVar = (extrctComlex1[0] * extrctComlex2[0]) + (extrctComlex1[1] * extrctComlex2[1]);
        double resaultMnim = (extrctComlex1[1] * extrctComlex2[0]) - (extrctComlex1[0] * extrctComlex2[1]);

        double temp = (Math.pow(extrctComlex2[0], 2) + Math.pow(extrctComlex2[1], 2));

        if (resaultMnim >= 0) return String.format("Результат деления двух комплесных чисел (" + resaultVar + " + " + resaultMnim + "i) / "  + temp);
        else return String.format("Результат деления двух комплесных чисел (" + resaultVar + " " + resaultMnim + "i) / " + temp);


    }
    private static double[] extractValidMnemonicPart(String temp) {
        double[] resault = new double[2];
        if (temp.contains("+")) {

            String tempD1 = temp.substring(0, temp.indexOf('+'));
            resault[0] = Double.parseDouble(tempD1);

            String tempM = temp.substring(temp.indexOf("+")+1, temp.length() - 1);
            if (tempM.equals("")) resault[1] = 1;
            else resault[1] = Double.parseDouble(tempM);
            return resault;
        }
        else if (temp.contains(("-")) && temp.lastIndexOf("-") != 0){

            String tempD1 = temp.substring(0, temp.lastIndexOf("-"));
            resault[0] = Double.parseDouble(tempD1);
            String tempM = temp.substring(temp.lastIndexOf("-"), temp.length() - 1);
            if (tempM.equals("-")) resault[1] = -1;
            else resault[1] = Double.parseDouble(tempM);
            return resault;
        }
        else if (temp.contains("-") && !temp.contains("i")){

            resault[0] = Double.parseDouble(temp);
            resault[1] = 0;
            return resault;
        }
        else if (temp.equals("-i")){

            resault[0] = 0;
            resault[1] = -1;
            return resault;
        }
        else if (temp.equals("i")){

            resault[0] = 0;
            resault[1] = 1;
            return resault;
        }

        else if (temp.contains("-") && temp.length() >= 2){

            resault[0] = 0;
            resault[1] = Double.parseDouble(temp.substring(0, temp.length()-1));
            return resault;
        }

        else if (!temp.contains("-") && temp.length() >= 2){

            resault[0] = 0;
            resault[1] = Double.parseDouble(temp.substring(0, temp.length()-1));
            return resault;
        }

        else {

            resault[0] = Double.parseDouble(temp);
            resault[1] = 0;
            return resault;
        }

    }

}

