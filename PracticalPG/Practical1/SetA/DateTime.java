package PracticalPG.Practical1.SetA; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Basic components
        int year = today.getYear();
        int dayOfMonth = today.getDayOfMonth();
        int month = today.getMonthValue();
        String monthName = today.getMonth().name();
        String dayOfWeek = today.getDayOfWeek().name();
        int dayOfYear = today.getDayOfYear();

        // Week of year (locale-sensitive)
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekOfYear = today.get(weekFields.weekOfYear());

        // Formatted output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        String formatted = today.format(formatter);

        // Display all
        System.out.println("Year: " + year);
        System.out.println("Month: " + month + " (" + monthName + ")");
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Day of Year: " + dayOfYear);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Formatted: " + formatted);
    }
}

