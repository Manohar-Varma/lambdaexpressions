package lambdaexpressions;


import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface  //It is optional
interface Drawable{
//    int width = 15;
    public void draw();
    static void run(){
        System.out.println("This is static method");
    };
}
public class Draw {
    public static void main(String[] args) {
//        AtomicInteger width = new AtomicInteger();
     int width = 0;
//
//        Drawable d=new Drawable(){
//            public void draw(){System.out.println("Drawing "+width);}
//        };
//        d.draw();

        //with lambda

        Drawable d2=()->{
//          width.set(10);
//            width = 10;
            int x = 5;
            x = 10;

            for (int i =0; i<=1;i++){
                System.out.println("g");
            }
            System.out.println("Drawing "+width + x);
        };
        d2.draw();


 //      width = 12;
        System.out.println(width);
//
//
//        Drawable d2=()->{
//            System.out.println("Drawing "+width);
//        };
//        d2.draw();
//



    }
}



