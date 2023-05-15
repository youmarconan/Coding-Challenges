import java.util.LinkedList;

public class LoopDetection {
    
    public static Object detect(LinkedList<Object> list){

        for(int i = 0 ; i < list.size()-1 ; i ++){
            for(int j = i+1 ; j < list.size() ; j++){
                if(list.get(i) == list.get(j)){
                    return list.get(i);
                }
            }
        }
        return null;
    }
}
