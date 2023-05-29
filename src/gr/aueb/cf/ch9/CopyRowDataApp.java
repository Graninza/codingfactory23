package gr.aueb.cf.ch9;

import java.awt.*;
import java.io.*;

public class CopyRowDataApp {

    public static void main(String[] args) {
        int b = 0;
        int count = 0;
        byte[] buffer = new byte[8192];
        long start;
        long end;
        double elapsed;

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/tmp/v1.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream ("C:/tmp/v1out.mp4"))){
            start = System.currentTimeMillis();

            while ((b = in.read(buffer)) != -1){
                out.write(buffer, 0 , b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024));

        }catch (IOException e) {
            throw new RuntimeException();
        }
    }


}
