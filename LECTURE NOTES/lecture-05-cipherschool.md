```
public class primitiveDT {
public static void main(String[] args) {

        float f1 = (float) 5.5; // Casting double to float
        float f2 = 5.5f;       // Directly initializing with a float literal
        
        double d = 10.5;
        
        char ch = 'a';
        
        System.out.println(ch);

        int m = 5;
        int n = m++; // Post-increment: n gets the value of m before increment, m is then incremented
        
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