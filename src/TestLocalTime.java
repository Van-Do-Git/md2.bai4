import java.time.LocalTime;

public class TestLocalTime {
    private LocalTime localTime = LocalTime.now();

    public TestLocalTime() {

    }

    public LocalTime getTime() {
        return localTime;
    }

    public static void main(String[] args) {
        TestLocalTime time1 = new TestLocalTime();
        System.out.println(time1.getTime());
    }
}
