import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) throws IOException {
        // task1();
        // cycle();
        // System.out.println(task6());
        task7();
    }


public static void task7() throws IOException {
    FileWriter fw = new FileWriter("output.txt");
    fw.write("Hello, world!");
    fw.flush();
    fw.close();
}


    public static String task6(){
        String s = "Добро пожаловать на курс Java";

        String[] split = s.split("\\s");

        String res = "";
        String s1 = "";

        for (int i = split.length - 1; i >= 0; i--) {
            s1 += res + split[i] + " ";
        }
        return s1;
    }


    public static void cycle(){
        while (true) {
            task2();
        }
    }

    public static void task2() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя: ");

        String name = sc.next();

        if(name.startsWith("q")) System.exit(0);
        if(name.startsWith("Al")){
            System.out.println("Are you Alex?");
        }
        else if(name.startsWith("B")){
            System.out.println("Are you Bob?");
        }
        else if(name.startsWith("C")){
            System.out.println("Are you Carol?");
        }
        else {
            System.out.println("Hello!");
        }

        System.out.println("Hello, " + name + "!");
    }

    private static void task1() {

        System.out.println("Hello, world!");
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy г., время: hh ч. mm мин. ss сек.");
        System.out.println(formatter.format(LocalDateTime.now()));
    
    }
}


