package lecture01;
import java.util.Scanner;

public class kadai1_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("age:");
        int age = input.nextInt();

        if(0 <= age && age < 20){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }
        else if(age >= 20){
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
        else{
            System.out.println("Error");
        }
    }
}
