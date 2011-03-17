 /* ###########################################################################
  *
  *  JFBChat it's a simple software written in Java that let you int contact
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

import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.Box;


import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.XMPPException;

import jfbchat.*;
import jfbchat.listeners.MyMessageListener;
import jfbchat.panels.PanelMessage;
import jfbchat.resources.Imgs;
import jfbchat.debug.DebugMessage;

 /**
 *This class represent a ChatFrame
  *
 * @author digitex ( Giuseppe Federico - digitex3d@gmail.com )
 * Webpage: http://www.digisoftware.org
 */

public class ChatFrame extends javax.swing.JFrame {

    final int K_ENTER_ID = 10;

    private Contact contact;
    private Connection connection;
    private ChatManager chatmanager;
    private Chat newChat;
    private String contactAdr;
    private JScrollBar verticalScrollBar;
    private ImageIcon avatarIcon;

    /** Creates new form ChatFrame */
    public ChatFrame(Connection connection, Contact contact) {

        this.connection = connection;
        this.contact = contact;
        this.contactAdr = contact.getAdress();
       
        //Set icon image
        try{

            //Load and set the icon.
            setIconImage(new javax.swing.ImageIcon(getClass().getResource(Imgs.MAINICON)).getImage());

        }catch(Exception e){

            new DebugMessage(this.getClass(), "Cannot load image " + new ImageIcon(Imgs.MAINICON).toString(), e);

        }
        

        this.chatmanager = connection.getConnection().getChatManager();

        initComponents();

        
        this.setTitle( contact.getUser() );
        this.verticalScrollBar = ScrollMessages.getVerticalScrollBar();

        
        newChat = chatmanager.createChat(contactAdr ,
                                         new MyMessageListener(
                                         contact));
            

         try{

       
             avatarIcon = contact.getVCard().getAvatar();
             if (avatarIcon != null){
                 //Set the icon
                 this.avatar.setIcon(avatarIcon);
          }


          }catch(Exception e){

                System.out.println( e.getMessage());
                
          }

           setVisible(true);
       
    }

