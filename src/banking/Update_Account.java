package banking;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
public class Update_Account extends javax.swing.JFrame {
    String file1;
    File file;
    public Update_Account() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Acc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
          jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        District = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        State = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        Mother_Name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Father_Name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Day = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
       
        jLabel15 = new javax.swing.JLabel();
        Month = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        Year = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Customer Information Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 292, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Current Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 60, 90, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(207, 54, 92, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Account No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 90, 15);
        getContentPane().add(Acc);
        Acc.setBounds(150, 90, 186, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 80, 15);
        getContentPane().add(name);
        name.setBounds(150, 130, 186, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date Of Birth");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 110, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 210, 90, 15);

        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //mobileActionPerformed(evt);
            }
        });
        getContentPane().add(mobile);
        mobile.setBounds(150, 200, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 250, 100, 15);

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane2.setViewportView(Address);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 240, 187, 96);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("District");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 350, 100, 15);
        getContentPane().add(District);
        District.setBounds(150, 340, 187, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("State");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 390, 100, 15);
        getContentPane().add(State);
        State.setBounds(150, 380, 187, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 210, 90, 15);
        
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(465, 17, 160, 130);
       
        Border border = new EtchedBorder(EtchedBorder.RAISED);
        jLabel19.setBorder(border);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(507, 199, 70, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(586, 199, 90, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Marital Status");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 240, 100, 15);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setText("Married");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(507, 231, 80, 23);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton4.setText("Unmarried");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(586, 231, 110, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Mother Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 280, 100, 15);
        getContentPane().add(Mother_Name);
        Mother_Name.setBounds(509, 272, 152, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Father Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(400, 320, 100, 15);

        Father_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // Father_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Father_Name);
        Father_Name.setBounds(510, 310, 152, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Balance");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 360, 100, 15);

        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //BalanceActionPerformed(evt);
            }
        });
        getContentPane().add(Balance);
        Balance.setBounds(510, 350, 152, 30);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 390, 78, 23);
        
         jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 390, 78, 23);

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 50, 78, 23);
        
        jButton2.setText("Upload Pic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(507, 164, 81, 23);

        Day.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        getContentPane().add(Day);
        Day.setBounds(150, 170, 40, 20);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(462, 54, 166, 96);

        jLabel15.setText("Day");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 170, 40, 14);

        Month.setModel(new javax.swing.SpinnerNumberModel(10, 10, 15, 1));
        getContentPane().add(Month);
        Month.setBounds(220, 170, 40, 20);

        jLabel17.setText("Month");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(260, 170, 30, 14);
        getContentPane().add(Year);
        Year.setBounds(300, 170, 40, 20);

        jLabel18.setText("Year");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(340, 170, 22, 14);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 800, 450);

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       BufferedImage img;                                                                          //upload Button
    String filename;
        JFileChooser openFile = new JFileChooser();
            openFile.showOpenDialog(null);
            file = openFile.getSelectedFile();       
     BufferedImage image;
                try {
                        image = ImageIO.read(file);
                        ImageIO.write(image, "jpg",new File("images\\"+file.getName()));
                    } catch (IOException ex) {}              

                    try {
                        img=ImageIO.read(file);
                       ImageIcon scaledImageIcon;
        scaledImageIcon = new ImageIcon(img.getScaledInstance(160, 130, java.awt.Image.SCALE_SMOOTH));
                         jLabel19.setIcon(scaledImageIcon);                        
                    }
                    catch(IOException e1) {}          
    }    
     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                    //Search Button                     
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/db1","root","");  
            PreparedStatement stmt=con.prepareStatement("select * from user_acc where Acc_No=?");  
             stmt.setString(1, Acc.getText());
            ResultSet rs=stmt.executeQuery();  
            while(rs.next()){  
            name.setText(rs.getString(2));
            mobile.setText(Integer.toString(rs.getInt(4)));
            Address.setText(rs.getString(5));
            District.setText(rs.getString(6));
            State.setText(rs.getString(7));
            String gen=rs.getString(8);
            String stat=rs.getString(9);
            if(gen.equals("Male")){
                jRadioButton1.setSelected(true);
            }
             if(gen.equals("Female")){
                jRadioButton1.setSelected(true);
            }
             if(stat.equals("Married")){
                jRadioButton3.setSelected(true);
            }
             if(stat.equals("Unmarried")){
                jRadioButton4.setSelected(true);
            }
            Mother_Name.setText(rs.getString(10));
            Father_Name.setText(rs.getString(11));
            Balance.setText(Integer.toString(rs.getInt(12)));
            BufferedImage img;  
            file1=rs.getString(13);
            try {                       
                    ImageIcon imageIcon = new ImageIcon("images\\"+rs.getString(13)); // load the image to a imageIcon
                    Image image = imageIcon.getImage(); // transform it 
                    Image newimg = image.getScaledInstance(160, 130,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                    imageIcon = new ImageIcon(newimg); 
                    jLabel19.setIcon(imageIcon);
                    }
                    catch(Exception e) {}   
            
            jTextField1.setText(rs.getString(14));
            }
            con.close();  
  
            }catch(Exception e){ System.out.println(e);}  
      
    }        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {           //Delete Button                                          
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/db1","root","");  
            PreparedStatement stmt=con.prepareStatement("delete from user_acc where Acc_No=?");  
            stmt.setInt(1,64564);  
  
            int i=stmt.executeUpdate();  
            System.out.println(i+" records deleted");  
            con.close();  
  
            }catch(Exception e){ System.out.println(e);}  
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {            //Update Button                             
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/db1","root","");            
            jRadioButton1.setActionCommand("Male");
            jRadioButton2.setActionCommand("Female");
            jRadioButton3.setActionCommand("Married");
            jRadioButton4.setActionCommand("Unmarried");
            int Date, month, year ;
            Date = (Integer) Day.getValue();
            month = (Integer) Month.getValue();
            year = (Integer) Year.getValue();
            
            PreparedStatement pstmt;  
            pstmt = con.prepareStatement("update user_acc set Name=? , DOB=? , Mobile=? , Address=? , District=? , State=? , Gender=?, Status=?,Mother_Name=? , Father_Name=? , Balance=?, Pic=?, Date=? where Acc_No=?");
            
            pstmt.setString(1,name.getText());
            pstmt.setString(2, Date +"-" + month + "-" + year);
            pstmt.setInt(3, Integer.parseInt(mobile.getText()));
            pstmt.setString(4,Address.getText());
            pstmt.setString(5,District.getText());
            pstmt.setString(6,State.getText());          
            pstmt.setString(7, buttonGroup1.getSelection().getActionCommand() );
            pstmt.setString(8, buttonGroup2.getSelection().getActionCommand() );
            pstmt.setString(9,Mother_Name.getText());
            pstmt.setString(10,Father_Name.getText());
            pstmt.setInt(11, Integer.parseInt(Balance.getText()));
          
             pstmt.setString(12,file1);
             pstmt.setString(13, jTextField1.getText());
               pstmt.setString(14, Acc.getText());
            int i=pstmt.executeUpdate();             
            System.out.println(i+" records updated");                        
            con.close();   
            }catch(Exception e){ System.out.println(e);}  
    }
  
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Account().setVisible(true);
            }
        });
       
        }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Acc;
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Balance;
    private javax.swing.JSpinner Day;
    private javax.swing.JTextField District;
    private javax.swing.JTextField Father_Name;
    private javax.swing.JSpinner Month;
    private javax.swing.JTextField Mother_Name;
    private javax.swing.JTextField State;
    private javax.swing.JSpinner Year;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
     private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
   
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    // End of variables declaration                   
}
