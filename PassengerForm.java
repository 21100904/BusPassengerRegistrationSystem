import javax.swing.*;
public class PassengerForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Passenger Registration");
        JLabel nameLabel = new JLabel("Name:");
        JLabel destLabel = new JLabel("Destination:");
        JTextField nameText = new JTextField();
        JTextField destText = new JTextField();
        JButton submitBtn = new JButton("Register");

        nameLabel.setBounds(20, 20, 100, 25);
        destLabel.setBounds(20, 60, 100, 25);
        nameText.setBounds(130, 20, 150, 25);
        destText.setBounds(130, 60, 150, 25);
        submitBtn.setBounds(130, 100, 100, 25);

        frame.add(nameLabel); frame.add(nameText);
        frame.add(destLabel); frame.add(destText);
        frame.add(submitBtn);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}