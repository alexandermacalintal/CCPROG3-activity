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
        if(talents.size()<talents.length)
        {
            talents[talents.size] = t;
        }
    }

    public boolean canCompete(String t)
    {
        for(int i=0; i < talents.size; i++)
        {
            if(talents[i].equalsTo(t))
            {
                return true;
            }
        }
        return false;
    }

    public boolean canCompete(String t, int maxAge)
    {
        for(int i=0; i < talents.size; i++)
        {
            if(talents[i].equalsTo(t) && age <= maxAge)
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