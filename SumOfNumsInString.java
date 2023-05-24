import java.util.HashMap;
import java.util.Scanner;

public class SumOfNumsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases =sc.nextInt();

        HashMap <Integer, String> hm = new HashMap<>();

        for(int i = 0 ; i < cases ; i++){
            hm.put(i, sc.next());
        }

        sc.close();

        for(int i = 0 ; i < cases ; i++){
            int sum = 0;
            for(int j = 0 ; j < hm.get(i).length() ; j++){
                if(Character.isDigit(hm.get(i).charAt(j))){
                    sum = sum + Character.getNumericValue(hm.get(i).charAt(j));
                }
            }
            System.out.println(sum);
        }
    }
}
