import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Rules extends JFrame implements ActionListener {
    JButton start, back;
    String name;

    Rules(String name) {
        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " to Quiz Test");
        heading.setBounds(100, 50, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel rules = new JLabel
        ("<html>" +
                "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                "2. There are a total 10 questions. " + "<br><br>" +
                "3. You only have 15 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                "5. No talking." + "<br><br>" +
                "6. No one else can be in the room with you." + "<br><br>" +
            "</html>"
        );
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.GRAY);
        add(rules);

        back = new JButton("Back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(new Color(22, 99, 54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(450, 500, 100, 30);
        start.setBackground(new Color(22, 99, 54));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        ImageIcon rI1 = new ImageIcon(ClassLoader.getSystemResource("Quiz/Backg.png"));
        Image rI = rI1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
        ImageIcon rI2 = new ImageIcon(rI);
        JLabel image = new JLabel(rI2);
        image.setBounds(0, 0, 800, 650);
        add(image);

        setSize(800, 650);
        setLocation(350, 80);
        setTitle("Quiz on Bangladesh History & Culture");
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name); // Pass the name to the Quiz constructor
        } else if (e.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
