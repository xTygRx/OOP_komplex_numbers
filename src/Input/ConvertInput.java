package Input;

public class ConvertInput {
    private String temp;
    public String convertInput(String input){
        temp = input.replaceAll(" ", "");
        return temp;
    }
}
