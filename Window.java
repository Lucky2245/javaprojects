import javax.swing.JFrame;
import javax.swing.JOptionPane
public class Window(){
    private static void createwindow(){
      //set up window
        JFrame frame =  new JFrame("Simple Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textlabel = new JLabel("Welcome To My App", swingConstants.CENTER);
        textlabel.setPreferredSize(new Dimension(300, 100));
        frame.getcontentPane().add(textlabel, BorderLayout.CENTER);
        //Display the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true); 
    }
    //create popup message that says Hello World
    public class MessagePopUps {
      public static void main(String[] a){
        JFrame parent = new JFrame();
        JOptionPane.showMessageDialog(parent, "Hello World");
      }}
    public static void main(String[] args) {
        createwindow();
    }
}
