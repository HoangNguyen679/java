import java.util.Arrays;

/**
 * Created by hoang on 06/02/2017.
 */

public class Arithmetic {
    public static void main(String args[]){
        int data[] = {78,65,78,21,93,45,33,55,22,81};
        int sum = Arrays.stream(data).sum();
        float average = sum/(float)data.length;

        System.out.println("Sum: " + sum);
        System.out.printf("Average: " + average);

        /*

        for(int i:data)
        sum += i;

        */
    }
}
