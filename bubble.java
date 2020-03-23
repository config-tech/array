import java.util.*;
import java.lang.*;
import java.io.*;
 
import java.util.Arrays;
 
class Three {
public static void main(String[] args) {
    int num[][] = {
            {20, 26, 32, 34, 26, 28, 22, 30, 17, 24},
            {30, 28, 18, 22, 24, 26, 34, 28, 22, 20},
            {34, 24, 28, 20, 32, 17, 22, 24, 26, 30},
            {30, 22, 26, 35, 28, 24, 30, 32, 28, 18},
            {20, 30, 17, 24, 32, 28, 22, 26, 24, 30},
            {34, 26, 24, 28, 22, 30, 35, 32, 20, 17},
            {28, 22, 36, 30, 20, 26, 28, 23, 24, 32},
            {20, 26, 30, 24, 32, 17, 22, 28, 35, 26},
            {28, 35, 32, 22, 26, 24, 26, 24, 30, 24},
            {18, 24, 26, 28, 35, 30, 26, 22, 26, 28}
            };
 
    int[] flat = new int[10 * 10];
 
    int ctr = 0;
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            flat[ctr++] = num[row][col];
        }
    }
    Arrays.sort(flat);
    ctr = 0;
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            num[row][col] = flat[ctr++];
        }
    }
    for(int row = 0; row<10; row++){
        for(int col = 0; col<10; col++){
            System.out.print(num[row][col] + " ");
        }
        System.out.println();
    }
}
}
