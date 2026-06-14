/**
 * Driver test class for Movie class
 * Includes functionality to track rentals, add actors, and monitor total movies created; Methods declared in Movie object.
 * @author: Espinosa, Aaron Jacob, 
 * @author: Macalintal, Alexander Jacob
 * @version: 1.0
 * @since: 2026-06-14
 * Section: S20C
 * Professor: LIM-CHENG, NATHALIE ROSE
 */
public class MovieDriver {
    public static void main(String[] args) {
        //1. Declare and instantiate an array of 5 Movie objects called mustWatch
        Movie[] mustWatch = new Movie[5];
        //2. Instantiate the first Movie object using the following information:
        //title = X-Men , genre = thriller, year = 2000
        mustWatch[0] = new Movie("X-Men", "thriller", 2000);
        //3. Instantiate the second Movie object using the following information:
        //title = Pokemon the movie , genre = kids
        mustWatch[1] = new Movie("Pokemon the movie", "kids");
        //4. Instantiate the third Movie object using the following information:
        //title = Thor , genre = action, actor = Chris Hemsworth
        mustWatch[2] = new Movie("Thor", "action", "Chris Hemsworth");
        //5. Instantiate the fourth Movie object using the following information:
        //title = Frozen 2, year = 2019
        mustWatch[3] = new Movie("Frozen 2", 2019);
        //6. *Display the total number of movies instantiated
        System.out.println("Total Number of Movies: " + Movie.getMovieCount());
        System.out.println();
        //7. Display the title, genre, and year of all movies in mustWatch
        for(int i = 0 ;i < mustWatch.length; i++){
            if(mustWatch[i] != null){
            System.out.println("Movie " + (i+1) + ":");
            System.out.println(mustWatch[i].toString());
            System.out.println();
            }
        }
        //8. Modify genre of first movie in mustWatch to sci-fi
        mustWatch[0].setGenre("sci-fi");
        //9. Modify genre of 4th movie in mustWatch to kids
        mustWatch[3].setGenre("kids");
        //10. Modify year released of second movie in mustWatch to 2019
        mustWatch[1].setYear(2019);
        //11. Modify year released of third movie in mustWatch to 2011
        mustWatch[2].setYear(2011);
        //12. Display the title, genre, and year of all movies in mustWatch
        for(int i = 0 ;i < mustWatch.length; i++){
            if(mustWatch[i] != null){
                System.out.println("Movie " + (i+1) + ":");
                System.out.println(mustWatch[i].toString());
                System.out.println();
            }
        }
        //13. Add Natalie Portman as another actor to the third movie stored in mustWatch
        mustWatch[2].addActor("Natalie Portman");
        //14. Add the following actors (in sequence) to the second movie stored in mustWatch:
        //Pikachu, Charizard, Squirtle, Ditto, Mewtwo, Psyduck
        mustWatch[1].addActor("Pikachu");
        mustWatch[1].addActor("Charizard");
        mustWatch[1].addActor("Squirtle");
        mustWatch[1].addActor("Ditto");
        mustWatch[1].addActor("Mewtwo");
        mustWatch[1].addActor("Psyduck");
        //15. Display all actors of the third movie stored in mustWatch
        String[] thirdMovieActors = mustWatch[2].getActors();
        int j = 0;
        System.out.println("Actors in " + mustWatch[2].getTitle() + ":");
        for(int i = 0; i < thirdMovieActors.length; i++){
            if(thirdMovieActors[i] != null){
                System.out.println("Actor " + (j+1) + ": " + thirdMovieActors[i]);
                j++;
            }
        }
        //16. Display all actors of the second movie stored in mustWatch
        String[] secondMovieActors = mustWatch[1].getActors();
        System.out.println();
        System.out.println("Actors in " + mustWatch[1].getTitle() + ":");
        j = 0;
        for(int i = 0; i < secondMovieActors.length; i++){
            if(secondMovieActors[i] != null){
                System.out.println("Actor " + (j+1) + ": " + secondMovieActors[i]);
                j++;
            }
        }
        //17. Declare and instantiate another array of at most 3 movies called myRental
        Movie[] myRental = new Movie[3];
        //18. Rent all movies that are in the genre of kids from mustWatch. These movies should now be
        //associated also to myRental
        j = 0;
        for(int i = 0; i < mustWatch.length; i++){
            if(mustWatch[i] != null && mustWatch[i].getGenre().equals("kids")){
                mustWatch[i].rent();
                myRental[j] = mustWatch[i]; //myRental is associated, so it stores the pointer and not a copy.
                j++;
            }
        }
        //19. *Display the total number of movies instantiated
        System.out.println();
        System.out.println("Total Number of Movies: " + Movie.getMovieCount());
        System.out.println();
        //20. Display the title, genre, and year of all movies in mustWatch 
        for(int i = 0 ;i < mustWatch.length; i++){
            if(mustWatch[i] != null){
                System.out.println("Movie " + (i+1) + ":");
                System.out.println(mustWatch[i].toString());
                System.out.println();
            }
        }
        //21. Display the title, genre, and year of all movies in myRental
        for(int i = 0 ;i < j; i++){
            System.out.println("Movie " + (i+1) + ":");
            System.out.println(myRental[i].toString());
            System.out.println();
        }
        //22. Rent the movie Frozen 2 again and store that as the last element to myRental
        mustWatch[3].rent();
        myRental[myRental.length - 1] = mustWatch[3];
        //23. Display the number of times the movie stored in the second element of myRental was rented
        //and display the result of isBlockBuster() for that movie
        System.out.println("Title: " + myRental[1].getTitle());
        System.out.println("Rented: " + myRental[1].getNumRented() + " Times");
        System.out.println("Is BlockBuster?: " + myRental[1].isBlockbuster());
        System.out.println();
        //24. Set myRental to null
        myRental = null;
        //25. Delete the movie object with title X-Men. 
        for(int i = 0; i < mustWatch.length; i++){
            if(mustWatch[i] != null && mustWatch[i].getTitle().equals("X-Men")){
                mustWatch[i] = null; //No longer referenced so java deletes it automatically
                Movie.decrement();
            }
        }
        //26. * Update the total number of movies instantiated. Display the total number of movies
        //instantiated

        System.out.println("Total Number of Movies: " + Movie.getMovieCount());
        System.out.println();
        //Not in specs but clean up memory.
        mustWatch = null;
        thirdMovieActors = null;
        secondMovieActors = null;
        System.gc();
    }
}