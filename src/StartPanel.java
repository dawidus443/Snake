import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel implements ActionListener {
    static final int SCREEN_WIDTH = 700;
    static final int SCREEN_HEIGHT = 700;
    JFrame frame = new JFrame();
    JButton button = new JButton("Start");
    JPanel panel = new JPanel();

    StartPanel(){
        button.setBounds(250, 250,200,100);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        panel.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        panel.setBackground(Color.black);
        panel.setFocusable(true);

        frame.add(panel);
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){

            frame.dispose();
            new GameFrame();
        }
    }
}
