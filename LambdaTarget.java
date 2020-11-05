//Variable declaration
//        Assignment
//        Return statement
//        Array initializer
//        Method or constructor arguments
//        Lambda body
//        Ternary conditional expression
//        Cast expression
package lambdaexpressions;
import java.awt.EventQueue;

import java.security.AccessController;
import java.security.PrivilegedAction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.concurrent.Callable;

public class LambdaTarget
{
    public static void main(String[] args) throws Exception
    {
        // Target type: variable declaration
        Runnable r = () -> { for (int i = 0; i < 5; i++)
            System.out.println(i); };
        r.run();

        // Target type: assignment
        r = () -> System.out.println("running from assignment");
        r.run();

        // Target type: return statement
        EventQueue.invokeLater(getRunnable("I'm running from return statement (in getRunnable()) "));



        // Target type: array initializer
        Callable<String>[] callables = new Callable[]
                {
                        () -> "First callable",
                        () -> "Second callable",
                        () -> "Third callable"
                };
        System.out.println(callables[1].call());


        // Target type: lambda body (a nested lambda)
        Callable<Runnable> callable = () -> () ->
                System.out.println("callable says hello");
        callable.call().run();

        // Target type: ternary conditional expression
        boolean ascendingSort = false;
        Comparator<String> cmp;
        cmp = (ascendingSort) ? (s1, s2) -> s1.compareTo(s2)
                : (s1, s2) -> s2.compareTo(s1);
        List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus",
                "Neptune");
        Collections.sort(planets, cmp);
        for (String planet: planets)
            System.out.println(planet);

        // Target type: cast expression
        String user = AccessController.doPrivileged((PrivilegedAction<String>) ()
                -> System.getProperty("user.name"));
        System.out.println(user);
    }

    static Runnable getRunnable(String s)
    {
        return () -> System.out.println(s);
    }
}