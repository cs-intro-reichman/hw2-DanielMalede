public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = (int) Integer.parseInt("" + args[0].charAt(0) + "" + args[0].charAt(1));
        int minute = (int) Integer.parseInt("" + args[0].charAt(3) + "" + args[0].charAt(4));
        int minutesAdd = (int) Integer.parseInt(args[1]);
        int totalTime = (hours * 60) + minute + minutesAdd;
        int dividedHour = totalTime / 60;
        int moduleDividedHour = hours <=12 ? dividedHour % 24 : hours;
        // variable for minutes 
        int newMinutes = totalTime - (dividedHour * 60);
        System.out.println( moduleDividedHour+ ":" +newMinutes);
        // System.out.println(hours * 60 + " " + minute + " " +minutesAdd);

    }
}
