import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton nextButton, closeButton;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quiz/Login0.png"));
        Image i2 = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i = new ImageIcon(i2);
        JLabel img = new JLabel(i);
        img.setBounds(450, 0, 550, 500);
        add(img);

        JLabel headingLabel = new JLabel("Quiz on Bangladesh");
        headingLabel.setBounds(60, 60, 300, 40);
        headingLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        headingLabel.setForeground(new Color(22, 99, 54));
        add(headingLabel);

        JLabel h2 = new JLabel("History and Culture");
        h2.setBounds(160, 100, 300, 40);
        h2.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        h2.setForeground(new Color(99, 0, 0));
        add(h2);

        JLabel nameLabel = new JLabel("Enter your Name: ");
        nameLabel.setBounds(70, 220, 300, 20);
        nameLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        add(nameLabel);

        text = new JTextField();
        text.setBounds(70, 240, 300, 25);
        text.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(text);

        nextButton = new JButton("Next");
        nextButton.setBounds(80, 270, 120, 25);
        nextButton.setBackground(new Color(22, 99, 54));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);

        closeButton = new JButton("Close");
        closeButton.setBounds(240, 270, 120, 25);
        closeButton.setBackground(new Color(22, 99, 54));
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(this);
        add(closeButton);

        setSize(1000, 500);
        setLocation(200, 150);
        setTitle("Quiz on Bangladesh History & Culture");
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            String name = text.getText();
            if (!name.isEmpty()) {
                setVisible(false); 
                new Rules(name); 
            } else {
                JOptionPane.showMessageDialog(this, "Please enter your name.");
            }
        } else if (e.getSource() == closeButton) {
            System.exit(0);
        }
    }
}
