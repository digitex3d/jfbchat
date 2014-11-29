/*
   To change this template, choose Tools | Templates
   and open the template in the editor.
*/

/*
   PanelGroup.java

   Created on 28 févr. 2011, 20:59:32
*/

package jfbchat.panels;

import jfbchat.Group;
import jfbchat.resources.*;

import java.awt.*;

/**
    A Panel with the associated group name

   @author Digitex (Giuseppe Federico - digitex3d@gmail.com)
*/
public class PanelGroup extends javax.swing.JPanel {

  private final int MAX_DIMENSION = 32767;
  private Group group;
  private ChatPreferences prefs;

  /** Creates new form PanelGroup */
  public PanelGroup(String name, Group group) {
    initComponents();
    this.prefs = new ChatPreferences();
    // Change the cursor to the HAND_CURSOR
    this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    jLabelGroupName.setText(name);
    this.group = group;
    updatePanel();
  }

  public void updatePanel() {
    if (this.prefs.getPreferences().getBoolean(Options.SHOW_EMPTY_GROUPS, false)) {
      this.collapseGroupLabel.setVisible(group.hasConnectedContacts());
      this.setVisible(true);
    } else {
      this.setVisible(group.hasConnectedContacts());
    }
  }

  /** This method is called from within the constructor to
    initialize the form.
    WARNING: Do NOT modify this code. The content of this method is
    always regenerated by the Form Editor.
  */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">// GEN-BEGIN:initComponents
  private void initComponents() {
    jPanelMain = new javax.swing.JPanel();
    groupNamePanel = new javax.swing.JPanel();
    jLabelGroupName = new javax.swing.JLabel();
    collapseButtonPanel = new javax.swing.JPanel();
    collapseGroupLabel = new javax.swing.JLabel();
    barPanel = new javax.swing.JPanel();
    jSeparator1 = new javax.swing.JSeparator();
    setBackground(new java.awt.Color(255, 255, 255));
    addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        formMouseClicked(evt);
      }
    });
    setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
    groupNamePanel.setBackground(new java.awt.Color(255, 255, 255));
    groupNamePanel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        groupNamePanelMouseClicked(evt);
      }
    });
    jLabelGroupName.setBackground(new java.awt.Color(136, 136, 136));
    jLabelGroupName.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
    jLabelGroupName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabelGroupName.setText("groupName");
    javax.swing.GroupLayout groupNamePanelLayout = new javax.swing.GroupLayout(groupNamePanel);
    groupNamePanel.setLayout(groupNamePanelLayout);
    groupNamePanelLayout.setHorizontalGroup(
      groupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(groupNamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelGroupName))
    );
    groupNamePanelLayout.setVerticalGroup(
      groupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabelGroupName, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
    );
    collapseButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
    collapseGroupLabel.setBackground(new java.awt.Color(208, 239, 238));
    collapseGroupLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    collapseGroupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    collapseGroupLabel.setText(" - ");
    javax.swing.GroupLayout collapseButtonPanelLayout = new javax.swing.GroupLayout(collapseButtonPanel);
    collapseButtonPanel.setLayout(collapseButtonPanelLayout);
    collapseButtonPanelLayout.setHorizontalGroup(
      collapseButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(collapseGroupLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27,
                    Short.MAX_VALUE)
    );
    collapseButtonPanelLayout.setVerticalGroup(
      collapseButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(collapseGroupLabel)
    );
    barPanel.setBackground(new java.awt.Color(255, 255, 255));
    javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
    barPanel.setLayout(barPanelLayout);
    barPanelLayout.setHorizontalGroup(
      barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
    );
    barPanelLayout.setVerticalGroup(
      barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))
    );
    javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
    jPanelMain.setLayout(jPanelMainLayout);
    jPanelMainLayout.setHorizontalGroup(
      jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(groupNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collapseButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanelMainLayout.setVerticalGroup(
      jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(collapseButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(groupNamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(barPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    add(jPanelMain);
  }// </editor-fold>// GEN-END:initComponents

  private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
    if (this.group.isVisible()) {
      this.collapseGroupLabel.setText(" + ");
      this.group.hideContacts();
    } else {
      this.collapseGroupLabel.setText(" - ");
      this.group.showContacts();
    }
  }// GEN-LAST:event_formMouseClicked

  private void groupNamePanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_groupNamePanelMouseClicked
    if (this.group.isVisible()) {
      this.collapseGroupLabel.setText(" + ");
      this.group.hideContacts();
    } else {
      this.collapseGroupLabel.setText(" - ");
      this.group.showContacts();
    }
  }// GEN-LAST:event_groupNamePanelMouseClicked

  /**
    This method fix the layout of the message and set the maximum Height
    @return
  */
  @Override
  public java.awt.Dimension getMaximumSize() {
    int fixed_height = (int) getPreferredSize().getHeight();
    java.awt.Dimension fixedDimension;
    fixedDimension = new java.awt.Dimension(MAX_DIMENSION , fixed_height);
    return fixedDimension;
  }

  // Variables declaration - do not modify// GEN-BEGIN:variables
  private javax.swing.JPanel barPanel;
  private javax.swing.JPanel collapseButtonPanel;
  private javax.swing.JLabel collapseGroupLabel;
  private javax.swing.JPanel groupNamePanel;
  private javax.swing.JLabel jLabelGroupName;
  private javax.swing.JPanel jPanelMain;
  private javax.swing.JSeparator jSeparator1;
  // End of variables declaration// GEN-END:variables

}
