package beszurorendezes;

import java.util.Random;

public class Teszt {
    
     public static void main(String[] args) {    
         Random rnd = new Random();
         int[] t = new int[30]; 
 
        for (int i = 0; i < t.length; i++) {             
            t[i] = rnd.nextInt(10);         
        } 
 
        printArray(t); 
 
        long timeStart = System.currentTimeMillis();         
        insertionSort(t);         
        long timeEnd = System.currentTimeMillis(); 
 
        printArray(t); 
 
        System.out.println(timeEnd - timeStart);     
     }
 
    static void printArray(int[] a) {         
        for (int i = 0; i < a.length; i++) {             
            System.out.print(a[i] + " ");         
        }         
        System.out.println();     
    } 
 
    static void insertionSort(int[] a) { 
        int aktualisElem;
        int j;
        for (int i = 1; i < a.length; i++) {
            aktualisElem = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > aktualisElem)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = aktualisElem;
        }
    }
}
