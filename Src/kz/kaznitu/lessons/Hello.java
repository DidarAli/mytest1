package kz.kaznitu.lessons;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Бұл зертханалық жұмыстың мақсаты:");
        System.out.println("GitHub-пен жұмыс жасап үйренуу.");
        int a=MyMath.kvadrat(5);
        int b=MyMath.kub(5);
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println(MyMath.max3(8,9,12));
        System.out.println(MyMath.isEven(12));
        System.out.println(MyMath.isEven(7));
        System.out.println("max = " + MyMath.max3(8,9,12));
        System.out.println("min = " + MyMath.min3(12,8,15));
        System.out.println(MyMath.max3(8,9,12));
        System.out.println(MyMath.isEven(12));
        System.out.println(MyMath.isEven(7));

    }
}