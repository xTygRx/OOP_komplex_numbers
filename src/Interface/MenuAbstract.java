package Interface;

import Action.Action;
import Input.Input;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuAbstract {

    public void menu(){

        System.out.println();
        System.out.println("Выберите действие");
        System.out.println("Введите 1 для сложения");
        System.out.println("Введите 2 для умножения");
        System.out.println("Введите 3 для деления");
        System.out.println("Введите 4 для для ввода новой пары чисел");
        System.out.println("Введите 5 для выхода из программы");





        }
    public void choice(){
        Input input = new Input();
        input.inputComplexNumbers();


        Scanner scanner = new Scanner(System.in);
        Byte operation = 0;
        Action action = new Action();




        while (operation !=5){
            menu();
            operation = scanner.nextByte();

            if (operation > 5 || operation < 1) System.out.println("Неккоректно выбрано действие. Повторите выбор");
            switch (operation){
                case 1:
                    System.out.println(action.sum(input.complexNumbers));
                    break;


                case 2:
                    System.out.println(action.multi(input.complexNumbers));
                    break;

                case 3:
                    System.out.println(action.div(input.complexNumbers));
                    break;

                case 4:
                    input.inputComplexNumbers();

                    break;

                case 5:
                    System.out.println("Bye");
                    break;

            }


        }
        scanner.close();

    }
    }



