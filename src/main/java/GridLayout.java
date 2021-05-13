import javax.swing.*;
import java.awt.*;
import java.io.File;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/

public class GridLayout extends JFrame{
    private JPanel rootPanel;
    private JScrollPane inputScrollPane;
    private JScrollPane outputScrollPane;
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton convertButton;
    private JButton clearButton;
    GridLayout(){
        add(rootPanel);
        setDefaultCloseOperation(GridLayout.EXIT_ON_CLOSE);
        clearButton.setEnabled(false);
        setTitle("JX Parser");
        // Set Screen
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(windowSize);
        convertButton.addActionListener(actionEvent -> {
            clearButton.setEnabled(true);
            XmlToJson xmlToJson = new XmlToJson(inputTextArea.getText());
            outputTextArea.setText(xmlToJson.toJson());

        });
        clearButton.addActionListener(actionEvent -> {
            outputTextArea.setText("Output.");
            inputTextArea.setText("Input XML here.");
            clearButton.setEnabled(false);
        });
    }
}
