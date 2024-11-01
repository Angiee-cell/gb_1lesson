import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy г., время: hh ч. mm мин. ss сек.");
        System.out.println(formatter.format(LocalDateTime.now()));

    }
}
