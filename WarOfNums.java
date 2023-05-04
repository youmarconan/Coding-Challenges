public class WarOfNums {

    public static int warOfNums(int[] arr){
        int even = 0;
        int odd = 0;

        for(int i:arr){
            if(i%2 == 0){
                even += i;
            }else{
                odd += i;
            }
        }
        return Math.abs(even-odd);
    }
}
