import java.util.Scanner;

public class Pageant{
    public static void main(String[] args){
        Contestant[] contestants = new Contestant[5]; //Array of 5 contestant objects (should be freed).
        Scanner sc = new Scanner(System.in); 
        boolean canCompete = false; //If contestant can compete in singing.

        //Loops 5 times to input contestant information.
        for(int i = 0 ;i<contestants.length; i++){
            System.out.println("Please input name of contestant.");
            String n = sc.next();
            System.out.println("Please input country of contestant.");
            String c = sc.next();
            System.out.println("Please input age of contestant.");
            int a = sc.nextInt();
            contestants[i] = new Contestant(n,c,a);
        }

        //input 2 talents and input into contestant 1
        System.out.println("Please input talent 1 of contestant 1.");
        contestants[0].addTalent(sc.next()); 
        System.out.println("Please input talent 2 of contestant 1.");
        contestants[0].addTalent(sc.next());

        if(contestants[0].canCompete("singing")){
            canCompete = true;
        }

        if(contestants[0].canCompete(25)){
            System.out.println("Can contestant 1 compete in singing : " + canCompete);
        }
        else{
            System.out.println("Contestant 1 is not old enough to compete in singing.");
        }

        contestants = null;
        sc.close();
    }
}