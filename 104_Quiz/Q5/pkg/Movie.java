package pkg;

public class Movie{
    double movieRating;
    String movieName;
    int numRatings;
    int revenue;
    public Movie()
    {
        movieName = "Avengers";
        movieRating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName,double movieRating,int numRatings, int revenue)
    {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString()
    {
        System.out.println("Name: " + movieName);
        System.out.println("Rating: " + movieRating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    
    public String getMovieName()
    {
        return this.movieName;
    }
    public int getRevenue()
    {
        return this.revenue;
    }
    public void addRating(double newRating)
    {
        numRatings++;
        movieRating = (movieRating*(numRatings-1) + newRating)/numRatings;
    }
    public boolean compareRatings(Movie a)
    {
        if(this.movieRating > a.movieRating)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
