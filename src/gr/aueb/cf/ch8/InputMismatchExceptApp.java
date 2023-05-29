package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputnum;
        final int MAGIC_NUM = 12;

        while (true){
            try{
                System.out.println("Please insert a num");
                inputnum = in.nextInt();

                if (inputnum == MAGIC_NUM){
                    System.out.println("Great!");
                    break;
                }
            }catch (InputMismatchException e){
//                e.printStackTrace();
                in.nextLine();
                System.out.println("Error. Please insert an int");
            }
        }

        System.out.println("Thanks for using the Magic App");

    }
}
