import java.util.*;

public class three_two {
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
        averageAmountGamma(list);

    }

    static void averageAmountGamma(ArrayList<String> list){
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
            if(list.size() == 1){
                System.out.println(list.get(0));
                break;
            }else if (jedna >= dva){
                for (int j = 0; j <= list.toArray().length-1; j++){
                    if (String.valueOf(list.get(j).charAt(i)).equals("0")){
                        list.remove(j);
                        System.out.println(list.size());
                        System.out.println(list.get(list.size()-1));
                    }
                }

            } else {
                for (int j = 0; j <= list.toArray().length-1; j++){
                    if (String.valueOf(list.get(j).charAt(i)).equals("1")){
                        list.remove(j);
                        System.out.println(list.size());
                        System.out.println(list.get(list.size()-1));
                    }
                }
            }
        }
    }
}

// 2536
// 1559
// 