package hust.soict.ict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        byte[] inputBytes = {0};
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        inputBytes = Files.readAllBytes(Paths.get(filename));
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        String outputString = outputStringBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
