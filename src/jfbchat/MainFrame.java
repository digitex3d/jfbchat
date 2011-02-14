 /* ###########################################################################
  *
  *  JFBChat it's a simple software written in Java that let you in contact
  *  with yours Facebook friends without your browser.
  *  Copyright (C) 2011  Digitex (Giuseppe Federico)
  *
  *  This program is free software: you can redistribute it and/or modify
  *  it under the terms of the GNU General Public License as published by
  *  the Free Software Foundation, either version 3 of the License, or
  *  (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  *
  *###########################################################################
  *
  */

package jfbchat;


import jfbchat.frames.JFrameAbout;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import org.jivesoftware.smack.packet.Presence;



public class MainFrame extends javax.swing.JFrame {
    private final String VERSION = "0.01";
    private final String ICON = "imgs/icon1.png";
    private boolean ComboBoxChoise;
    private Image icon;
    private JFrameAbout jFrameAbout;  
    private Connection connection;
    private PacketListening packetListening;

    public MainFrame() {

        jFrameAbout = new JFrameAbout(Application.VERSION);
        initComponents();

        ComboBoxChoise = false;

        ContactListPanel.setVisible(false);
        ContactListScrollPane.setVisible(false);
        try {
            icon = ImageIO.read(new File(ICON));
        } catch (IOException ex) {
           System.out.println("Cannot load image " + ICON);       }

        


        setLocationRelativeTo( null );
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContactList = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        ContactListScrollPane = new javax.swing.JScrollPane();
        ContactListPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EntryUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        EntryPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuHelp = new javax.swing.JMenu();
        MenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFBChat");
        setIconImage(icon);
        setMinimumSize(new java.awt.Dimension(225, 320));

        jPanelContactList.setLayout(new java.awt.GridBagLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Away", "Offline" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanelContactList.add(jComboBox1, new java.awt.GridBagConstraints());

        ContactListPanel.setLayout(new javax.swing.BoxLayout(ContactListPanel, javax.swing.BoxLayout.PAGE_AXIS));
        ContactListScrollPane.setViewportView(ContactListPanel);

        jPanelContactList.add(ContactListScrollPane, new java.awt.GridBagConstraints());

        jLabel1.setText("Username");

        EntryUser.setText("aslog.pettersen");
        EntryUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        ButtonLogin.setText("Login");
        ButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLoginMouseClicked(evt);
            }
        });
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        EntryPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryPassActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/icon1.png"))); // NOI18N

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EntryPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntryUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(ButtonLogin)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntryUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntryPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(ButtonLogin)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        MenuHelp.setText("Help");

        MenuItemAbout.setText("About");
        MenuItemAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItemAboutMousePressed(evt);
            }
        });
        MenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAboutActionPerformed(evt);
            }
        });
        MenuHelp.add(MenuItemAbout);

        jMenuBar1.add(MenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelContactList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelContactList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginMouseClicked




        User user = new User(EntryUser.getText(),EntryPass.getText());
        
        connection = new Connection(user);
       
         connection.connect();
        
        if (connection.isConnected()){
            //TODO: Pulizia qui
            LoginPanel.setVisible(false);
            jPanelContactList.setVisible(true);
            ContactListScrollPane.setVisible(true);
            ContactListPanel.setVisible(true);

            
                connection.setContactList(new ContactList(connection));

            for(int i = 0; i< connection.getContactList().getSize(); i++){

                if(connection.getContactList().getContact(i).isAvailable()){
                    ContactListPanel.add( new ContactPanel( connection, connection.getContactList().getContact(i)));
             
                       }

            packetListening = new PacketListening(connection);
            }


            
        }
        

    }//GEN-LAST:event_ButtonLoginMouseClicked

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void EntryPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryPassActionPerformed

    private void EntryUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryUserActionPerformed

    private void MenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemAboutActionPerformed

    private void MenuItemAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItemAboutMousePressed
        jFrameAbout.setVisible(true);
        
    }//GEN-LAST:event_MenuItemAboutMousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        String item = evt.getItem().toString();
        System.out.println(ComboBoxChoise);
        if (ComboBoxChoise == false){
            ComboBoxChoise = true;
        }
        else{
           ComboBoxChoise = false;


       if (item.equals("Available")){
           connection.getPresence().setMode(Presence.Mode.available);

        }else if(item.equals("Away")){
           connection.getPresence().setMode(Presence.Mode.away);
        }else{
           connection.closeConnection();
           jPanelContactList.setVisible(false);
            ContactListScrollPane.setVisible(false);
            ContactListPanel.setVisible(false);
            LoginPanel.setVisible(true);
            
        }
        }



    }//GEN-LAST:event_jComboBox1ItemStateChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPanel ContactListPanel;
    private javax.swing.JScrollPane ContactListScrollPane;
    private javax.swing.JPasswordField EntryPass;
    private javax.swing.JTextField EntryUser;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenuItem MenuItemAbout;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelContactList;
    // End of variables declaration//GEN-END:variables

}
