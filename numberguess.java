import java.util.Random;
import java.util.Scanner;

class numberguess{
    static Scanner sc= new Scanner (System.in);
    public static void main(String args[]){
        random();

    }
 
static void random(){
    Random random = new Random();
    int ranval = random.nextInt(100);
    guesspart(ranval);
    
}

static void guesspart( int ranval){
    int count=1; 
    int score=100;
    System .out.println ("Welcome to Number guessing Game \nGuess the Number between 1 to 100:");
    for(int i=10; i>=0; i--){
        int val =sc.nextInt();
        if (val==ranval){
            System.out.println("You won " +" you have guessed the value in"+count+"The number is"+ranval);
            System.out.println("The Total Score is "+score);
            break;
        }

        else if(i==1){
            System.out.println("Limit has Reached");
            score= score-10;
            System.out.println("The Total Score is "+score);
            replay();
            break;
        }
       else if(val>ranval){
        System.out.println("High value reduce the guess number.");
        count++;
        score= score-10;


       }

       else if(val <ranval){
        System.out.println("Low Value increase the guess number.");
        count++;
        score= score-10;


       }

       System.out.println("The total Remaining of guess number" +  (i-1));
    }
}

static void replay(){
    System.out.println("want to Retry? (1= Yes|| 2= No):");

    int choice= sc.nextInt();
    if (choice==1)
    {
        random();
    }

    else if(choice==2){
        System.out.println("Thank you for Playing!!!");

    }
    else{
        replay();
    }

}

}