    public ChatFrame(Connection connection, String contactAdr) {
        
        this.connection = connection;
        this.contactAdr = contactAdr;

        chatmanager = connection.getConnection().getChatManager();

        initComponents();
        this.setTitle("Conversation with "+ contactAdr);
      
        newChat = chatmanager.createChat(contactAdr, new MessageListener() {
            public void processMessage(Chat chat, Message message) {

                if (contact.getChatFrame().isVisible() == false){

                    contact.getChatFrame().setVisible(true);

                }
                PanelMessages.add(new PanelMessage(false, contact , message.getBody()));
                System.out.println("Ricevuto: " + message);
                validate();
                verticalScrollBar.setValue(verticalScrollBar.getMaximum());
            
            }
           });
         
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JPanel();
        jPanelScrollMessages = new javax.swing.JPanel();
        ScrollMessages = new javax.swing.JScrollPane();
        PanelMessages = new javax.swing.JPanel();
        PanelSend = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        avatarPanel = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        ButtonSend = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuConversation = new javax.swing.JMenu();
        jMenuItemClear = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuClose = new javax.swing.JMenuItem();

        setTitle("Conversation with ...");
        setMinimumSize(new java.awt.Dimension(300, 300));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelScrollMessages.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanelScrollMessages.setLayout(new java.awt.BorderLayout());

        PanelMessages.setBackground(new java.awt.Color(255, 255, 255));
        PanelMessages.setAlignmentY(0.0F);
        PanelMessages.setLayout(new javax.swing.BoxLayout(PanelMessages, javax.swing.BoxLayout.Y_AXIS));
        ScrollMessages.setViewportView(PanelMessages);

        jPanelScrollMessages.add(ScrollMessages, java.awt.BorderLayout.CENTER);

        PanelSend.setLayout(new java.awt.BorderLayout());

        messageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageFieldKeyTyped(evt);
            }
        });
        PanelSend.add(messageField, java.awt.BorderLayout.CENTER);

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/facebook_avatar.png"))); // NOI18N

        javax.swing.GroupLayout avatarPanelLayout = new javax.swing.GroupLayout(avatarPanel);
        avatarPanel.setLayout(avatarPanelLayout);
        avatarPanelLayout.setHorizontalGroup(
            avatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, avatarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avatar))
        );
        avatarPanelLayout.setVerticalGroup(
            avatarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avatarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        ButtonSend.setText("Send");
        ButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelSend, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jPanelScrollMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avatarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainFrameLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanelScrollMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addComponent(avatarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonSend)
                    .addComponent(PanelSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(MainFrame, java.awt.BorderLayout.CENTER);

        jMenuConversation.setText("Conversation");
        jMenuConversation.setToolTipText("Conversation");

        jMenuItemClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClear.setText("Clear");
        jMenuItemClear.setToolTipText("Clear the conversation");
        jMenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClearActionPerformed(evt);
            }
        });
        jMenuConversation.add(jMenuItemClear);
        jMenuConversation.add(jSeparator1);

        jMenuClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuClose.setText("Close");
        jMenuClose.setToolTipText("Close the window");
        jMenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseActionPerformed(evt);
            }
        });
        jMenuConversation.add(jMenuClose);

        jMenuBar.add(jMenuConversation);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Send a message to the contact associated to the ChatFrame
     * @param texttosend
     */
    public void SendMessage(String texttosend){

        //If texttosend is not empty
        if ( ! ( texttosend.equals("") ) ){

            try {
          
                addPanelMessage(new PanelMessage(true, null,
                                                   texttosend));

                // Clear the TextField
                messageField.setText("");                                               
                
                newChat.sendMessage(texttosend);

                new DebugMessage(this.getClass(),"Sended \""+ texttosend +"\" to " + contact.getUser());

            }catch (XMPPException e) {

                new DebugMessage(this.getClass(), "Cannot send message to " + contact.getUser(), e);

            }

        }
     
    }

    /**
     * Add a "is typing" message to the PanelMessages
     * @param A contact name
     */

    public void addTypingMsg(String contactName){

            PanelMessages.add(new jfbchat.panels.PanelTypingMessage( contactName ) );
            validate();
            verticalScrollBar.setValue( verticalScrollBar.getMaximum() );
            validate();

    }

    /**
     * Add a message to the PanelMessages
     * Set the scrollbar at the maximum position for every incoming or
     *  outcoming message.message
     */
    public void addPanelMessage(PanelMessage panel){
        
            PanelMessages.add(panel);
            validate();
            verticalScrollBar.setValue(verticalScrollBar.getMaximum());
            validate();

    }

    /**
     * Update the chatframe (the contact might be disconnected after a roster up
     * date)
     */
     public void update(){

        ButtonSend.setEnabled( contact.isAvailable() );
        
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         //TODO: Send a message when enter is pressed
    }//GEN-LAST:event_formKeyPressed

    private void ButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSendMouseClicked
        SendMessage( messageField.getText() );
}//GEN-LAST:event_ButtonSendMouseClicked
    
    /**
     * Send the messageField text when Enter is pressed
     * @param evt
     */
    private void messageFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageFieldKeyTyped

        if( (int) evt.getKeyChar() == K_ENTER_ID ){

             SendMessage( messageField.getText() );

         }

    }//GEN-LAST:event_messageFieldKeyTyped

    /**
     * MenuItem Close action
     * @param evt
     */
    private void jMenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseActionPerformed

        //Hide the window
        this.setVisible(false);
    }//GEN-LAST:event_jMenuCloseActionPerformed

    /**
     * MenuItem Clear action
     * @param evt
     */
    private void jMenuItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClearActionPerformed

        //Clear all the messages in the PanelMessages
        this.clearAllMessages();

    }//GEN-LAST:event_jMenuItemClearActionPerformed
     
    /**
     * This method clears all the messages in the PanelMessages
     */
    public void clearAllMessages(){

        //If PanelMessages is not empty
        if ( !(this.PanelMessages.getComponents().length == 0) ){

            try{

                //Clear all the sended and received messages
                this.PanelMessages.removeAll();

                //Validate the PanelMessages
                this.PanelMessages.validate();

                //Repaint the PanelMessages
                this.PanelMessages.repaint();

                new DebugMessage(this.getClass(), "PanelMessages cleared");

            }catch(Exception e){

                new DebugMessage(this.getClass(), "Cannot clear PanelMessages ", e);

            }

        }else{

            new DebugMessage(this.getClass(), "PanelMessages has nothing to clear");

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSend;
    private javax.swing.JPanel MainFrame;
    private javax.swing.JPanel PanelMessages;
    private javax.swing.JPanel PanelSend;
    private javax.swing.JScrollPane ScrollMessages;
    private javax.swing.JLabel avatar;
    private javax.swing.JPanel avatarPanel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuClose;
    private javax.swing.JMenu jMenuConversation;
    private javax.swing.JMenuItem jMenuItemClear;
    private javax.swing.JPanel jPanelScrollMessages;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField messageField;
    // End of variables declaration//GEN-END:variables

}
