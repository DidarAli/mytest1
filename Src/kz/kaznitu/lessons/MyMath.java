package kz.kaznitu.lessons;

import org.jetbrains.annotations.Contract;

public class MyMath {
    @Contract(pure = true)
    public static int kvadrat(int a){
        return a*a;
    }
    @Contract(pure = true)
    public static int kub(int a){
        return a*a*a;
    }
}
