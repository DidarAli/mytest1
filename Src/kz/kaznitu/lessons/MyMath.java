package kz.kaznitu.lessons;

public class MyMath {
    public static int kvadrat(int a){
        return a*a;
    }
    public static int kub(int a){
        return a*a*a;}
        public static boolean isEven(int a){
            return (a % 2==0);
    }
        public static int max(int a, int b){
            if (a >= b)
                return a;
        else
            return b;
    }
    public static int min(int a, int b){
         if (a >= b)
             return b;
       else
           return a;
    }
}
