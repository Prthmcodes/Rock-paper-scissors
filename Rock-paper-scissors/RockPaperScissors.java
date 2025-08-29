import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        int userScore = 0;
        int compScore = 0;
        int draws = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
        for(int round = 1; round<= 5; round++){
            int user = sc.nextInt();              // User's choice
        int comp = rand.nextInt(3);           // Computer's choice
        System.out.println("Enter your next call");
        System.out.println("Computer chose: " + comp);
          if (user == comp) {
            draws++;
            System.out.println("Draw!");
           } 
           else if ((user == 0 && comp == 2) ||
                   (user == 1 && comp == 0) ||
                   (user == 2 && comp == 1)) {
                       userScore++;
            System.out.println("You Win!");
           } else {
            compScore++;
            System.out.println("You Lose!");
          }
       }
       
        if(userScore>compScore){
        System.out.println("You are the Overall WINNER");
        }
        else if(userScore<compScore){
        System.out.println(" 💻 Computer is the Overall WINNER, and you are the Overall LOSER! 😂");
        }
        else{
        System.out.println("It's an Overall Draw! Both of you are equally good... or bad 😅");
        } 
        
    System.out.println("Thanks for playing the game with me,cheers");
    sc.close();
}
}