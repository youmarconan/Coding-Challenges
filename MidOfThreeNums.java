import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MidOfThreeNums {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numOfTriples =sc.nextInt();

        HashMap <Integer, int[]> hm = new HashMap<>();

        for(int i = 0 ; i < numOfTriples ; i++){

            hm.put(i, new int[3]);

            for(int j = 0 ; j < 3 ; j++){
                hm.get(i)[j] = sc.nextInt();
            }

            Arrays.sort(hm.get(i));

        }

        for(int i = 0 ; i < numOfTriples ; i++){
            System.out.println(hm.get(i)[1]);
        }
        
        sc.close();
    
    }
}
