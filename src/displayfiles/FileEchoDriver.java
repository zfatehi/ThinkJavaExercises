package displayfiles;

import javax.swing.JFileChooser;

import intrographics.DisplayWindow;

public class FileEchoDriver {

    public static void main(String[] args) {
        try {
            DisplayWindow display = new DisplayWindow();
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(null);
            GraphicsEcho g = new GraphicsEcho(chooser.getSelectedFile(), 120);
            g.readLines(); // read the file, place text in array
            // pass array to JPanel class
            DisplayTextPanel textpanel = new DisplayTextPanel(g.getLines());
            // install panel in display window
            display.addPanel(textpanel);
            // moves text from array to text area
            textpanel.writeToPanel();
            // show the frame, includes embedded text area
            display.showFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}