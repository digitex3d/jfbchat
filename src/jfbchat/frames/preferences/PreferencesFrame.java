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

package jfbchat.frames.preferences;

import jfbchat.resources.*;
import jfbchat.debug.DebugMessage;

import javax.swing.ImageIcon;
/**
 * The Preferences Frame
 * @author digitex3d (Giuseppe Federico support@digisoftware.org)
 */
public class PreferencesFrame extends javax.swing.JFrame {

  private GeneralPanel generalPanel;
  private NotificationsPanel notificationPanel;
  private BehaviorPanel behaviorPanel;
  private AspectPanel aspectPanel;

  /** Creates new form PreferencesFrame */
  public PreferencesFrame() {

  notificationPanel = new NotificationsPanel();
  behaviorPanel = new BehaviorPanel();
  aspectPanel = new AspectPanel();
  generalPanel = new GeneralPanel();

  //Load and set the icon.
  try {

    setIconImage(new ImageIcon(getClass().getResource(Imgs.MAINICON)).getImage());

  }catch (Exception e) {

    new DebugMessage(this.getClass(), "Cannot load image " + new ImageIcon(Imgs.MAINICON).toString(), e);

  }

  initComponents();

  TabPreferences.addTab("Aspect", null,aspectPanel,
      "Edit aspect preferences");
  TabPreferences.addTab("Behavior", null,behaviorPanel,
      "Edit behavior preferences");
  TabPreferences.addTab("General", null, generalPanel,
      "Edit general preferences");
  TabPreferences.addTab("Notifications", null,notificationPanel,
      "Edit notifications preferences");

  setLocationRelativeTo(null);

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
  jButtonClose = new javax.swing.JButton();
  TabPreferences = new javax.swing.JTabbedPane();

  setTitle("Preferences");

  jButtonClose.setText("Close");
  jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
    jButtonCloseMouseClicked(evt);
    }
  });

  TabPreferences.setTabPlacement(javax.swing.JTabbedPane.LEFT);

  javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
  MainPanel.setLayout(MainPanelLayout);
  MainPanelLayout.setHorizontalGroup(
    MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(MainPanelLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(TabPreferences, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
      .addComponent(jButtonClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap())
);
  MainPanelLayout.setVerticalGroup(
    MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(TabPreferences, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButtonClose)
    .addContainerGap())
);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);

  pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
  this.setVisible(false);
  }//GEN-LAST:event_jButtonCloseMouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel MainPanel;
  private javax.swing.JTabbedPane TabPreferences;
  private javax.swing.JButton jButtonClose;
  // End of variables declaration//GEN-END:variables

}
