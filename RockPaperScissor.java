 
    import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("welcome in rok paper scissor game");
        System.out.println("select\n rok for 0\n paper for 1\n scissor for 2");
        System.out.print("enter number:");
        int x =sc.nextInt();
        int y = rand.nextInt(2);
       /* System.out.println(z);
        String 0 ="rok";
        String 1="paper";
        String 2 ="scissor";*/

        if(x==y){
            System.out.println("draw match\n because you and computer select the same number ");
        }
        else if (x==0&&y==1){
            System.out.println("\t\t you selected:rok \n \t\t\tand \n\t\tcomputer selected:paper\n\t\t you:loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }
        else if (x==0&&y==2){
            System.out.println("\t\tyou selected:rok \n \t\t\tand \n\t\tcomputer selected:scissor\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");


        }
        else if (x==1&&y==0){
            System.out.println("\t\t you selected:paper \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");


        }
        else if (x==1&&y==2){
            System.out.println("\t\t you selected:paper \n \t\t\tand \n\t\tcomputer selected:scissor\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }
        else if (x==2&&y==0){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");

        }
        else if (x==2&&y==1){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:paper\n\t\t you :win ");
            System.out.println("computer: loss");
            System.out.println("play again");
        }


        else if (x==2&&y==0){
            System.out.println("\t\t you selected:scissor \n \t\t\tand \n\t\tcomputer selected:rok\n\t\t you :loss ");
            System.out.println("computer: win");
            System.out.println("play again");


        }


        else{
            System.out.println("select the proper number between 0,1,2");
            System.out.println("play again");
        }




    }
}

