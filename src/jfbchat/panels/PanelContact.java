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
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import jfbchat.Connection;
import jfbchat.Contact;
import jfbchat.Group;
import jfbchat.debug.DebugMessage;
import jfbchat.resources.ChatPreferences;
import jfbchat.resources.Options;


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
    private Group group;


    /** Creates new form PanelContact */
    public PanelContact(Connection connection, Contact contact, String groupName) {


        this.contact = contact;
        this.connection = connection;
        this.avatarIcon = null;
        this.groupName = groupName;

        this.prefs = new ChatPreferences();

        initComponents();

        //Change the cursor to the HAND_CURSOR
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        //Init the contact username
        contactLabel.setText(contact.getUser());

        //Init the avatar
        if( prefs.getPreferences().getBoolean( Options.SHOW_AVATARS, true) ){

            this.avatarLabel1.setVisible(true);

        }else{
            this.avatarLabel1.setVisible(false);
        }


        //Update the status of the contact in the JPanel
        updateStatus();
    }

    /**
     * This method fix the layout of the message and set the maximum Height
     * @return The fixed dimension
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
        contactPanel = new javax.swing.JPanel();
        contactLabel = new javax.swing.JLabel();
        iconPanel = new javax.swing.JPanel();
        statusLabel1 = new jfbchat.labels.StatusLabel();
        avatarLabel1 = new jfbchat.labels.AvatarLabel();

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

        contactPanel.setBackground(new java.awt.Color(255, 255, 255));
        contactPanel.setLayout(new javax.swing.BoxLayout(contactPanel, javax.swing.BoxLayout.LINE_AXIS));

        contactLabel.setBackground(new java.awt.Color(255, 255, 255));
        contactLabel.setFont(new java.awt.Font("Verdana", 1, 14));
        contactLabel.setForeground(new java.awt.Color(51, 102, 204));
        contactLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactLabel.setText("Cotact");
        contactLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contactPanel.add(contactLabel);

        iconPanel.setBackground(new java.awt.Color(255, 255, 255));
        iconPanel.setLayout(new java.awt.BorderLayout());
        iconPanel.add(statusLabel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatarLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(avatarLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents
    
    //TODO:Improve this function 
    /**
     * !!Temporaney function!!: This function show the panel only if the contact
     * is online
     */
    public void uncollapse(){
        if (contact.getPresence().isAway() || (contact.getPresence().isAvailable())){
            setVisible(true);  
            
        }
    }
    /**
     * Update the contact Avatar
     */
    public void updateAvatar(){
        if (contact.getPresence().isAvailable() || 
            contact.getPresence().isAway()){
            //Update the avatarLabel
            this.avatarLabel1.updateAvatarLabel(contact);
            
        }
        
    }
    
    /**
    * Update the status and Avatar of the contact in the JPanel
    * 
    */
    public void updateStatus(){    
        this.group = connection.getContactList().getGroupFromName(groupName);

        if (contact.getPresence().isAvailable() || 
            contact.getPresence().isAway()){
            
            //Group Test
            if ( this.group != null){

                if( this.group.isVisible() ){

                    setVisible(true);
                }else{
                    setVisible(false);
                }
             }
                  
            //Update the StatusLabel
            this.statusLabel1.updateLabel(contact);

        }
        //If the contact is unavailable
        else{
            setVisible(false);
            
        }

    }
    
    //TODO: for the scale option in the preferences
    /**
     * Scale an ImageIcon
     * @param Image to scale
     * @param scale coefficient
     * @return An ImageIcon scaled 
     */ 
    private ImageIcon scale(Image src, double scale) {
        int w = (int)(scale*src.getWidth(this));
        int h = (int)(scale*src.getHeight(this));
        int type = BufferedImage.TYPE_INT_RGB;
        BufferedImage dst = new BufferedImage(w, h, type);
        Graphics2D g2 = dst.createGraphics();
        g2.drawImage(src, 0, 0, w, h, this);
        g2.dispose();
        return new ImageIcon(dst);
    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //If the chat is active in the chatmanager show it.
        contact.initChat(); 
  
   
    }//GEN-LAST:event_formMouseClicked

    /**
     * 
     * @return the groupName associated with the panel
     */
    public String getGroupName(){

        return this.groupName;

    }

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

        Color onMouseOver_c = Options.COLOR_ON_MOUSE_OVER_CONTACT_PANEL;

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
    private jfbchat.labels.AvatarLabel avatarLabel1;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JPanel mainPanel;
    private jfbchat.labels.StatusLabel statusLabel1;
    // End of variables declaration//GEN-END:variables

}
