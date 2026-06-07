public class Contestant{
    private String name;
    private String country;
    private String[] talents;
    private int age;


    public Contestant(String n, String c, int a)
    {
        name = n;
        country = c;
        age = a;
        talents = new String[3];
    }
    public Contestant(String n, String c)
    {
        name = n;
        country = c;
        age = 18;
        talents = new String[3];
    }
    public String getName()
    {
        return name;
    }

    public String getCountry()
    {
        return country;
    }

    public void addTalent(String t)
    {
        boolean added = false;
        for(int i = 0; i < talents.length && !added; i++)
            {
                if(talents[i] == null)
                {
                   talents[i] = t;    
                   added = true;
                }
            }
    }

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

    public String toString()
    {
        return name + ", " + country + ", " + age;
    }
}