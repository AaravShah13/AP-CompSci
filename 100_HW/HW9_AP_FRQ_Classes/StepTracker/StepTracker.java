public class StepTracker{
    int activeDays = 0;
    int days = 0;
    int stepsNeeded;
    int currentSteps = 0;
    public StepTracker(int stepsNeeded){
        this.stepsNeeded = stepsNeeded;
    }
    
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return currentSteps/days;
    }
    public int addDailySteps(int newSteps)
    {
        currentSteps = currentSteps+newSteps;
        days++;
        if(newSteps >= steps)
        {
            activeDays++;
        }
    }
}