package Lab_05_Sorting_Searching_Java_Library;

public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareTo(Town other)
    {
        //compare this.population with other.population
        if (this.population < other.population) { return -1; }
        else if (this.population == other.population) { return 0; }
        else { return 1; }
    }

    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }



}


