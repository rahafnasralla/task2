import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        TimerSingelton Timer = TimerSingelton.getInstance();

        Timer.startTimer();

        String filePath = "example.txt";
        String oddNumbers="";
        for (int i=0; i<100000;i++) {
            if(i%2!=0)
            oddNumbers+= i;
            oddNumbers+="\n";
        }

        long elapsedTimeBeforeStoppingTheTimer = Timer.getElapsedTime();
        System.out.println("Elapsed Time befor stopping the timer: " + elapsedTimeBeforeStoppingTheTimer + " milliseconds");


        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("odd numbers upto 100000\n");
            fileWriter.write(oddNumbers);
            fileWriter.close();

            System.out.println("Text written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }


        Timer.stopTimer();

        long elapsedTime = Timer.getElapsedTime();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

    }
}
