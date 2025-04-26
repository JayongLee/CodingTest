    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.time.*;

    public class Main {
        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
            System.out.println(zonedDateTime.getYear());
            System.out.println(zonedDateTime.getMonthValue());
            System.out.println(zonedDateTime.getDayOfMonth());
        }
    }

