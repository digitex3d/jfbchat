/*
   To change this template, choose Tools | Templates
   and open the template in the editor.
*/

/*
   NotificationsPanel.java

   Created on 10 mars 2011, 16:10:29
*/

package jfbchat.frames.preferences;

import jfbchat.resources.Options;
import jfbchat.resources.ChatPreferences;

import javax.swing.JCheckBox;
/**

   @author peppe
*/
public class NotificationsPanel extends javax.swing.JPanel {

  private ChatPreferences prefs;

  /** Creates new form NotificationsPanel */
  public NotificationsPanel() {
    initComponents();
    // Init the preferences
    prefs = new ChatPreferences();
    // Init the options
    CheckEnableIncomingMsgSnd.setSelected(prefs.getPreferences().getBoolean(Options.INCOMING_SOUND, true));
    CheckSendedMsgSnd.setSelected(prefs.getPreferences().getBoolean(Options.SENDED_SOUND, true));
    jCheckBoxShow.setSelected(prefs.getPreferences().getBoolean(Options.NOTIFICATION_FRAME, true));
    jCheckBoxNotificationFrameSnd.setSelected(prefs.getPreferences().getBoolean(Options.NOTIFICATION_FRAME_SND, true));
  }

  /** This method is called from within the constructor to
    initialize the form.
    WARNING: Do NOT modify this code. The content of this method is
    always regenerated by the Form Editor.
  */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">// GEN-BEGIN:initComponents
  private void initComponents() {
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    CheckEnableIncomingMsgSnd = new javax.swing.JCheckBox();
    CheckSendedMsgSnd = new javax.swing.JCheckBox();
    jPanel3 = new javax.swing.JPanel();
    jCheckBoxNotificationFrameSnd = new javax.swing.JCheckBox();
    jPanelNotificationsFrames = new javax.swing.JPanel();
    jCheckBoxShow = new javax.swing.JCheckBox();
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sounds"));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Messages"));
    CheckEnableIncomingMsgSnd.setText("Notification sound for incoming messages");
    CheckEnableIncomingMsgSnd.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        CheckEnableIncomingMsgSndItemStateChanged(evt);
      }
    });
    CheckSendedMsgSnd.setText("Notification sound for sended messages");
    CheckSendedMsgSnd.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        CheckSendedMsgSndItemStateChanged(evt);
      }
    });
    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(CheckEnableIncomingMsgSnd)
                          .addComponent(CheckSendedMsgSnd))
                .addContainerGap(70, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(CheckEnableIncomingMsgSnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckSendedMsgSnd))
    );
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Notification Frame"));
    jCheckBoxNotificationFrameSnd.setText("Play a sound when the notification frame appears");
    jCheckBoxNotificationFrameSnd.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jCheckBoxNotificationFrameSndItemStateChanged(evt);
      }
    });
    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBoxNotificationFrameSnd)
                .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBoxNotificationFrameSnd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                          .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
    );
    jPanelNotificationsFrames.setBorder(javax.swing.BorderFactory.createTitledBorder("Frames"));
    jCheckBoxShow.setText("Show a notification frame when a contact goes online");
    jCheckBoxShow.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jCheckBoxShowItemStateChanged(evt);
      }
    });
    javax.swing.GroupLayout jPanelNotificationsFramesLayout = new javax.swing.GroupLayout(jPanelNotificationsFrames);
    jPanelNotificationsFrames.setLayout(jPanelNotificationsFramesLayout);
    jPanelNotificationsFramesLayout.setHorizontalGroup(
      jPanelNotificationsFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelNotificationsFramesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxShow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelNotificationsFramesLayout.setVerticalGroup(
      jPanelNotificationsFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelNotificationsFramesLayout.createSequentialGroup()
                .addComponent(jCheckBoxShow)
                .addContainerGap(16, Short.MAX_VALUE))
    );
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                          .addComponent(jPanelNotificationsFrames, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNotificationsFrames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE)
                .addContainerGap())
    );
  }// </editor-fold>// GEN-END:initComponents

  private void CheckEnableIncomingMsgSndItemStateChanged(java.awt.event.ItemEvent
      evt) {// GEN-FIRST:event_CheckEnableIncomingMsgSndItemStateChanged
    // Get the item
    JCheckBox item = (JCheckBox) evt.getItem();
    // Change the value in the preferences with the value of the checkbox
    prefs.getPreferences().putBoolean(Options.INCOMING_SOUND, item.isSelected());
  }// GEN-LAST:event_CheckEnableIncomingMsgSndItemStateChanged

  private void CheckSendedMsgSndItemStateChanged(java.awt.event.ItemEvent
      evt) {// GEN-FIRST:event_CheckSendedMsgSndItemStateChanged
    // Get the item
    JCheckBox item = (JCheckBox) evt.getItem();
    // Change the value in the preferences with the value of the checkbox
    prefs.getPreferences().putBoolean(Options.SENDED_SOUND, item.isSelected());
  }// GEN-LAST:event_CheckSendedMsgSndItemStateChanged

  private void jCheckBoxShowItemStateChanged(java.awt.event.ItemEvent
      evt) {// GEN-FIRST:event_jCheckBoxShowItemStateChanged
    // Get the item
    JCheckBox item = (JCheckBox) evt.getItem();
    // Change the value in the preferences with the value of the checkbox
    prefs.getPreferences().putBoolean(Options.NOTIFICATION_FRAME, item.isSelected());
  }// GEN-LAST:event_jCheckBoxShowItemStateChanged

  private void jCheckBoxNotificationFrameSndItemStateChanged(java.awt.event.ItemEvent
      evt) {// GEN-FIRST:event_jCheckBoxNotificationFrameSndItemStateChanged
    // Get the item
    JCheckBox item = (JCheckBox) evt.getItem();
    // Change the value in the preferences with the value of the checkbox
    prefs.getPreferences().putBoolean(Options.NOTIFICATION_FRAME_SND, item.isSelected());
  }// GEN-LAST:event_jCheckBoxNotificationFrameSndItemStateChanged

  // Variables declaration - do not modify// GEN-BEGIN:variables
  private javax.swing.JCheckBox CheckEnableIncomingMsgSnd;
  private javax.swing.JCheckBox CheckSendedMsgSnd;
  private javax.swing.JCheckBox jCheckBoxNotificationFrameSnd;
  private javax.swing.JCheckBox jCheckBoxShow;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanelNotificationsFrames;
  // End of variables declaration// GEN-END:variables

}
