import java.util.Scanner;

public class Pageant{
    public static void main(String[] args){
        Contestant[5] contestants;
        Scanner sc = Scanner(System.in);
        boolean canCompete = false;

        for(int i = 0 ;i<contestants.length; i++){
            System.out.println("Please input name of contestant.");
            String n = sc.next();
            System.out.println("Please input country of contestant.");
            String c = sc.next();
            System.out.println("Please input age of contestant.");
            int a = sc.nextInt();
            contestsants[i] = new Contestant(n,c,a);
        }
        //input 2 talents and input into contestant 0
        System.out.println("Please input talent 1 of contestant 1.");
        contestants[0].addTalent(sc.next()); 
        System.out.println("Please input talent 2 of contestant 2.");
        contestants[0].addTalent(sc.next());

        if(contestants[0].canCompete("singing")){
            canCompete = true;
        }

        if(contestants[0].canCompete())

        contestants = null;
        sc.close();
    }
}