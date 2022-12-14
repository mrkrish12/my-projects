
import java.util.ArrayList;
import javax.swing.JOptionPane;


// initially 10k will be deposited in every bank account
// further we can link this database to some kind of database service to save the data
class database{
    String name;
    int code;
    long card;
    double balance = 10000;
    static double min_bal = 1000;

    public database(String name, int code, long card) {
        this.name = name;
        this.code = code;
        this.card = card;
    }
    
    void deposit(double val){
        this.balance+=val;
        JOptionPane.showMessageDialog(null,val + " Deposited Successfully");
    }
    
    void withdraw(double val){
        if(this.balance-min_bal<val){
            JOptionPane.showMessageDialog(null,"Insufficient Balance");
        }
        else{
            this.balance-=val;
            JOptionPane.showMessageDialog(null,val + " Withdrawn Successfully");
        }
    }
    
    void display_details(){
        JOptionPane.showMessageDialog(null, "Name: "+this.name+"\nBalance: "+this.balance);
    }
}

public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    static database curr;
    public ATM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        details = new javax.swing.JButton();
        tf = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        details.setText("Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        tf.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdraw)
                    .addComponent(deposit)
                    .addComponent(details))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
           double amt = Double.parseDouble(tf.getText());
           curr.deposit(amt);
           tf.setText("");
    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        double amt = Double.parseDouble(tf.getText());
        curr.withdraw(amt);
        tf.setText("");
    }//GEN-LAST:event_withdrawActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        curr.display_details();
    }//GEN-LAST:event_detailsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<database> db = new ArrayList<>();
                db.add(new database("Amol Chitale",5012,789456123));
                db.add(new database("Krishna Agrawal",2028,987654321));
                db.add(new database("Garvit Maheswari",0202,456789123));
                db.add(new database("Yash Bajpai",8986,369528147));
                db.add(new database("Jyotin Rustagi",2536,148257369));
                db.add(new database("Sushant Rai",2291,147258963));
                db.add(new database("Ayush Kumar",5812,951847632));
                db.add(new database("Ashutosh Kabdwal",5062,159478236));
                db.add(new database("Anuraj Singh",5369,946785123));
                db.add(new database("Aman Kumar",7865,869753412));
                db.add(new database("Satwik Agrawal",5261,357214698));
                db.add(new database("Ekansh Gautam",3391,762843917));
                
                
                long card_number = Long.parseLong(JOptionPane.showInputDialog("Enter the card number: "));
                long pin = Long.parseLong(JOptionPane.showInputDialog("Enter the Pin: "));
                boolean flag = false;
                for(int i=0;i<db.size();i++){
                    if(card_number == db.get(i).card && pin == db.get(i).code){
                        flag=true;
                        curr = db.get(i);
                         new ATM().setVisible(true);
                    }
                }
                if(!flag)
                    JOptionPane.showMessageDialog(null, "Wrong Credentials");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deposit;
    private javax.swing.JButton details;
    private java.awt.TextField tf;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
