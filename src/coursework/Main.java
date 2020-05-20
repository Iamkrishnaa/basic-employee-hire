package coursework;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame frame;
    JProgressBar progressBar;
    public Main(){
        frame = new JFrame();
        frame.setSize(400,25);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setUndecorated(true);

        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(Color.blue);
        progressBar.setStringPainted(true);
        frame.add(progressBar);
        frame.setVisible(true);

        for(int i = 0; i<=100; i ++){
            try {
                progressBar.setValue(i);
                if(i <=20){
                    Thread.sleep(80);
                } else if(i <=40){
                    Thread.sleep(150);
                } else if(i <=60){
                    Thread.sleep(50);
                } else if (i <=80){
                    Thread.sleep(40);
                } else if (i <=100){
                    Thread.sleep(60);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        frame.dispose();
        new INGNepal();

    }
    public static void main(String[] args) {
        new Main();
    }
}
