/*
   To change this template, choose Tools | Templates
   and open the template in the editor.
*/

/*
   JFrameAbout.java

   Created on 9 févr. 2011, 20:37:18
*/

package jfbchat.frames;

import java.awt.Desktop;
import javax.swing.ImageIcon;

import jfbchat.resources.Options;
import jfbchat.resources.Imgs;
import jfbchat.debug.DebugMessage;

import java.net.URI;
import java.net.URISyntaxException;

import java.io.IOException;
import jfbchat.panels.JLinkButton;

public class JFrameAbout extends javax.swing.JFrame {

  private JLinkButton projectWebpageLink;
  /** Creates new form JFrameAbout */
  public JFrameAbout(String version) {
    initComponents();

    // Set icon image
    try {
      // Load and set the icon.
      setIconImage(new javax.swing.ImageIcon(getClass().getResource(Imgs.MAINICON)).getImage());
    } catch (Exception e) {
      new DebugMessage(this.getClass(), "Cannot load image " + new ImageIcon(Imgs.MAINICON).toString(), e);
    }

    projectWebpageLink = new JLinkButton(Options.PROJECT_WEBPAGE);
    jLabelVersion.setText(version);
    projectWebpageLink.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        Desktop desktop = Desktop.getDesktop();
        URI uri = null;

        try {
          uri = new URI(Options.PROJECT_WEBPAGE);
          desktop.browse(uri);
        } catch (IOException ioe) {
          ioe.printStackTrace();
        } catch (URISyntaxException use) {
          use.printStackTrace();
        }
      }
    });
    setLocationRelativeTo(null);
    webPagePanel.add(projectWebpageLink);
  }

  /** This method is called from within the constructor to
    initialize the form.
    WARNING: Do NOT modify this code. The content of this method is
    always regenerated by the Form Editor.
  */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">// GEN-BEGIN:initComponents
  private void initComponents() {
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jButtonClose = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabelVersion = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    webPagePanel = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    setTitle("About");
    setBounds(new java.awt.Rectangle(500, 500, 0, 0));
    setResizable(false);
    jTextArea1.setColumns(20);
    jTextArea1.setEditable(false);
    jTextArea1.setRows(5);
    jTextArea1.setText("\n   JFBChat is a small, simple application specially designed to offer you a Facebook \n   chat client for your desktop.\n\n  Author :  Digitex (Giuseppe Federico) digitex3d@gmail.com");
    jScrollPane1.setViewportView(jTextArea1);
    jButtonClose.setText("Close");
    jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonCloseMouseClicked(evt);
      }
    });
    jLabel1.setText("Version:");
    jLabelVersion.setText("?.?");
    jPanel1.setLayout(new java.awt.BorderLayout());
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jfbchat/imgs/Logo_Text.png"))); // NOI18N
    jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);
    webPagePanel.setLayout(new javax.swing.BoxLayout(webPagePanel, javax.swing.BoxLayout.LINE_AXIS));
    jLabel3.setText("WebPage");
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602,
                                        Short.MAX_VALUE)
                          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                          .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelVersion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(webPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(jButtonClose)))
                .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(webPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                          .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelVersion)
                                    .addComponent(jLabel3)))
                .addContainerGap())
    );
    pack();
  }// </editor-fold>// GEN-END:initComponents

  private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonCloseMouseClicked
    setVisible(false);
  }// GEN-LAST:event_jButtonCloseMouseClicked

  // Variables declaration - do not modify// GEN-BEGIN:variables
  private javax.swing.JButton jButtonClose;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelVersion;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JPanel webPagePanel;
  // End of variables declaration// GEN-END:variables

}
