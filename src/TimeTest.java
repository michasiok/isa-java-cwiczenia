public class TimeTest {
    public static void main(String[] args) {
        double myPoint = 30;
        double myTimeHour = 10;
        double myTimeMinutes = 20;
        Hemisphere myHemisphere = Hemisphere.EAST;
        double destPoint = 15;
        Hemisphere destHemisphere = Hemisphere.EAST;

        final int minutesPerDeg = 4;

        double minuteDiff = 0.0;

        if(myHemisphere != destHemisphere){
          destPoint *=-1;
        }

        if(myPoint>destPoint){
            minuteDiff = (destPoint - myPoint) * minutesPerDeg;
        } else {
            minuteDiff = (myPoint - destPoint) * minutesPerDeg;
        }

        double myMinutes = myTimeHour * 60 + myTimeMinutes;

        double destMinutes = 0.0;

        if(myHemisphere == Hemisphere.WEST){
            destMinutes = myMinutes - minuteDiff;
        }else{
            destMinutes = myMinutes + minuteDiff;
        }

        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;

        System.out.println("DEST: " + destTimeHour + "h " +destTimeMinutes + "min");
        }
    enum Hemisphere {
        WEST, EAST
        }
    }

