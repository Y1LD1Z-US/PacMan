import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pac-Man");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            // Our game panel (sets its own preferred size)
            PacMan pacmanGame = new PacMan();
            frame.add(pacmanGame);

            // Size window based on PacMan's preferred size
            frame.pack();
            frame.setLocationRelativeTo(null); // center on screen

            frame.setVisible(true);

            // Make sure Pac-Man panel gets keyboard focus
            pacmanGame.requestFocusInWindow();
        });
    }
}
