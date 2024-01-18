//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
float num1, num2, result;
int choice;
Scanner input = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divionn");
        System.out.println("5. Remainder");
        System.out.println("Enter your choice (1-5): ");
        choice = input.nextInt();
        if (choice>=1 && choice<=5) {
            System.out.println("Enter any two number: ");
            num1 = input.nextFloat();
            num2 = input.nextFloat();
            if(choice==1){
                result = num1+num2;
                //int result1 = (int)result;
                //System.out.println(result1);
            }
            else if (choice==2){
                result = num1-num2;
            }
            else if (choice==3){
                result = num1*num2;}
            else if (choice==4){
                result = num1 / num2;
            }
            else{
                    result = num1*num2;}
            System.out.println("Result = " + result);
        }else{
            System.out.println("invaid number");
        }

        }
    }
