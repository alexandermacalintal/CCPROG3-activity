/** Movie is the class created to represent an online movie
 * @author Alexander Jacob Macalintal
 * @author Aaron Jacob Espinosa
 * @version 1.0
 * @since 2026-06-14
 */
public class Movie{
    /** The title of the movie. Cannot be changed after instantiation. */
    private final String TITLE;
    /** The genre of the movie. Must be one of the valid genres. */
    private String genre;
    /** Array of valid genre values. */
    private static final String[] VALIDGENRES = {"drama", "horror", "comedy", "biography","sci-fi", "action", "romance", "kids"};
    /** The year the movie was released */
    private int year;
    /** Array of actor names. Holds at most 5 actors. */
    private String actors[];
    /** The number of times this movie has been rented. */
    private int numRented;
    /** Total number of Movie objects created. */
    private static int movieCount;

    /**
     * Constructs a Movie with a title, genre, and year released.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie; defaults to comedy if invalid
     * @param year  the year the movie was released
     */
    public Movie(String title, String genre, int year)
    {
        TITLE = title;
        this.genre = "comedy";
        for(int i=0; i<VALIDGENRES.length; i++)
        {
            if(genre.equals(VALIDGENRES[i]))
            {
                this.genre = genre;
            }
        }
        this.year = year;
        actors = new String[5];
        numRented = 0;
        movieCount++;

    }

    /**
     * Constructs a Movie with a title and genre.
     * Year released defaults to 2020.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie; defaults to comedy if invalid
     */
    public Movie(String title, String genre)
    {
        this(title,genre,2020);
    }

    /**
     *  Constructs a Movie with a title, genre, and one actor.
     *  Year released defaults to 2020.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie; defaults to comedy if invalid
     * @param actor the name of one actor to add
     */
    public Movie(String title, String genre, String actor)
    {
        this(title, genre, 2020);
        this.actors[0] = actor;
    }

    /**
     * Constructs a Movie with a title and year released.
     * Genre defaults to comedy.
     *
     * @param title the title of the movie
     * @param year  the year the movie was released
     */
    public Movie(String title, int year)
    {
        this(title, "comedy", year);
    }
    
    /**
     * Returns the title of the movie
     * @return the movie title
     */
    public String getTitle()
    {
        return TITLE;
    }

    /** 
     * Returns the genre of the movie
     * @return the movie genre
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Returns the year the movie was released
     * @return the year released
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns the array of actors in the movie.
     * @return the actors array
     */
    public String[] getActors()
    {
        return actors;
    }

    /**
     * Returns the number of times this movie has been rented.
     * @return the rental count
     */
    public int getNumRented()
    {
        return numRented;
    }
    
    /**
     * Returns the total number of Movie objects that have been instantiated.
     * @return the total movie count
     */
    public static int getMovieCount()
    {
        return movieCount;
    }

    /**
     * Sets the genre of the movie.
     * If the given genre is invalid, the current genre is retained.
     *
     * @param genre the new genre to assign
     */
    public void setGenre(String genre)
    {
        for(int i=0; i<VALIDGENRES.length; i++)
        {
            if(genre.equals(VALIDGENRES[i]))
            {
                this.genre = genre;
            }
        }
    }

    /**
     * Sets the year the movie was released.
     *
     * @param year the new year released
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Adds an actor to the movie's actor list.
     * Fails if the actor array is already full (5 actors).
     *
     * @param actor the name of the actor to add
     * @return true if the actor was added successfully, false if the array is full
     */
    public boolean addActor(String actor)
    {
        for(int i =0; i < actors.length;i++)
        {
            if(actors[i] == null)
            {
                actors[i] = actor;
                return true;
            }
        }
        return false;
    }

    /**
     * Increments the rental count for this movie by 1.
     */
    public void rent()
    {
        numRented++;
    }

    /**
     * Determines whether this movie is a blockbuster.
     * A movie is a blockbuster if it has been rented at least 10,000 times.
     *
     * @return true if the movie has been rented 10,000 or more times, false otherwise
     */
    public boolean isBlockbuster()
    {
        return numRented >= 10000;
    }

    /**
     * Decrements the total number of Movie objects.
     * Should be called when a Movie object is deleted.
     */
    public static void decrement()
    {
        movieCount--;
    }

    /**
     * Returns a string representation of the movie containing
     * the title, year released, and genre.
     *
     * @return formatted string with title, year, and genre
     */
    @Override
    public String toString()
    {
        return "Title: " + TITLE + ", Year: " + year + ", Genre: " + genre;
    }

    /**
     * Compares this movie to another object for equality.
     * Two movies are equal if they share the same title, genre, and year released.
     *
     * @param obj the object to compare with
     * @return true if the title, genre, and year released are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        Movie movie = (Movie) obj;
        if(movie == null) return false;
        return TITLE.equals(movie.TITLE) &&
        genre.equals(movie.genre) && year == movie.year;
    }


}