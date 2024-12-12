import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;
    int negativeNumber;
    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        /* implementation not shown */

    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        average = (newVal + (average + count)) / (count + 1);
        count++;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        for(int i = 0; i < num; i++)
        {
            negativeNumber = 0;
            double newRating = getNewRating();
            if(newRating >= 0)
            {
                updateAverage(newRating);
            }
            else
            {
                negativeNumber++;
            }
        }
        return negativeNumber;
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
