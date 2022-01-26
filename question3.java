public class question3
{
    public static void main(String args[])
    {
        double totalMilliseconds = System.currentTimeMillis();
        double totalSeconds = totalMilliseconds/1000;
        double totalMinutes = totalSeconds/60;
        double totalHours = totalMinutes/60;
        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;
        totalHours = totalHours % 24;
        totalHours = totalHours - 1;
        System.out.printf("Current time is %.0f:%.0f:%.0f GMT \n", totalHours,totalMinutes,totalSeconds);
    
    }
}