import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private MainFrame mainFrame;

    public ControlPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome To Control Panel", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(welcomeLabel, BorderLayout.NORTH);

        // Navigation Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        JButton manageJobButton = new JButton("Manage Jobs");
        manageJobButton.addActionListener(e -> mainFrame.switchPanel("Admin"));

        JButton userProfileButton = new JButton("Profile");
        // Add action for user profile (if needed)

        JButton walkInButton = new JButton("Walk In");
        // Add action for walk-in jobs (if needed)

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> mainFrame.switchPanel("Login"));

        buttonPanel.add(manageJobButton);
        buttonPanel.add(userProfileButton);
        buttonPanel.add(walkInButton);
        buttonPanel.add(logoutButton);

        add(buttonPanel, BorderLayout.CENTER);
    }
}
