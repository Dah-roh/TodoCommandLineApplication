import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends CommandLineServiceImpl{
    public static void main(String[] args) {

        String errorMessage = "Input a valid command!";
        List<String> todoList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Main mainInstance = new Main();
        String inputString = "";


        while(!inputString.equalsIgnoreCase("close")){
        mainInstance
                .basicDisplayImplementation(todoList);
        inputString = input.nextLine();

        if (inputString.toUpperCase().contains("COMPLETE")||inputString.toUpperCase().contains("DELETE")){
            String[] command = inputString.split(" ");
            mainInstance
                    .performCommands(command,
                    todoList,
                    errorMessage);
            continue;
        }
        if (inputString.isBlank()){
            continue;
        }
        todoList.add(inputString.toUpperCase());
        }
    }
}
