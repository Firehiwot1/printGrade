 import java.util.Scanner;
  public class Grade {
      public static void main(String[]args){
          String confirmation="Y";
          Scanner fre= new Scanner (System. in);
          while (confirmation.equals("Y") ) {
              System.out.println("Enter an exam score: ");
              int score = Integer.parseInt(fre.next());


        if (score>100){
            System.out.println("Grade must be <=100 ");
        }
        else if (score>=97 ){
            System.out.println("Good job. Your grade is: A+");
        }
        else if (score>=94 ) {
                System.out.println("Good job. Your grade is: A");
        }
        else if (score>=90 ){
                 System.out.println("Good job. Your grade is: A-");
        }
        else if (score>=87 ){
            System.out.println("Good job. Your grade is: B+");
        }
        else if (score>=84 ){
            System.out.println("Good job. Your grade is: B");
        }
        else if (score>=80 ){
            System.out.println("Good job. Your grade is: B-");
        }
        else if (score>=77){
            System.out.println("Your grade is: C+");
        }
        else if (score>=74){
            System.out.println("Your grade is: C");
        }
        else if (score>=70){
            System.out.println("Your grade is: C-");
        }
        else if (score>=60 ){
            System.out.println("Your grade is: D");
        }
        else
            {System.out.println("Go back to School if you get below 60");}

             System.out.println("Do you want to enter another score (Y/N)? ");
            confirmation = fre.next();
        }

    }
}
