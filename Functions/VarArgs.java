import java.util.Arrays; 

public class VarArgs {
    public static void main(String[] args) {
        
        fun(2, 3, 4, 5, 6);
        // Calling varargs method with fixed parameters + String varargs
        multiple(2, 3, "Sonal", "Parashar");

        fun();
    }

    // int... v means "zero or more integers" (varargs are treated like an array inside the method)
    static void fun(int... v) 
    {
       // Convert array to string for display
        System.out.println(Arrays.toString(v)); 
    }

    static void multiple(int a, int b, String... v)
     {
        // Printing the fixed parameters and then the array of Strings
        System.out.println(a + ", " + b + " -> " + Arrays.toString(v));
    }
}

