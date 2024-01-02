import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //System.out.println(factorial(-5));

        System.out.println(fibonacci(40));
        System.out.println(fibonacci2(40));


    }

    public static int factorial(int n){
        System.out.println("n = " + n);
        if (n < 2) return 1;
        return n*factorial(n-1);
    }
    public static ArrayList<Integer> fibonacci(int n){
        ArrayList<Integer> fibo = new ArrayList<>(Arrays.asList(0, 1));
        if(n<3) return fibo;
        return fillFibonacci(fibo, n);
    }
    private static ArrayList<Integer> fillFibonacci(ArrayList<Integer> fibo, int n){
        if(fibo.size() == n) return fibo;
        fibo.add(fibo.get(fibo.size()-1) + fibo.get(fibo.size()-2));
        return fillFibonacci(fibo, n);
    }
    public static long fibonacci2(long n){
        if(n<2) return n;
        return fibonacci2(n-1) + fibonacci2(n-2);
    }
}