import java.util.*;

public class NRoundGame {
    public static void main(String[] args){
        List<Integer> power = Arrays.asList(3,2,3,1);
        int armor = 2;
        System.out.println(findHealth(power, armor));
    }

    public static long findHealth(List<Integer> power, int armor){
        int sum = 0;
        for(int a : power)
            sum += a;
        
        return sum - armor + 1;
    }
}
