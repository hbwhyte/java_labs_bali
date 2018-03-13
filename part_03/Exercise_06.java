package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds / 60;

        // Get the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Get the total hours
        long totalHours = totalMinutes / 60;

        // Get the current hour
        long currentHour = (totalHours + timeZoneChange) % 24;
        long twelveHour = twelveHour(currentHour);

        // Display results using a 12 hour clock, include AM or PM
        System.out.println("The time is: " + (twelveHour((currentHour))< 10 ? "0" : "") + twelveHour(currentHour) +
                ":" + (currentMinute < 10 ? "0" : "") + currentMinute + ":" + (currentSecond < 10 ? "0" : "") +
               currentSecond + " " + amPm(currentHour,twelveHour) + " in GMT " + timeZoneChange);
    }

    public static long twelveHour(long currentHour){
        long twentyFourHour = currentHour;
        long twelveHour = 0;

        if (currentHour > 12) {
            twelveHour = currentHour - 12;
        } else {
            twelveHour = currentHour;
        }

        return twelveHour;
    }

    public static String amPm(long currentHour, long twelveHour) {
        String amPM = "AM";
        if (currentHour != twelveHour) {
            amPM = "PM";
        }
        return amPM;
    }

}
