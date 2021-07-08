import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch example = new StopWatch();
        System.out.println("Start coutn TimeMillis in:\t" + example.startTime);
        Scanner input = new Scanner(System.in);
        int confirm;
        do {
            System.out.println("Do you want to stop coutn TimeMillis? input 1 to stop; input 2 to resset");
            confirm = input.nextInt();
            if(confirm==2){
                example.start();
                System.out.println("\"Reset start coutn TimeMillis in:\t"+example.startTime);
            }
        } while (confirm != 1);
        example.stop();
        System.out.println("Total ElapsedTime is:\t" + example.getElapsedTime());
    }

    private long startTime, endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
