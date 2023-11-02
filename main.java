import java.util.Scanner; //Importing scanner class from util package to take user input

//Main Execution of program starts here
public static void main(String args[]) {
    //Object of Scanner class
  Scanner sc = new Scanner();
  String str1 = sc.next();
  String str2 = sc.next();

  String resultantString = str1 + str2;
  System.out.print(resultantString);
}
