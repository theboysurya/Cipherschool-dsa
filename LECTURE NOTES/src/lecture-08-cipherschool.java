class Lec08 {
    public static void main(String[] args) {
        // FOR LOOP
        int i;
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("Final value of i after first for loop: " + i);
        System.out.println("*********************************");

        for (i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("Final value of i after second for loop: " + i);

        // WHILE LOOP
        int n = 5;
        while (n > 0) {
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop, n is: " + n);

        // DO-WHILE LOOP
        n = 5;
        do {
            System.out.println(n);
            n--;
        } while (n > 0);

        // WHILE LOOP with n starting at 0
        n = 0;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("After while loop with n = 0, n is: " + n);

        // DO-WHILE LOOP with n starting at 0
        n = 0;
        do {
            System.out.println(n);
            n--;
        } while (n > 0);
        System.out.println("After do-while loop with n = 0, n is: " + n);
    }
}
