import java.util.LinkedList;

public class LinkedListsIntersection{

    public static Object intersection(LinkedList<Object> a, LinkedList<Object> b){

        for(Object i : a){
            for(Object j : b){
                if(i == j){
                    return i;
                }
            }
        }

        return null;
    }

}