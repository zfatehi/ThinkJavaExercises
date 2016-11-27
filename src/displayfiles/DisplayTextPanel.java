package displayfiles;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DisplayTextPanel extends JPanel {

    JTextArea textarea;
    JScrollPane scroller;
    String[] lines;

    public DisplayTextPanel(String[] lines) {
        this.lines = lines;
        setPreferredSize(new Dimension(500, 400));
        textarea = new JTextArea(20, 50);
        textarea.setEditable(false); // can't edit text area
        scroller = new JScrollPane(textarea);// embed textarea in scroll
        // pane
        this.add(scroller); // adds scrollable text area to panel
    }

    public void writeToPanel() {
        int currline = 0;
        while (lines[currline] != null) {
            textarea.append(lines[currline] + '\n');
            currline++;
        }
    }
}