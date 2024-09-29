import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JPanel {
    private JTextField jobTitleField;
    private JTextField companyNameField;
    private JTextField salaryField;
    private JTextArea jobDescriptionArea;
    private JLabel statusLabel;

    public AdminPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        formPanel.add(new JLabel("Job Title:"));
        jobTitleField = new JTextField();
        formPanel.add(jobTitleField);

        formPanel.add(new JLabel("Company Name:"));
        companyNameField = new JTextField();
        formPanel.add(companyNameField);

        formPanel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        formPanel.add(salaryField);

        formPanel.add(new JLabel("Job Description:"));
        jobDescriptionArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(jobDescriptionArea);
        formPanel.add(scrollPane);

        JButton postJobButton = new JButton("Post Job");
        formPanel.add(postJobButton);

        statusLabel = new JLabel("");
        formPanel.add(statusLabel);

        add(formPanel, BorderLayout.CENTER);

        postJobButton.addActionListener(e -> {
            String jobTitle = jobTitleField.getText();
            String companyName = companyNameField.getText();
            String salary = salaryField.getText();
            String jobDescription = jobDescriptionArea.getText();

            if (!jobTitle.isEmpty() && !companyName.isEmpty() && !salary.isEmpty() && !jobDescription.isEmpty()) {
                // Simulate job posting
                statusLabel.setText("Job posted successfully!");
                clearFields();
            } else {
                statusLabel.setText("Please fill in all fields.");
            }
        });
    }

    private void clearFields() {
        jobTitleField.setText("");
        companyNameField.setText("");
        salaryField.setText("");
        jobDescriptionArea.setText("");
    }
}
