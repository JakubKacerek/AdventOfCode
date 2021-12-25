import java.util.*;

public class three_one {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            String input = sc.nextLine();
            if (input.equals("end")){
                break;
            } else {
                list.add(input);
            }
        }while(true);
        binaryToDecimal(list);
    }

    static ArrayList<Integer> averageAmountGamma(ArrayList<String> list){
        ArrayList<Integer> gamma = new ArrayList<>();
        for (int i = 0; i <= 11; i++){
            int jedna = 0, dva = 0;
            for (int j = 0; j <= list.toArray().length-1; j++){
                String number = list.get(j);
                char ch = number.charAt(i);
                if (String.valueOf(ch).equals("1")){
                    jedna++;
                }else{
                    dva++;
                }
            }
            if (jedna > dva){
                gamma.add(1);
            } else {
                gamma.add(0);
            }
        }
        return gamma;

    }
    static ArrayList<Integer> averageAmountEpsilon(ArrayList<String> list){
        ArrayList<Integer> epsilon = new ArrayList<>();
        for (int i = 0; i <= 11; i++){
            int jedna = 0, dva = 0;
            for (int j = 0; j <= list.toArray().length-1; j++){
                String number = list.get(j);
                char ch = number.charAt(i);
                if (String.valueOf(ch).equals("1")){
                    jedna++;
                }else{
                    dva++;
                }
            }
            if (jedna > dva){
                epsilon.add(0);
            } else {
                epsilon.add(1);
            }
        }
        return epsilon;

    }
    static void binaryToDecimal(ArrayList<String> list){
        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();
        for (int i = 0; i <= 11; i++){
            int number_gamma = averageAmountGamma(list).get(i);
            int number_epsilon = averageAmountEpsilon(list).get(i);
            output1.append(number_gamma+"");
            output2.append(number_epsilon+"");
        }
        System.out.println("Gamma amount in binary: "+output1.toString());
        System.out.println("Epsilon amount in binary: "+output2.toString());
        System.out.println("Gamma amount in decimal: "+Integer.parseInt(output1.toString(),2));
        System.out.println("Epsilon amount in decimal: "+Integer.parseInt(output2.toString(),2));
        System.out.println("Power consumption: "+Integer.parseInt(output1.toString(),2)*Integer.parseInt(output2.toString(),2));

    }


}
