import javax.swing.*;

public class App {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(() -> {
            GridLayout gridLayout = new GridLayout();
            gridLayout.setVisible(true);
        });

    }
}
