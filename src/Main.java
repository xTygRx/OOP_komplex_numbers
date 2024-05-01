
import Interface.InterfaceReliz;




public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел");
        System.out.println("Введите комплексное число в алгебраической форме");
        System.out.println("Например 1+ 2i или 3 + i  или если коэффициент мнимой части равен 0, то введите только значимую часть - 3");

        InterfaceReliz interfaceReliz = new InterfaceReliz();
        interfaceReliz.choice();








    }
}