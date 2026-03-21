import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoul.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}