import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
public class Window {
    final JFrame parent = new JFrame();
    JButton button = new JButton();
    button.setText("Click me to show message dialog");
    parent.add(button);
    parent.pack();
    parent.setVisible(true);
  
    button.addActionListener(new java.awt.event.ActionListener(){
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt){
            String name =  JOptionPane.showInputDialog(parent, "Hello World", null);
        }
    });
  }              
}
