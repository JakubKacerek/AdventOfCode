import java.util.ArrayList;
import java.util.Scanner;

public class one_one {
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
        System.out.println(vetsiMensi(list));
    }
    static int vetsiMensi(ArrayList<Integer> list){
        int pomocna = 0;
        for (int i = 1; i <= list.toArray().length-1; i++){
            if (list.get(i)>list.get(i-1)){
                pomocna++;
            }
        }
        return pomocna;
    }
}
