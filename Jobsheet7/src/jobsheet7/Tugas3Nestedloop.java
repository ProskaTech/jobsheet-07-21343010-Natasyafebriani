/*
Created By-21343010-Natasya febriani
 */
package jobsheet7;

import java.util.Scanner;

public class Tugas3Nestedloop {
    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        System.out.print("Baris maks: ");
        int max = in.nextInt();
                
        int i, j;
        
        for (i = 1; i <= max; i++){
            for (j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
		}
	}
}