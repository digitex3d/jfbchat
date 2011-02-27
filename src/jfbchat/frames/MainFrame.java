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

package jfbchat.frames;



import javax.swing.ImageIcon;
import org.jivesoftware.smack.packet.Presence;
import java.util.Iterator;
import jfbchat.Application;
import jfbchat.Connection;
import jfbchat.Contact;
import jfbchat.ContactList;
import jfbchat.User;
import jfbchat.resources.Imgs;
import jfbchat.debug.DebugMessage;

public class MainFrame extends javax.swing.JFrame {

    /* The MainFrame is a JFrame that manage the contact list and the login
     * panel.
     */

    private Connection connection;

    //Icon image
    private ImageIcon mainicon;

    //Other Frames
    private JFrameAbout jFrameAbout;
    
    private User user;

    //Here will be stocked the value of the Status Combobox
    private boolean ComboBoxChoise;

    public MainFrame() {

        jFrameAbout = new JFrameAbout(Application.VERSION);
        initComponents();

        ComboBoxChoise = false;

        try{
        //Load and set the icon.
        setIconImage(new ImageIcon(Imgs.MAINICON).getImage());
        new DebugMessage("Loading "+ new ImageIcon(Imgs.MAINICON).toString());
        }catch(Exception e){
            e.toString();
        }


        //Hide the disconnect menu.
        MenuDisconnect.setVisible(false);

        //Hide the contactlist panel menu.
        ContactListPanel.setVisible(false);

        user = new User();

        //Show the MainFrame at the center of the screen.
        setLocationRelativeTo( null );
        setVisible(true);

        autologin();

    }

