package Workshop;

class Calculator {
 
 public int add(int a, int b) {
     return a + b;
 }


 public int add(int a, int b, int c) {
     return a + b + c;
 }

 public double add(double a, double b) {
     return a + b;
 }

 public double add(double a, double b, double c) {
     return a + b + c;
 }

 public static void main(String[] args) {
     Calculator calc = new Calculator();

    
     int intSum = calc.add(5, 8);
     System.out.println("Sum of 5 and 8 (integers): " + intSum);

     int intTripleSum = calc.add(10, 15, 20);
     System.out.println("Sum of 10, 15, and 20 (integers): " + intTripleSum);

     double doubleSum = calc.add(3.5, 2.7);
     System.out.println("Sum of 3.5 and 2.7 (doubles): " + doubleSum);

     double doubleTripleSum = calc.add(1.1, 2.2, 3.3);
     System.out.println("Sum of 1.1, 2.2, and 3.3 (doubles): " + doubleTripleSum);
 }
}

