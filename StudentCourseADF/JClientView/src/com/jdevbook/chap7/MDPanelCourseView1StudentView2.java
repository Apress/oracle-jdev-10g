package com.jdevbook.chap7;
import java.awt.*;
import javax.swing.*;
import oracle.jbo.uicli.jui.*;
import oracle.jbo.uicli.binding.JUApplication;
import oracle.jbo.uicli.controls.*;
import oracle.adf.model.*;
import oracle.adf.model.binding.*;
import oracle.jdeveloper.layout.*;

public class MDPanelCourseView1StudentView2 extends JPanel implements JUPanel 
{
// Panel layout
  private GridLayout panelLayout = new GridLayout(2, 1);
// The scrollers
  private JScrollPane masterScroller = new JScrollPane();
  private JScrollPane detailScroller = new JScrollPane();

// Panel binding definition used by design time

  private JUPanelBinding panelBinding = new JUPanelBinding("MDPanelCourseView1StudentView2UIModel");

// The master panel definition

  private PanelCourseView1 masterViewPanel = new PanelCourseView1();
// The detail panel definition
  private PanelStudentView2 detailViewPanel = new PanelStudentView2();




  /**
   * 
   *  The default constructor for master-detail panel
   */
  public MDPanelCourseView1StudentView2()
  {
  }

  /**
   * 
   *  the JbInit method
   */
  public void jbInit() throws Exception
  {
    // Panel layout
    BindingContext _bctx = panelBinding.getBindingContext();
    masterViewPanel.setBindingContext(_bctx);
    detailViewPanel.setBindingContext(_bctx);
    this.setLayout(panelLayout);
    add(masterViewPanel);
    add(detailViewPanel);



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

    MDPanelCourseView1StudentView2 panel = new MDPanelCourseView1StudentView2();
    panel.setBindingContext(JUTestFrame.startTestFrame("DataBindings.cpx", "com_jdevbook_chap7_model_AppModuleDataControl", panel, panel.getPanelBinding(), new Dimension(400, 300)));
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