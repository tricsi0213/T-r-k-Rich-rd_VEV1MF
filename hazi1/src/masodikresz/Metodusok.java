package masodikresz;

public class Metodusok {
    public static void novekvoSorrend(int x, int y, int z){
        int[] t = new int[3];
        t[0] = x;
        t[1] = y;
        t[2] = z;
        int tmp;
        boolean voltcsere = true;
        while(voltcsere)
        {
            voltcsere = false;
            for (int i = 0; i < t.length-1; i++) {
                   if(t[i] > t[i+1])
                   {
                       tmp = t[i];
                       t[i] = t[i+1];
                       t[i+1] = tmp;
                       voltcsere = true;
                   }
            }
        }
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public static void minMax(double x, double y, double z){
        double t[] = new double[3];
        t[0] = x;
        t[1] = y;
        t[2] = z;
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        for (int i = 0; i < t.length; i++) {
               if(Math.abs(t[i]) > max)
                   max = Math.abs(t[i]);
               if(t[i] < min)
                   min = t[i];
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
    
    public static void sorrendek(double a, double b, double c, double d){
        System.out.println(a + " " + b + " " + c + " " + d);
        if(d >= 0)
            System.out.println(a + " " + c + " " + b + " " + d);
        else
            System.out.println(a + " " + b + " " + d + " " + c);
    }
    
    public static boolean haromszog(double a, double b, double c){
        if(a < b+c && b < a+c && c < a+b)
            return true;
        return false;
    }
    
    public static int szokoEv(int ev1, int ev2){
        int tmp, szokoev =0;
        if(ev1 > ev2)
        {
            tmp = ev1;
            ev1 = ev2;
            ev2 = tmp;
        }
        for (int i = ev1; i <= ev2; i++) {
              if((i%4 == 0 && i%100 != 0) || i%400 == 0)
                  szokoev++;
        }
        return szokoev;
    }
    
    public static void erdemJegy(int jegy){
        switch(jegy){
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
            default:
                System.out.println("Nincs ilyen osztályzat!");
        }
    }
    
    public static int hanyados(int a, int b){
        int hanyados = 0;
        int tmp;
        if(a < b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        while(a >= b)
        {
            hanyados++;
            a = a-b;
        }
        return hanyados;
    }
    
    public static boolean prim_2(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    
    public static void fibonacci(int n){
        int a = 1;
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(b + " ");
            b = a+b;
            a = b-a;
        }
        System.out.println();
    }
    
    public static void forditottSzam(int n){
        int szam = 0;
        while(n != 0)
        {
            szam = szam * 10 + n%10;
            n = n/10;
        }
        System.out.println(szam);
    }
    
    public static int faktorialis(int n){
        int res =1;
        for (int i = 1; i <= n; i++) {
                 res *= i;       
        }
        return res;
    }
    
    public static void oszthatoSzamok(int n1, int n2, int k){
        int tmp;
        if(n1 > n2)
        {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        for (int i = n1+1; i < n2; i++) {
            if(i % k == 0)
                System.out.print(i + " ");            
        }
        System.out.println();
    }
    
    public static int fibonacciNagyobb(int n){
        int a = 1;
        int b = 0;
        while(n >= b) {
            b = a+b;
            a = b-a;
        }
        return b;
    }
    
    public static void egyenloSzamok(){
        int osszeg =0;
        int n;
        for (int i = 1; i < 1000; i++) {
            n = i;
            while(n != 0)
            {
                osszeg += Math.pow(n%10, 3);
                n = n/10;
            }
            if(osszeg == i)
                System.out.print(i + " ");
            osszeg = 0;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        egyenloSzamok();
    }
}
