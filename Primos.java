class Primos { 

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }
            if (counter == 2) {
                System.out.println("The number: " + i + " is prime");
            }
        }

    }
}