import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.time.DayOfWeek;
public class date {
  
   public static String findDay( String inputDate) {
      LocalDate date = LocalDate.parse(inputDate,DateTimeFormatter.ofPattern("MM-dd-yy"));
      DayOfWeek dayOfWeek =date.getDayOfWeek();
      return dayOfWeek.toString();
    }

       public static void main(String[] args) throws IOException {
       System.out.println(findDay("08 05 2015"));
    }
}

