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
            // Identify input data
            // If input is valid XML
            XmlToJson xmlToJson = new XmlToJson(inputTextArea.getText());
            outputTextArea.setText(xmlToJson.toJson());
            // else if input is valid json
            //___convert to xml and set to view field
            // else, set message neither valid xml nor json

        });
        clearButton.addActionListener(actionEvent -> {
            outputTextArea.setText("Output.");
            inputTextArea.setText("Input XML here.");
            clearButton.setEnabled(false);
        });
    }
}
