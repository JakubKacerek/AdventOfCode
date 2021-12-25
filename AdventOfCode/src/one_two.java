import java.util.ArrayList;
import java.util.Scanner;

public class one_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do{
            if(sc.hasNextInt()) {
                list.add(sc.nextInt());
            }else{
                break;
            }
        }while(true);
        System.out.println(hodnotyTrojic(list));
    }
    static int hodnotyTrojic(ArrayList<Integer> list){
        int sum = 0;
            do{
                for (int i = 3; i <= list.toArray().length-1; i++){
                    int pom1 = list.get(i) + list.get(i-1) + list.get(i-2);
                    int pom2 = list.get(i-1) + list.get(i-2) + list.get(i-3);
                    if (pom1 > pom2){
                        sum++;

                    }
                }
                break;
            }while(true);
        return sum;
    }
}