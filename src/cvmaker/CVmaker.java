
package cvmaker;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CVmaker extends javax.swing.JFrame {

    public CVmaker() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        nationalTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        addTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        educaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        otherInfoTextArea = new javax.swing.JTextArea();
        depTxt = new javax.swing.JTextField();
        intTxt = new javax.swing.JTextField();
        gradeTxt = new javax.swing.JTextField();
        startTxt = new javax.swing.JTextField();
        endTxt = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        skillsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        skillTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        motherTextField = new javax.swing.JTextField();
        languagePanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        languageTextArea = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        experPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        experTextArea = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        intrestPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        interTextArea = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        certiPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        certiTextArea = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        summaryTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cilick = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        aboutMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setPreferredSize(new java.awt.Dimension(757, 480));

        jTabbedPane1.setBackground(new java.awt.Color(225, 213, 202));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(254, 218, 183));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(548, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Full Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nationality : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date of Birth : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Gender : ");

        dateTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        nationalTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        nameTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mRadioButton.setBackground(new java.awt.Color(254, 218, 183));
        buttonGroup1.add(mRadioButton);
        mRadioButton.setText("Male");
        mRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRadioButtonActionPerformed(evt);
            }
        });

        fRadioButton.setBackground(new java.awt.Color(254, 218, 183));
        buttonGroup1.add(fRadioButton);
        fRadioButton.setText("Female");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Address : ");

        addTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Phone Number  : ");

        numberTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email : ");

        emailTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(fRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nationalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nationalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fRadioButton)
                        .addComponent(mRadioButton))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(addTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Personal Info", jPanel2);

        jPanel5.setBackground(new java.awt.Color(254, 218, 183));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Depertment : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Institute Name : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Grade : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Start Year :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("End Year : ");

        educaPanel.setBackground(new java.awt.Color(254, 218, 183));
        educaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Information ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        otherInfoTextArea.setColumns(20);
        otherInfoTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        otherInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(otherInfoTextArea);

        javax.swing.GroupLayout educaPanelLayout = new javax.swing.GroupLayout(educaPanel);
        educaPanel.setLayout(educaPanelLayout);
        educaPanelLayout.setHorizontalGroup(
            educaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        educaPanelLayout.setVerticalGroup(
            educaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        depTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        intTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        gradeTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        startTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        endTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depTxt)
                    .addComponent(intTxt)
                    .addComponent(gradeTxt)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endTxt)))
                .addGap(115, 115, 115))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(educaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(depTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(intTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(educaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Education", jPanel5);

        jPanel6.setBackground(new java.awt.Color(254, 218, 183));

        skillsPanel.setBackground(new java.awt.Color(254, 218, 183));
        skillsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skills", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        skillsPanel.setPreferredSize(new java.awt.Dimension(704, 285));

        skillTextArea.setColumns(20);
        skillTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        skillTextArea.setRows(5);
        jScrollPane3.setViewportView(skillTextArea);

        javax.swing.GroupLayout skillsPanelLayout = new javax.swing.GroupLayout(skillsPanel);
        skillsPanel.setLayout(skillsPanelLayout);
        skillsPanelLayout.setHorizontalGroup(
            skillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        skillsPanelLayout.setVerticalGroup(
            skillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(skillsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(skillsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Skills", jPanel6);

        jPanel7.setBackground(new java.awt.Color(254, 218, 183));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Mother Language :");

        languagePanel.setBackground(new java.awt.Color(254, 218, 183));
        languagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Languages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        languageTextArea.setColumns(20);
        languageTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        languageTextArea.setRows(5);
        jScrollPane5.setViewportView(languageTextArea);

        javax.swing.GroupLayout languagePanelLayout = new javax.swing.GroupLayout(languagePanel);
        languagePanel.setLayout(languagePanelLayout);
        languagePanelLayout.setHorizontalGroup(
            languagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, languagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        languagePanelLayout.setVerticalGroup(
            languagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(languagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(languagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(motherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(motherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(languagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Language", jPanel7);

        jPanel8.setBackground(new java.awt.Color(254, 218, 183));

        experPanel.setBackground(new java.awt.Color(254, 218, 183));
        experPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Experiences", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        experPanel.setPreferredSize(new java.awt.Dimension(704, 285));

        experTextArea.setColumns(20);
        experTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        experTextArea.setRows(5);
        jScrollPane8.setViewportView(experTextArea);

        javax.swing.GroupLayout experPanelLayout = new javax.swing.GroupLayout(experPanel);
        experPanel.setLayout(experPanelLayout);
        experPanelLayout.setHorizontalGroup(
            experPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(experPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        experPanelLayout.setVerticalGroup(
            experPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, experPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(experPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(experPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Experience", jPanel8);

        jPanel9.setBackground(new java.awt.Color(254, 218, 183));

        intrestPanel.setBackground(new java.awt.Color(254, 218, 183));
        intrestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        intrestPanel.setPreferredSize(new java.awt.Dimension(704, 285));

        interTextArea.setColumns(20);
        interTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        interTextArea.setRows(5);
        jScrollPane4.setViewportView(interTextArea);

        javax.swing.GroupLayout intrestPanelLayout = new javax.swing.GroupLayout(intrestPanel);
        intrestPanel.setLayout(intrestPanelLayout);
        intrestPanelLayout.setHorizontalGroup(
            intrestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intrestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        intrestPanelLayout.setVerticalGroup(
            intrestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intrestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(intrestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(intrestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Interests", jPanel9);

        jPanel10.setBackground(new java.awt.Color(254, 218, 183));

        certiPanel.setBackground(new java.awt.Color(254, 218, 183));
        certiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Certificates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        certiPanel.setPreferredSize(new java.awt.Dimension(676, 265));

        certiTextArea.setColumns(20);
        certiTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        certiTextArea.setRows(5);
        jScrollPane6.setViewportView(certiTextArea);

        javax.swing.GroupLayout certiPanelLayout = new javax.swing.GroupLayout(certiPanel);
        certiPanel.setLayout(certiPanelLayout);
        certiPanelLayout.setHorizontalGroup(
            certiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(certiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        certiPanelLayout.setVerticalGroup(
            certiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, certiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(certiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(certiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Certificates", jPanel10);

        jPanel11.setBackground(new java.awt.Color(254, 218, 183));

        summaryPanel.setBackground(new java.awt.Color(254, 218, 183));
        summaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        summaryPanel.setPreferredSize(new java.awt.Dimension(704, 285));

        summaryTextArea.setColumns(20);
        summaryTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        summaryTextArea.setRows(5);
        jScrollPane7.setViewportView(summaryTextArea);

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Summary", jPanel11);

        jPanel4.setBackground(new java.awt.Color(254, 218, 183));

        jPanel3.setBackground(new java.awt.Color(254, 218, 183));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cilick.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cilick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cilick.setText("Click \"Generate button\" to Generate your CV");

        generateButton.setBackground(new java.awt.Color(225, 213, 202));
        generateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(cilick, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(cilick, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("CV Genarate", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Skills");

        aboutMenu.setBackground(new java.awt.Color(204, 204, 255));
        aboutMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        aboutMenu.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        aboutMenu.add(jMenuItem2);

        jMenuBar1.add(aboutMenu);

        helpMenu.setBackground(new java.awt.Color(204, 204, 255));
        helpMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        helpMenu.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem1.setText("About");
        jMenuItem1.setSelected(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed

           String name = nameTextField.getText();
           String nationality = nationalTextField.getText();
           String date = dateTextField.getText();
           mRadioButton.setActionCommand("Male");
           fRadioButton.setActionCommand("Female");
           String phone = numberTextField.getText();
           String address = addTextField.getText();
           String email = emailTextField.getText();
           String department =  depTxt.getText();
           String institute = intTxt.getText();
           String grade = gradeTxt.getText();
           String start = startTxt.getText();
           String end = endTxt.getText();
           String otherInfo = otherInfoTextArea.getText();
           String skill = skillTextArea.getText();
           String mother = motherTextField.getText();
           String language = languageTextArea.getText();
           String expreience = experTextArea.getText();
           String intrest = interTextArea.getText();
           String certificate = certiTextArea.getText();
           String summary = summaryTextArea.getText();
            try 
              {
                FileOutputStream fileout = new FileOutputStream(name + ".docx");
                XWPFDocument doc = new  XWPFDocument();
                XWPFParagraph paraTit = doc.createParagraph();
                paraTit.setAlignment(ParagraphAlignment.LEFT);
                
                XWPFRun paraTitRun = paraTit.createRun();
                paraTitRun.setBold(true);
                paraTitRun.setFontSize(25);
                XWPFRun paraTitRun2 = paraTit.createRun();
                paraTitRun2.setFontSize(15);
                XWPFRun paraTitRun3 = paraTit.createRun();
                paraTitRun3.setBold(true);
                paraTitRun3.setFontSize(20);
                XWPFRun paraTitRun4 = paraTit.createRun();
                paraTitRun4.setFontSize(15);
                XWPFRun paraTitRun5 = paraTit.createRun();
                paraTitRun5.setBold(true);
                paraTitRun5.setFontSize(20);
                XWPFRun paraTitRun6 = paraTit.createRun();
                paraTitRun6.setFontSize(15);
                 XWPFRun paraTitRun7 = paraTit.createRun();
                paraTitRun7.setBold(true);
                paraTitRun7.setFontSize(20);
                XWPFRun paraTitRun8 = paraTit.createRun();
                paraTitRun8.setFontSize(15);
                
                paraTitRun.setText(name);
                paraTitRun.addBreak();
                paraTitRun2.setText("-----------------------------------------");
                paraTitRun2.addBreak();
                paraTitRun2.setText("Nationality : " + nationality);
                 paraTitRun2.addBreak();
                paraTitRun2.setText("Date of birth : " + date);
                 paraTitRun2.addBreak();
                paraTitRun2.setText("Gender : " + buttonGroup1.getSelection().getActionCommand());
                 paraTitRun2.addBreak();
                paraTitRun2.setText("Phone Number :  " + phone);
                 paraTitRun2.addBreak();
                paraTitRun2.setText("Address : " + address);
                 paraTitRun2.addBreak();
                paraTitRun2.setText("Email : " + email);
                 paraTitRun2.addBreak();
//                paraTitRun2.setText("-----------------------------------------"); 
                 paraTitRun3.addBreak();
                paraTitRun3.setText("Education");
                 paraTitRun3.addBreak();
                
                paraTitRun4.setText("Department : " + department);
                 paraTitRun4.addBreak();
                paraTitRun4.setText("Institute : " + institute);
                 paraTitRun4.addBreak();
                paraTitRun4.setText("Grade : " + grade);
                 paraTitRun4.addBreak();
                paraTitRun4.setText("Start year :  " + start);
                 paraTitRun4.addBreak();
                paraTitRun4.setText("End year : " + end);
                   paraTitRun4.addBreak();
                   paraTitRun4.addBreak();
                   
                  paraTitRun5.setText("Other information");
                  paraTitRun5.addBreak();
                while(otherInfo != null)
                {
                   String[] splitLine = otherInfo.split("\\n");
                   for(int i = 0; i < splitLine.length; i++)
                   {
                           paraTitRun6.setText("-" + splitLine[i]);
                           paraTitRun6.addBreak();
                   }
                   break;
               } 
             
//               paraTitRun2.setText("-----------------------------------------"); 
                        paraTitRun6.addBreak();                
                       paraTitRun7.setText("Skills");
                        paraTitRun8.addBreak();
                       while(skill != null)
                        {
                           String[] skillLine = skill.split("\\n");
                           for(int j = 0; j < skillLine.length; j++)
                           {
                                   paraTitRun8.setText("-" + skillLine[j]);
                                   paraTitRun8.addBreak();
                           }
                           break;
                       }
          
//               paraTitRun2.setText("-----------------------------------------"); 
                paraTitRun8.addBreak();
                
                    XWPFRun paraTitRun9 = paraTit.createRun();
                    paraTitRun9.setBold(true);
                    paraTitRun9.setFontSize(20);
                    XWPFRun paraTitRun10 = paraTit.createRun();
                    paraTitRun10.setFontSize(15);
                                       
               paraTitRun9.setText("Language");
                paraTitRun9.addBreak();
               paraTitRun10.setText("-" + mother + " (native)");
                paraTitRun10.addBreak();
               while(language != null)
               {
                   String[] langLine = language.split("\\n");
                   for(int k = 0; k < langLine.length; k++)
                   {
                           paraTitRun10.setText("-" + langLine[k]);
                           paraTitRun10.addBreak();
                   }
                   break;
               }
                XWPFRun paraTitRun11 = paraTit.createRun();
                paraTitRun11.setBold(true);
                paraTitRun11.setFontSize(20);
                XWPFRun paraTitRun12 = paraTit.createRun();
                paraTitRun12.setFontSize(15);    
//               paraTitRun2.setText("-----------------------------------------");
                paraTitRun11.addBreak();
               paraTitRun11.setText("Experience");
                paraTitRun12.addBreak();
               while(expreience != null)
               {
                   String[] expLine = expreience.split("\\n");
                   for(int x = 0; x < expLine.length; x++)
                   {
                           paraTitRun12.setText("-" + expLine[x]);
                           paraTitRun12.addBreak();
                   }
                   break;
               }
//               paraTitRun2.setText("-----------------------------------------");
                  paraTitRun12.addBreak();
                 
                XWPFRun paraTitRun13 = paraTit.createRun();
                paraTitRun13.setBold(true);
                paraTitRun13.setFontSize(20);
                XWPFRun paraTitRun14 = paraTit.createRun();
                paraTitRun14.setFontSize(15);
                  
                 paraTitRun13.addBreak();
               paraTitRun13.setText("Interest");
                paraTitRun14.addBreak();
               while(intrest != null)
               {
                   String[] intLine = intrest.split("\\n");
                   for(int y = 0; y < intLine.length; y++)
                   {
                          paraTitRun14.setText("-" + intLine[y]);
                          paraTitRun14.addBreak();
                   }
                   break;
               }
//               paraTitRun2.setText("-----------------------------------------"); 
                  paraTitRun14.addBreak();
                  
                   XWPFRun paraTitRun15 = paraTit.createRun();
                paraTitRun15.setBold(true);
                paraTitRun15.setFontSize(20);
                XWPFRun paraTitRun16 = paraTit.createRun();
                paraTitRun16.setFontSize(15);
                  
                paraTitRun15.addBreak();
               paraTitRun15.setText("Certificate");
                paraTitRun16.addBreak();
               while(certificate != null)
               {
                   String[] cerLine = certificate.split("\\n");
                   for(int z = 0; z < cerLine.length; z++)
                   {
                           paraTitRun16.setText("-" + cerLine[z]);
                           paraTitRun16.addBreak();
                   }
                   break;
               }
//               paraTitRun2.setText("-----------------------------------------");  
                  paraTitRun16.addBreak();
                  
                     XWPFRun paraTitRun17 = paraTit.createRun();
                paraTitRun17.setBold(true);
                paraTitRun17.setFontSize(20);
                XWPFRun paraTitRun18 = paraTit.createRun();
                paraTitRun18.setFontSize(15);
                  
                   paraTitRun17.addBreak();
                if(summary != null)
                {
                       paraTitRun17.setText("Summary");
                          paraTitRun18.addBreak();
                       while(summary != null)
                       {
                           String[] sumLine = summary.split("\\n");
                           for(int a = 0; a < sumLine.length; a++)
                           {
                                   paraTitRun18.setText("-" + sumLine[a]);
                                   paraTitRun18.addBreak();
                           }
                           break;
                       }
                }
                else
                {
                          paraTitRun17.setText(" ");
                          paraTitRun18.setText(" ");
                }
                       
                paraTitRun18.addBreak();
              paraTitRun18.setText("-----------------------------------------"); 
              doc.write(fileout);
              
               JOptionPane.showMessageDialog(null, "CV Successfully Generated!");
        
            } 
            catch (Exception ex) 
            {
                 JOptionPane.showMessageDialog(null, "CV not Generated!");
            } 
    }//GEN-LAST:event_generateButtonActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void mRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mRadioButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       new About().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CVmaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CVmaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CVmaker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CVmaker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVmaker().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    public javax.swing.JTextField addTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel certiPanel;
    public javax.swing.JTextArea certiTextArea;
    private javax.swing.JLabel cilick;
    public javax.swing.JTextField dateTextField;
    public javax.swing.JTextField depTxt;
    private javax.swing.JPanel educaPanel;
    public javax.swing.JTextField emailTextField;
    public javax.swing.JTextField endTxt;
    private javax.swing.JPanel experPanel;
    public javax.swing.JTextArea experTextArea;
    public javax.swing.JRadioButton fRadioButton;
    public javax.swing.JButton generateButton;
    public javax.swing.JTextField gradeTxt;
    private javax.swing.JMenu helpMenu;
    public javax.swing.JTextField intTxt;
    public javax.swing.JTextArea interTextArea;
    private javax.swing.JPanel intrestPanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel languagePanel;
    public javax.swing.JTextArea languageTextArea;
    public javax.swing.JRadioButton mRadioButton;
    public javax.swing.JTextField motherTextField;
    public javax.swing.JTextField nameTextField;
    public javax.swing.JTextField nationalTextField;
    public javax.swing.JTextField numberTextField;
    public javax.swing.JTextArea otherInfoTextArea;
    public javax.swing.JTextArea skillTextArea;
    private javax.swing.JPanel skillsPanel;
    public javax.swing.JTextField startTxt;
    private javax.swing.JPanel summaryPanel;
    public javax.swing.JTextArea summaryTextArea;
    // End of variables declaration//GEN-END:variables
}
