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

package jfbchat.panels;

import java.awt.Color;
import javax.swing.ImageIcon;
import jfbchat.Connection;
import jfbchat.Contact;

import jfbchat.resources.*;
import jfbchat.debug.DebugMessage;


/**
 * A JPanel that represent a contact in the ContactList
 * @author Digitex (Giuseppe Federico - digtex3d@gmail.com)
 */

public class PanelContact extends javax.swing.JPanel {

    private final int MAX_DIMENSION = 32767;

    private Contact contact;
    private Connection connection;
    private ImageIcon avatarIcon;
    private String groupName;
    private ChatPreferences prefs;
   


    /** Creates new form PanelContact */
    public PanelContact(Connection connection, Contact contact, String groupName) {


        this.contact = contact;
        this.connection = connection;
        this.avatarIcon = null;
        this.groupName = groupName;

        this.prefs = new ChatPreferences();

        initComponents();

        //Init the contact username
        contactLabel.setText(contact.getUser());

        //Init the avatar
        if( prefs.getPreferences().getBoolean( Options.SHOW_AVATARS, true) ){

            this.contactAvatar.setVisible(true);

        }else{
            this.contactAvatar.setVisible(false);
        }


        //Update the status of the contact in the JPanel
        update(contact);
    }

    /**
     * This method fix the layout of the message and set the maximum Height
     * @return
     */
    @Override
    public java.awt.Dimension getMaximumSize() {

        int fixed_height = (int) getPreferredSize().getHeight();
        java.awt.Dimension fixedDimension;

        fixedDimension = new java.awt.Dimension( MAX_DIMENSION ,fixed_height);

        return fixedDimension;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        contactAvatar = new javax.swing.JLabel();
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        iconPanel = new javax.swing.JPanel();
        stateIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMinimumSize(new java.awt.Dimension(0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        contactAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/facebook_avatar.png"))); // NOI18N
        contactAvatar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contactAvatar.setPreferredSize(new java.awt.Dimension(56, 56));

        contactPanel.setBackground(new java.awt.Color(255, 255, 255));
        contactPanel.setLayout(new javax.swing.BoxLayout(contactPanel, javax.swing.BoxLayout.LINE_AXIS));

        contactLabel.setBackground(new java.awt.Color(255, 255, 255));
        contactLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(51, 102, 204));
        contactLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactLabel.setText("Cotact");
        contactLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contactPanel.add(contactLabel);

        iconPanel.setBackground(new java.awt.Color(255, 255, 255));
        iconPanel.setLayout(new java.awt.BorderLayout());

        stateIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/availableIcon.png"))); // NOI18N
        iconPanel.add(stateIcon, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(contactAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Update the status of the contact in the JPanel
     * @param the contact associated to this JPanel
     */

    public void update(Contact contact){



        this.contact = contact;

        if (contact.getPresence().isAway()){

            if ( avatarIcon == null){

                try{

                    //Load the avatar
                    contact.getVCard().loadAvatar();
                    //Store the icon in avatarIcon
                    avatarIcon = contact.getVCard().getAvatar();
                    if (avatarIcon != null){
                        //Set the icon
                        contactAvatar.setIcon(avatarIcon);
                    }

                }

                catch(Exception e){

                    System.out.printf(e.getMessage());

                }
            }

            stateIcon.setIcon(new ImageIcon(getClass().getResource(Imgs.AWAY_ICON)));
            setVisible(true);


        }else if ((contact.getPresence().isAvailable())){

            stateIcon.setIcon(new ImageIcon(getClass().getResource(Imgs.AVAILABLE_ICON)));
            setVisible(true);
            
            if ( avatarIcon == null){

                try{

                    //Load the avatar
                    contact.getVCard().loadAvatar();
                    //Store the icon in avatarIcon
                    avatarIcon = contact.getVCard().getAvatar();
                    if (avatarIcon != null){
                        //Set the icon
                        contactAvatar.setIcon(avatarIcon);
                    }

                }

                catch(Exception e){

                    System.out.printf(e.getMessage());

                }
            }

            

       }

            else{
                setVisible(false);
            }

        
    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        if (contact.isActive()){

            //If the chat is present in the chatmanager show it.
            if (contact.getChatFrame().isVisible() == false){

                  contact.getChatFrame().setVisible(true);

                        
            }

            new DebugMessage("Contact clicked: The chat is already "
                    + "present in the chat manager");
            
        }
        else{

            /**If the chat is NOT present in the chatmanager then add it and
             * set the contact active true
             */

            contact.setActive(true);
            contact.addToChatManager();
            
        }
    }//GEN-LAST:event_formMouseClicked

    /**
     * 
     * @return the groupName associated with the panel
     */
    public String getGroupName(){

        return this.groupName;

    }

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

        Color onMouseOver_c = new Color(51,102,204);

        this.setBackground(onMouseOver_c);
        mainPanel.setBackground(onMouseOver_c);
        iconPanel.setBackground(onMouseOver_c);
        contactPanel.setBackground(onMouseOver_c);

        contactLabel.setForeground(Color.white);

    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(Color.white);
        mainPanel.setBackground(Color.white);
        iconPanel.setBackground(Color.white);
        contactPanel.setBackground(Color.white);

        contactLabel.setForeground(new Color(51,102,204));
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactAvatar;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel stateIcon;
    // End of variables declaration//GEN-END:variables

}
