
/**
 * A data class for the ClimbingClub program
 *
 * @author A Pittman
 * @version Nov 2020
 */
public class ClimbInfo
{
    private String peak = "";
    private int time = 0;
    
    /** Creates a ClimbInfo object with name peakName and time climbTime
     * @param peakName - The name of the mountain peak
     * @param climbTime - The number of minutes taken to complete the climb */
    public ClimbInfo(String peakName, int climbTime)
    {
        peak = peakName;
        time = climbTime;
    }

    /** 
     * @return the name of the mountain peak
     */
    public String getName()
    {
        return peak;
    }

    /** 
     * @return the number of minutes taken to complete the climb */
    public int getTime()
    {
        return time;
    }

}

