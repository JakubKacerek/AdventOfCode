import java.util.*;

public class two_one {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                inputJob(input);
            }
        } while (true);
        System.out.println(x * y);
    }

    static void inputJob(String input) {
        String direction = input.substring(0, input.length() - 2);
        switch (direction) {
            case "forward":
                x = x + cordsTools(input);
                break;
            case "down":
                y = y + cordsTools(input);
                break;
            case "up":
                y = y - cordsTools(input);
                break;
        }
    }

    static int cordsTools(String input) {
        String amount = input.substring(input.length() - 1);
        int int_amount;
        return int_amount = Integer.parseInt(amount);
    }
}
