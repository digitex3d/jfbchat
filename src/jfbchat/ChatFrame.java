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

package jfbchat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.XMPPException;

/**
 *
 * @author peppe
 */
public class ChatFrame extends javax.swing.JFrame {

    private Contact contact;
    private XMPPConnection connection;
    private ChatManager chatmanager;
    private Chat newChat;
    private String contactAdr;

    /** Creates new form ChatFrame */
    public ChatFrame(XMPPConnection connection, Contact contact) {

        this.connection = connection;
        this.contact = contact;
        this.contactAdr = contact.getAdress();

        chatmanager = connection.getChatManager();

        initComponents();
        this.setTitle("Conversation with "+ contact.getUser());
        setVisible(true);

        
        newChat = chatmanager.createChat(contactAdr , new MessageListener() {
            public void processMessage(Chat chat, Message message) {
                
                PanelMessages.add(new PanelMessage(false, chat , message.getBody()));
                System.out.println("Received message: " + message);
            }
           });

           pack();
       
    }

    public ChatFrame(XMPPConnection connection, String contactAdr) {
        this.connection = connection;
        this.contactAdr = contactAdr;

        chatmanager = connection.getChatManager();

        initComponents();
        this.setTitle("Conversation with "+ contactAdr);
        setVisible(true);


        newChat = chatmanager.createChat(contactAdr, new MessageListener() {
            public void processMessage(Chat chat, Message message) {

                PanelMessages.add(new PanelMessage(false, chat , message.getBody()));
                System.out.println("Received message: " + message);
            }
           });

           pack();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollMessages = new javax.swing.JScrollPane();
        PanelMessages = new javax.swing.JPanel();
        PanelSend = new javax.swing.JPanel();
        TextField = new javax.swing.JTextField();
        ButtonSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversation with ...");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        PanelMessages.setLayout(new javax.swing.BoxLayout(PanelMessages, javax.swing.BoxLayout.PAGE_AXIS));
        ScrollMessages.setViewportView(PanelMessages);

        PanelSend.setLayout(new javax.swing.BoxLayout(PanelSend, javax.swing.BoxLayout.LINE_AXIS));

        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });
        PanelSend.add(TextField);

        ButtonSend.setText("Send");
        ButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSendMouseClicked(evt);
            }
        });
        PanelSend.add(ButtonSend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSend, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
            .addComponent(ScrollMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ScrollMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSend, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

    private void ButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSendMouseClicked
        SendMessage();
    }//GEN-LAST:event_ButtonSendMouseClicked

    public void SendMessage(){

        try {

            String texttosend = TextField.getText();

            PanelMessages.add(new PanelMessage(true, null,
                                               texttosend));

            pack();

            newChat.sendMessage(texttosend);

            TextField.setText("");                                               // Clear the TextField
            System.out.println("Sending "+ texttosend +" to " + contactAdr);

        }
        catch (XMPPException e) {
            System.out.println("Error Delivering block");
        }

    }



    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         //TODO: mandare il messaggio quando premo invio
    }//GEN-LAST:event_formKeyPressed

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSend;
    private javax.swing.JPanel PanelMessages;
    private javax.swing.JPanel PanelSend;
    private javax.swing.JScrollPane ScrollMessages;
    private javax.swing.JTextField TextField;
    // End of variables declaration//GEN-END:variables

}
