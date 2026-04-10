import java.util.Scanner;

public class LOGIN {
    private String UserName;
    private String password;
    private String firstName;
    private String lastName;

    //Constructor
    public LOGIN(String UserName,String password, String firstName,String lastName){
        this.UserName=UserName;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    // method to attempt login
    public String loginUser(String enteredUserName,String enteredPassword){

        Scanner scanner=new Scanner(System.in);
        String userLogin;
        String passwordLogin;

        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.print("Please re-enter your username for testlogin: ");
            userLogin = scanner.next();
            System.out.print("Please re-enter your password for testlogin: ");
            passwordLogin = scanner.next();




            if (userLogin.equals(UserName) && passwordLogin.equals(password)) {
                System.out.println( "Welcome back "+" "+ this.firstName + " " + this.lastName + " " + "It is great to see you again.");

                loginSuccess = true;

            } else {
                System.out.println( "Username or Password incorrect.Please try again.");
            }
        }





        return enteredUserName;
    }
}
