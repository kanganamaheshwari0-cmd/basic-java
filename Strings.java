// class FirstClass {
//     public static void main(String args[]) {
//         System.out.println("Hello World");

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         System.out.print("Hello World With Java\nfrom\nthrone8");
//         // System.out.print("Hello World With Java");

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello kangana maheshwari");
//         System.out.print("Hello kangana maheshwari");
//     }
// }

//question 1

// public class Main {
//     public static void main(String[] args) { 
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
//     }
// }

//Variables

// public class Main {
//     public static void main(String[] args) {

//         int age = 21;
//         String name = "Kangana";
//         double marks = 85.5;
//         char grade = 'A';
//         boolean isPass = true;

//         System.out.println(age);
//         System.out.println(name);
//         System.out.println(marks);
//         System.out.println(grade);
//         System.out.println(isPass);
//     }
// }

// conditional statement if-else

//     public class Main {
//     public static void main(String[] args) {

//         int age = 20;

//         if (age >= 18) {
//             System.out.println("You are eligible");
//         }
//     }
// }

//if-else statement

// public class Main {
//     public static void main(String[] args) {

//         int number = 10;

//         if (number % 2 == 0) {
//             System.out.println("Even Number");
//         } else {
//             System.out.println("Odd Number");
//         }
//     }
// }

//else-if statement

// public class Main {
//     public static void main(String[] args) {

//         int marks = 75;

//         if (marks >= 90) {
//             System.out.println("Grade A");
//         }
//         else if (marks >= 70) {
//             System.out.println("Grade B");
//         }
//         else if (marks >= 50) {
//             System.out.println("Grade C");
//         }
//         else {
//             System.out.println("Fail");
//         }
//     }
// }

//Nested if

// public class Main {
//     public static void main(String[] args) {

//         int age = 20;
//         boolean hasID = true;

//         if (age >= 18) {
//             if (hasID) {
//                 System.out.println("Entry Allowed");
//             }
//         }
//     }
// }

//Loops in Java
//for loop

// public class Main {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }

//While loop

// public class Main {
//     public static void main(String[] args) {

//         int i = 1;

//         while (i <= 5) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//do-while loop

// public class Main {
//     public static void main(String[] args) {

//         int i = 1;

//         do {
//             System.out.println(i);
//             i++;
//         }
//         while (i <= 5);
//     }
// }

//for each loop

// public class Main {
//     public static void main(String[] args) {

//         int numbers[] = {10, 20, 30, 40};

//         for (int num : numbers) {
//             System.out.println(num);
//         }
//     }
// }

//functions
//Without parameter

// public class Main {

//     static void greet() {
//         System.out.println("Hello Java");
//     }

//     public static void main(String[] args) {
//         greet();
//     }
// }

//Method with parameters

// public class Main {

//     static void add(int a, int b) {
//         System.out.println(a + b);
//     }

//     public static void main(String[] args) {
//         add(10, 20);
//     }
// }

//Arrays

// public class Arrays {
//     public static void main(String args[]) {
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }

//Array with loop

// public class Arrays {
//     public static void main(String args[]) {
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;

//         for(int i=0; i<3; i++) {
//             System.out.println(marks[i]);
//         }

//     }
// }

//Strings

// import java.util.Scanner;

// public class Strings {
//     public static void main(String args[]) {
//         // String name = "kangana";
//         // String fullName = "Kangana maheshwari";
//         // String sentence = "My name is kangana mahehwari";
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("your name is : "+ name);

//    }
// }

//concatenation 

// public class Strings {
//     public static void main(String args[]) {
//         String firstName = "kangana";
//         String lastName = "maheshwari";
//         String fullName = firstName + "@" + lastName;
//         System.out.println(fullName.length());

//    }
// }

//charAt

public class Strings {
    public static void main(String args[]) {
        String firstName = "kangana";
        String lastName = "maheshwari";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

   }
}



















