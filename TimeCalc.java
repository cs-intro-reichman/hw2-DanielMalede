public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + "" + args[0].charAt(1));
        int minute = Integer.parseInt("" + args[0].charAt(3) + "" + args[0].charAt(4));
        int minutesAdd = Integer.parseInt(args[1]);
        // calculate hours and minutes
        int totalTime = (hours * 60) + minute + minutesAdd;
        int dividedHour = totalTime / 60;
        int moduleDividedHour = dividedHour % 24;
        int newMinutes = totalTime - (dividedHour * 60);
        // Final variable for minutes and Hours
        String minuteString = newMinutes < 10 ? "0" + newMinutes : "" + newMinutes;
        String hourString = moduleDividedHour < 10 ? "0" + moduleDividedHour : "" + moduleDividedHour;

        System.out.println(hourString + ":" + minuteString);

    }
}
