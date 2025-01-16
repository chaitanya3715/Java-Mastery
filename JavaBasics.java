// basics of java

// class
class Car {
  String color;
  String model;

  // Constructor
  Car(String color, String model) {
      this.color = color;
      this.model = model;
  }

  void displayDetails() {
    System.out.println("Color: " + color + ", Model: " + model);
  } 
}


public class JavaBasics {

   // function 
    public static int add(int a, int b) {
      return a + b;
    }

    // main method
   public static void main(String[] args) {

      // Primitive data types
      int number = 10;       // Integer
      double price = 99.99;  // Decimal
      char grade = 'A';      // Single character
      String name = "Java";  // String
      boolean isJavaFun = true; // Boolean


      // if-else
      int age = 20;
      if (age >= 18) {
        System.out.println("Adult");
      } else {
        System.out.println("Not an adult");
      }

        
      // switch case
      int day = 3;
      switch (day) {
        case 1: System.out.println("Monday"); break;
        case 2: System.out.println("Tuesday"); break;
        default: System.out.println("Other day");
      }


      // For loop
      for (int i = 0; i < 5; i++) {
        System.out.println(i);
      }


      // While loop
      int count = 0;
      while (count < 5) {
        System.out.println(count);
        count++;
      }


      // Arrays
      int[] numbers = {1, 2, 3, 4};
      for (int num : numbers) {
        System.out.println(num);
      }


      // function call
      int sum = add(5, 3);
      System.out.println("Sum: " + sum);


      // Exception handling and try catch
      try {
        int result = 10 / 0;
      } catch (ArithmeticException e) {
        System.out.println("Error: Division by zero!");
      }

      // Object and class
      Car car1 = new Car("Red", "Sedan");
      car1.displayDetails();
      
  }
  
}
