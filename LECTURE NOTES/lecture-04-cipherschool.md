```
public class primitiveDT {
public static void main(String[] args) {

        // Declaration and initialization of float variables
        float f1 = (float) 5.5; // Casting double to float
        float f2 = 5.5f;       // Directly initializing with a float literal
        
        // Declaration and initialization of a double variable
        double d = 10.5;
        
        // Declaration and initialization of a char variable
        char ch = 'a';
        
        // Printing the char variable
        System.out.println(ch);

        // Increment example
        int m = 5;
        int n = m++; // Post-increment: n gets the value of m before increment, m is then incremented
        
        // Printing the values of m and n
        System.out.println("m value is: " + m); // m is now 6
        System.out.println("n value is: " + n); // n is 5 (the original value of m)
    }
}
```

```
Output
a
m value is: 6
n value is: 5
```