    private void autologin(){

        //If the user has selected autologin or remember username

        if (user.isAutoLogin()){

            EntryUser.setText(user.getSavedUser());
            EntryPass.setText(user.getSavedPass());
            ButtonLoginMouseClicked(null);

        }else if((user.getSavedUser() != null)){

            //Only remember user was pressed
            EntryUser.setText(user.getSavedUser());
            EntryPass.setText(user.getSavedPass());

        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EntryUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        EntryPass = new javax.swing.JPasswordField();
        jCheckBoxRemUser = new javax.swing.JCheckBox();
        jCheckBoxAuto = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ContactListScrollPane = new javax.swing.JScrollPane();
        ContactListPanel = new javax.swing.JPanel();
        ComboBoxStatus = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuChat = new javax.swing.JMenu();
        MenuDisconnect = new javax.swing.JMenuItem();
        MenuExit = new javax.swing.JMenuItem();
        MenuHelp = new javax.swing.JMenu();
        MenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JFBChat");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(300, 420));

        jLabel1.setText("Username");

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

        jCheckBoxRemUser.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jCheckBoxRemUser.setText("Remember username and password");
        jCheckBoxRemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRemUserActionPerformed(evt);
            }
        });

        jCheckBoxAuto.setFont(new java.awt.Font("Ubuntu", 0, 14));
        jCheckBoxAuto.setText("Auto login");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/icon1.png"))); // NOI18N
        jPanel1.add(jLabel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(EntryPass, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jCheckBoxRemUser)
                    .addComponent(jCheckBoxAuto)
                    .addComponent(ButtonLogin)
                    .addComponent(EntryUser, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntryUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntryPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxRemUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxAuto)
                .addGap(18, 18, 18)
                .addComponent(ButtonLogin)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        ContactListScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        ContactListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ContactListPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContactListPanel.setBorder(null);
        ContactListPanel.setAlignmentY(0.0F);
        ContactListPanel.setLayout(new javax.swing.BoxLayout(ContactListPanel, javax.swing.BoxLayout.PAGE_AXIS));

        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Away", "Offline" }));
        ComboBoxStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxStatusItemStateChanged(evt);
            }
        });
        ComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxStatusActionPerformed(evt);
            }
        });
        ContactListPanel.add(ComboBoxStatus);

        ContactListScrollPane.setViewportView(ContactListPanel);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ContactListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ContactListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        jMenuChat.setText("Chat");

        MenuDisconnect.setText("Disconnect");
        MenuDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuDisconnectMousePressed(evt);
            }
        });
        jMenuChat.add(MenuDisconnect);

        MenuExit.setText("Exit");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuExitMousePressed(evt);
            }
        });
        MenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitActionPerformed(evt);
            }
        });
        MenuExit.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
                MenuExitMenuKeyReleased(evt);
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuChat.add(MenuExit);

        jMenuBar1.add(jMenuChat);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginMouseClicked

        //Create a new user
        user = new User(EntryUser.getText(),EntryPass.getText());

        //Create a new connection associated to the user
        connection = new Connection(user);
        
        //Connect to the server
        connection.connect();
        
        if (connection.isConnected()){
           
            //Check if remeberuser or autologin checkbox are selected.
            checkBoxStatus();
            
            //Populate the contact list
            addContactsToPanel(connection.getContactList());

            //Show the contactlist in the MainFrame
            setContactListVisible(true);
        }
 
    }//GEN-LAST:event_ButtonLoginMouseClicked

    private void addContactsToPanel(ContactList contactList){
        //Populate the ContactListPanel with all the contacts

        for(Iterator<Contact> iter = connection.getContactList().iterator(); iter.hasNext();){
                Contact next = iter.next();
                ContactListPanel.add(next.getContactPanel());
                        }
    }

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

    private void ComboBoxStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxStatusItemStateChanged
        
 	String item = evt.getItem().toString();
 	
 	if (ComboBoxChoise == false){
            //To avoid the repetition problem
            ComboBoxChoise = true;
 	}
	else{
            ComboBoxChoise = false;

            if (item.equals("Available")){

                connection.getPresence().setMode(Presence.Mode.available);
                connection.updatePresence();

            }else if(item.equals("Away")){

                connection.getPresence().setMode(Presence.Mode.away);
                connection.updatePresence();

            }else{

                setContactListVisible(false);
                connection.closeConnection();
            }
        }
    }//GEN-LAST:event_ComboBoxStatusItemStateChanged

    public void setContactListVisible(boolean visible){
        if (visible){

            ContactListScrollPane.setVisible(true);
            ContactListPanel.setVisible(true);
            LoginPanel.setVisible(false);
            MenuDisconnect.setVisible(true);
        }
        else{

            ContactListScrollPane.setVisible(false);
            ContactListPanel.setVisible(false);
            LoginPanel.setVisible(true);
            MenuDisconnect.setVisible(false);

        }
    }
    

    private void MenuExitMenuKeyReleased(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_MenuExitMenuKeyReleased
  

    }//GEN-LAST:event_MenuExitMenuKeyReleased

    private void MenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuExitActionPerformed

    private void MenuExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMousePressed
        try{
            if(connection.isConnected()){
                connection.closeConnection();
            }
        }
        catch (NullPointerException e){
            System.out.println("Nothing to disconnect...");
        }
        
        System.out.println("Stop the execution.");
        System.exit(0);
    }//GEN-LAST:event_MenuExitMousePressed

    private void MenuDisconnectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDisconnectMousePressed
        try{
            if(connection.isConnected()){
                connection.closeConnection();
                setContactListVisible(false);
            }
        }
        catch (NullPointerException e){
            System.out.println("Nothing to disconnect...");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_MenuDisconnectMousePressed

    private void ComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxStatusActionPerformed

    private void jCheckBoxRemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRemUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRemUserActionPerformed

    public void checkBoxStatus(){
        
        //Check if the remeberuser or autologin are enabled

        if (jCheckBoxRemUser.isSelected()){
            user.saveUserAndPass();
            
        }

        if (jCheckBoxAuto.isSelected()){
            user.setAutologin();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JComboBox ComboBoxStatus;
    private javax.swing.JPanel ContactListPanel;
    private javax.swing.JScrollPane ContactListScrollPane;
    private javax.swing.JPasswordField EntryPass;
    private javax.swing.JTextField EntryUser;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem MenuDisconnect;
    private javax.swing.JMenuItem MenuExit;
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenuItem MenuItemAbout;
    private javax.swing.JCheckBox jCheckBoxAuto;
    private javax.swing.JCheckBox jCheckBoxRemUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChat;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
