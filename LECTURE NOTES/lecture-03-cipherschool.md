```
class lecture3 {
    public static void main(String args[]) {
        int a = 5;
        int b = 6;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

        byte c = 10;
        System.out.println("Value of c is: " + c);

        int d = c; // byte to int
        System.out.println("Value of d is: " + d);

        byte c2 = (byte) 129; // int to byte
        System.out.println("c2 is: " + c2); // Result of narrowing conversion

        byte c3 = (byte) 256; // int to byte
        System.out.println("c3 is: " + c3); // Result of narrowing conversion
    }
}
```
```angular2html
output

The value of a is: 5
The value of b is: 6
Value of c is: 10
Value of d is: 10
c2 is: -127
c3 is: 0

```