package com.jdevbook.chap7;
import java.awt.*;
import javax.swing.*;
import oracle.jbo.uicli.jui.*;
import oracle.jbo.uicli.controls.*;
import oracle.jbo.uicli.binding.*;
import oracle.jdeveloper.layout.*;
import oracle.adf.model.*;
import oracle.adf.model.binding.*;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.ButtonModel;

public class CourseStudentPanel extends JPanel implements JUPanel 
{
// Panel binding definition used by design time
  private JUPanelBinding panelBinding = new JUPanelBinding("CourseStudentPanelUIModel");
  private JLabel jLabel1 = new JLabel();
  private JScrollPane jScrollPane1 = new JScrollPane();
  private JScrollPane jScrollPane2 = new JScrollPane();
  private JTable jTable1 = new JTable();
  private JTable jTable2 = new JTable();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();

  /**
   * 
   *  The default constructor for panel
   */
  public CourseStudentPanel()
  {
  }

  /**
   * 
   *  the JbInit method
   */
  public void jbInit()
  {
    this.setLayout(null);
    jLabel1.setText("Course - Student JClient App");
    jLabel1.setBounds(new Rectangle(45, 10, 295, 20));
    jLabel1.setFont(new Font("Arial", 1, 13));
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setForeground(Color.blue);
    jScrollPane1.setBounds(new Rectangle(65, 75, 260, 70));
    jScrollPane2.setBounds(new Rectangle(65, 160, 260, 75));
    jButton1.setText("First");
    jButton1.setBounds(new Rectangle(25, 45, 80, 20));
    jButton2.setText("Next");
    jButton2.setBounds(new Rectangle(115, 45, 80, 20));
    jButton3.setText("Previous");
    jButton3.setBounds(new Rectangle(200, 45, 80, 20));
    jButton4.setText("Last");
    jButton4.setBounds(new Rectangle(290, 45, 80, 20));
    this.add(jButton4, null);
    this.add(jButton3, null);
    this.add(jButton2, null);
    this.add(jButton1, null);
    jScrollPane2.getViewport().add(jTable2, null);
    this.add(jScrollPane2, null);
    jScrollPane1.getViewport().add(jTable1, null);
    this.add(jScrollPane1, null);
    this.add(jLabel1, null);
    jTable1.setModel((TableModel)panelBinding.bindUIControl("CourseView1", jTable1));
    jTable2.setModel((TableModel)panelBinding.bindUIControl("StudentView2", jTable2));
    jButton1.setModel((ButtonModel)panelBinding.bindUIControl("First", jButton1));
    jButton2.setModel((ButtonModel)panelBinding.bindUIControl("Next", jButton2));
    jButton3.setModel((ButtonModel)panelBinding.bindUIControl("Previous", jButton3));
    jButton4.setModel((ButtonModel)panelBinding.bindUIControl("Last", jButton4));
  }

  public static void main(String [] args)
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception exemp)
    {
      exemp.printStackTrace();
    }

    CourseStudentPanel panel = new CourseStudentPanel();
    panel.setBindingContext(JUTestFrame.startTestFrame("DataBindings.cpx", "null", panel, panel.getPanelBinding(), new Dimension(400, 300)));
    panel.revalidate();
  }

  /**
   * 
   *  JUPanel implementation
   */
  public JUPanelBinding getPanelBinding()
  {
    return panelBinding;
  }

  public void setBindingContext(BindingContext bindCtx)
  {
    if (panelBinding.getPanel() == null)
    {
      panelBinding = panelBinding.setup(bindCtx, this);
      try
      {
        jbInit();
        panelBinding.refreshControl();
      }
      catch(Exception ex)
      {
        panelBinding.reportException(ex);
      }

    }
  }
}