import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch example = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i]=(int) Math.round(Math.random()*99+1);
        }
        int temp = 0;
        example.start();
        System.out.println("Start agument selection sort in:\t" +example.startTime);
        for (int i = 0; i < 100000; i++) {
            for (int j = i; j <100000 ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        example.stop();
        System.out.println("Total times enforcement the agument sort is:\t"+example.getElapsedTime());
//        StopWatch example = new StopWatch();
//        System.out.println("Start coutn TimeMillis in:\t" + example.startTime);
//        Scanner input = new Scanner(System.in);
//        int confirm;
//        do {
//            System.out.println("Do you want to stop coutn TimeMillis? input 1 to stop; input 2 to resset");
//            confirm = input.nextInt();
//            if(confirm==2){
//                example.start();
//                System.out.println("\"Reset start coutn TimeMillis in:\t"+example.startTime);
//            }
//        } while (confirm != 1);
//        example.stop();
//        System.out.println("Total ElapsedTime is:\t" + example.getElapsedTime());
    }

    private long startTime, endTime;

    public StopWatch() {
        startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public void start() {
        startTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public void stop() {
        endTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
