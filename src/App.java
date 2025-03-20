import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Size of window
        int boardWidth = 360;
        int boardHeight = 640;

        // create a window name 'Flappy Bird'
        JFrame frame = new JFrame("Flappy Bird");

        frame.setSize(boardWidth, boardHeight);
        // window appear center of screen
        frame.setLocationRelativeTo(null);
        // do not allow player change size of window
        frame.setResizable(false);
        // close all when turn off
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create object bird
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        // listen event
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}