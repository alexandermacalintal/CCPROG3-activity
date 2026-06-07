public class Contestant{
    private String name; // Name of the contestant
    private String country; // Country of the contestant
    private String[] talents; // Array of talents (max 3)
    private int age;  // Age of the contestant

    // Constructor with name, country, and age
    public Contestant(String n, String c, int a)
    {
        name = n;
        country = c;
        age = a;
        talents = new String[3];
    }

    // Constructor with name and country only; age defaults to 18
    public Contestant(String n, String c)
    {
        name = n;
        country = c;
        age = 18;
        talents = new String[3];
    }

    // Returns the name of the contestant
    public String getName()
    {
        return name;
    }

    // Returns the country of the contestant
    public String getCountry()
    {
        return country;
    }

     // Adds a talent to the first available slot in the talents array
    public void addTalent(String t)
    {
        boolean added = false;
        // Loops through talents array until an empty slot is found
        for(int i = 0; i < talents.length && !added; i++)
            {
                if(talents[i] == null)
                {
                   talents[i] = t;    
                   added = true;
                }
            }
    }

    // Returns true if the contestant has the specified talent
    public boolean canCompete(String t)
    {
        for(int i=0; i < talents.length; i++)
        {
            if(talents[i] != null && talents[i].equals(t))
            {
                return true;
            }
        }
        return false;
    }

    // Returns true if the contestant has the specified talent and is within the max age
    public boolean canCompete(String t, int maxAge)
    {
        for(int i=0; i < talents.length; i++)
        {
            if(talents[i] != null && talents[i].equals(t) && age <= maxAge)
            {
                return true;
            }
        }
        return false;
    }

    // Returns true if the contestant meets the minimum age requirement
    public boolean canCompete(int minAge)
    {
        if(age >= minAge)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Returns a string representation of the contestant's name, country, and age
    public String toString()
    {
        return name + ", " + country + ", " + age;
    }
}