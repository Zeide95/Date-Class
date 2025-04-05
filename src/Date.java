import java.time.LocalDate;
import static java.lang.Math.abs;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void updateDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Invalid date provided.");
        }
    }

    public String getDayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString(); // Например, "MONDAY"
    }

    public Object calculateDifference(Date otherDate) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate thatDate = LocalDate.of(otherDate.year, otherDate.month, otherDate.day);
        return abs(thisDate.toEpochDay() - thatDate.toEpochDay());
    }

    public String printDate() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getMonth().name() + " " + day + ", " + year;
    }

    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.day, other.day);
    }
}
