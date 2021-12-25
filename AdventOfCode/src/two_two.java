import java.util.*;

public class two_two {
    static int horizontal = 0;
    static int depth = 0;
    static int aim = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            String input = sc.nextLine();
            if (input.equals("end")){
                break;
            } else {
                inputJob(input);
            }
        }while(true);
        System.out.println(horizontal*depth);
    }
    static void inputJob(String input){
        String direction = input.substring(0, input.length() - 2);
        switch(direction){
            case "forward":
                horizontal = horizontal + cordsTools(input);
                depth = depth + aim * cordsTools(input);
                break;
            case "down":
                aim = aim + cordsTools(input);
                break;
            case "up":
                aim = aim - cordsTools(input);
                break;
        }
    }
    static int cordsTools(String input){
        String amount = input.substring(input.length()-1);
        int int_amount;
        return int_amount = Integer.parseInt(amount);
    }
}
