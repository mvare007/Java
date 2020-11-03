public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int minutesToSeconds = minutes * 60;
            seconds += minutesToSeconds;
            int hours = seconds / 3600;
            int remainder = seconds % 3600;
            int calculatedMinutes = remainder / 60;
            int calculatedSeconds = remainder % 60;
            return hours + "h " + calculatedMinutes + "m " + calculatedSeconds + "s";
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int calculatedMinutes = seconds / 60;
            return getDurationString(calculatedMinutes, 0);
        } else {
            return "Invalid value";
        }
    }
}

