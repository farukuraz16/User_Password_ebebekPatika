import java.util.Scanner;

public class User_Password_ebebekPatika {
    public static void main(String[] args) {
        String passWord = "ebebek";
        Scanner dat = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String userEnt = dat.nextLine();

        if (passWord.equals(userEnt)) {
            System.out.println("\nyou are in!");
        } else {
            System.out.print("\nThe password is incorrect!\nDo you want to reset the password?\nif YES press -1- \nif NO press -2- \nAnswer ?: ");
            int choose = dat.nextInt();
            if (choose == 1) {
                System.out.print("Please enter new password: ");
                dat = new Scanner(System.in);
                String newPassWord = dat.nextLine();

                while (newPassWord.equals(passWord)) {
                    System.out.println("The new password can not be created. \nNew password must be different than old password.\nPlease try again.");
                    System.out.print("Please enter new password: ");
                    newPassWord = dat.nextLine();


                }
                System.out.println("Done!");
                passWord = newPassWord;

            } else if (choose == 2) {
                System.out.println("Have good day!");

            }


        }


    }

}
