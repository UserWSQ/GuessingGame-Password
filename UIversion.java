import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class UIversion {
    public static void main(String[] args) {
        //window
        JFrame jFrame = new JFrame("guessing game");
        jFrame.setSize(1000,700);
        jFrame.setLocation(300,250);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        //text
        Font font = new Font("宋体",Font.PLAIN,50);

        Container container = jFrame.getContentPane();
        JLabel jLabel = new JLabel();
        jLabel.setText("pls choose a mode:");
        jLabel.setFont(font);
        jLabel.setOpaque(true);
        jLabel.setSize(container.getSize());
        jLabel.setForeground(Color.black);
        jLabel.setLayout(new FlowLayout());
        container.add(jLabel);
        jLabel.setHorizontalAlignment(jLabel.CENTER);
        jLabel.setVerticalAlignment(jLabel.TOP);
        jLabel.setVisible(true);

        //button
        Font mode = new Font("宋体",Font.PLAIN,30);//font

        JButton mode1 = new JButton("random");
        mode1.setSize(100,62);
        mode1.setFont(mode);
        mode1.setForeground(Color.black);
        mode1.setOpaque(true);
        //mode1.setLayout(new FlowLayout());
        mode1.setBounds(30,400,200,62);
        jFrame.add(mode1);
        mode1.setVisible(true);

        JButton mode2 = new JButton("random with information");
        mode2.setSize(400,62);
        mode2.setFont(mode);
        mode2.setForeground(Color.black);
        mode2.setOpaque(true);
        //mode2.setLayout(new FlowLayout());
        mode2.setBounds(260,400,400,62);
        jFrame.add(mode2);
        mode2.setVisible(true);

        JButton mode3 = new JButton("2 players");
        mode3.setSize(400,62);
        mode3.setFont(mode);
        mode3.setForeground(Color.black);
        mode3.setOpaque(true);
        //mode3.setLayout(new FlowLayout());
        mode3.setBounds(700,400,250,62);
        jFrame.add(mode3);
        mode3.setVisible(true);

        //src code
        //mode 1
        mode1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame m1window = new JFrame("README");

                Container m1txt = m1window.getContentPane();

                m1window.setSize(1000, 700);
                m1window.setLocation(350, 300);
                m1window.setResizable(false);
                m1window.setVisible(true);

                JLabel m1text = new JLabel("<html>we will summon a random number in 0~5,pls take a guess   More information,pls find this man:王善奇   there are still many bugs inside,pls don't mention!   So,pls enter the number you guess:</html>");
                m1text.setFont(mode);
                m1text.setOpaque(true);
                m1text.setSize(m1txt.getSize());
                m1text.setForeground(Color.black);
                m1text.setLayout(new FlowLayout());
                m1txt.add(m1text);
                m1text.setHorizontalAlignment(m1text.CENTER);
                m1text.setVisible(true);

                JFrame m1window2 = new JFrame();
                m1window2.setTitle("random mode");
                m1window2.setSize(1000, 700);
                m1window2.setLocation(450, 400);
                m1window2.setResizable(false);
                m1window2.setVisible(true);

                Container m1GM = m1window2.getContentPane();
                JTextField m1GuessNumber = new JTextField("enter the number you guess...");
                m1GuessNumber.setFont(mode);
                m1GuessNumber.setHorizontalAlignment(m1GuessNumber.CENTER);
                m1GuessNumber.setOpaque(true);
                m1GuessNumber.setEditable(true);
                m1GM.add(m1GuessNumber);
                m1GuessNumber.setVisible(true);

                Random random = new Random();
                for (int i = 0; i < 7355608; i++) {
                    int m1RandomNumber = random.nextInt(5);
                    String m1Sec = m1GuessNumber.getText();
                    int m1Sec2 = Integer.parseInt(m1Sec);
                    if (m1Sec2 == m1RandomNumber) {
                        JLabel m1win = new JLabel();
                        m1win.setText("<html>you win!   Your number:</html>"+m1Sec2+"   Random number:"+m1RandomNumber);
                        Container m1winC = m1window2.getContentPane();
                        m1win.setFont(mode);
                        m1win.setOpaque(true);
                        m1win.setSize(m1winC.getSize());
                        m1win.setForeground(Color.black);
                        m1win.setLayout(new FlowLayout());
                        m1winC.add(m1win);
                        m1win.setHorizontalAlignment(m1win.CENTER);
                        m1win.setVerticalAlignment(m1win.TOP);
                        m1win.setVisible(true);

                    }
                }
            }
        });

    }

}
