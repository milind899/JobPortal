import javax.swing.*;
import java.awt.*;

public class UserPanel extends JPanel {
    public UserPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JLabel availableJobsLabel = new JLabel("Available Jobs", SwingConstants.CENTER);
        availableJobsLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(availableJobsLabel, BorderLayout.NORTH);

        // Simulate a job list with sample jobs
        String[] jobs = {
                "Software Developer at Tech Co.",
                "Project Manager at Business Corp.",
                "Data Analyst at Data Inc."
        };

        JList<String> jobList = new JList<>(jobs);
        add(new JScrollPane(jobList), BorderLayout.CENTER);

        JButton applyButton = new JButton("Apply for Job");
        applyButton.addActionListener(e -> {
            String selectedJob = jobList.getSelectedValue();
            if (selectedJob != null) {
                JOptionPane.showMessageDialog(this, "Applied for: " + selectedJob);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a job to apply.");
            }
        });

        add(applyButton, BorderLayout.SOUTH);
    }
}
