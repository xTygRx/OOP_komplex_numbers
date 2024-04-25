package Input;


import CorrectInput.CheckInput;

import java.util.ArrayList;

import java.util.Scanner;

public class Input {
    public ArrayList<String> getComplexNumbers() {
        return complexNumbers;
    }

    public ArrayList<String> complexNumbers = new ArrayList<String>(2);


    public void inputComplexNumbers(){
        Scanner scanner = new Scanner(System.in);
        ConvertInput convertInput = new ConvertInput();
        CheckInput checkInput = new CheckInput();
        for (int i = 1; i <= 2; i++){
            System.out.println("Введите " + i + " комплексное число: ");

            String input = convertInput.convertInput(scanner.nextLine());


            if (checkInput.checkNullInputComplex(input)){
                complexNumbers.add(input);

            }
            else {
                System.out.println("Повторите ввод");
                i--;
            }
        }












    }


}
