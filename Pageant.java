import java.util.Scanner;

public class Pageant{
    public static void main(String[] args){
        Contestant[] contestants = new Contestant[5]; //Array of 5 contestant objects (should be freed).
        Scanner sc = new Scanner(System.in); 
        boolean canSing = false; //If contestant can compete in singing.
        boolean isOld = false; 

        //Loops 5 times to input contestant information.
        for(int i = 0 ;i<contestants.length; i++){
            System.out.println("Please input name of contestant.");
            String n = sc.nextLine();
            System.out.println("Please input country of contestant.");
            String c = sc.nextLine();
            System.out.println("Please input age of contestant.");
            int a = sc.nextInt();
            sc.nextLine();
            contestants[i] = new Contestant(n,c,a);
        }

        //input 2 talents and input into contestant 1
        System.out.println("Please input talent 1 of contestant 1.");
        contestants[0].addTalent(sc.nextLine()); 
        System.out.println("Please input talent 2 of contestant 1.");
        contestants[0].addTalent(sc.nextLine());

        canSing = contestants[0].canCompete("singing");
        isOld = contestants[0].canCompete("singing", 25);
        boolean isQual = canSing && isOld;

        System.out.println("Can "+ contestants[0].getName() + " compete in singing and is old enough? : " + isQual);

        contestants = null;
        sc.close();
    }
}