package myui;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBoxMenuItem;

public class Frame1 extends JFrame
{
  private JLabel statusBar = new JLabel();
  private JMenu menuHelp = new JMenu();
  private JMenuItem menuFileExit = new JMenuItem();
  private JMenu menuFile = new JMenu();
  private JMenuBar menuBar = new JMenuBar();
  private JPanel panelCenter = new JPanel();
  private BorderLayout layoutMain = new BorderLayout();
  private JComboBox jComboBox1 = new JComboBox();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JMenuItem jMenuItem1 = new JMenuItem();

  public Frame1()
  {
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

  }

  private void jbInit() throws Exception
  {
    this.setJMenuBar(menuBar);
    this.getContentPane().setLayout(layoutMain);
    panelCenter.setLayout(null);
    jComboBox1.setBounds(new Rectangle(155, 45, 124, 20));
    jComboBox1.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          jComboBox1_actionPerformed(e);
        }
      });
    jLabel1.setText("Country");
    jLabel1.setBounds(new Rectangle(40, 50, 105, 15));
    jLabel1.setForeground(Color.blue);
    jLabel1.setFont(new Font("Arial", 0, 13));
    jLabel2.setText("Captain Name");
    jLabel2.setBounds(new Rectangle(40, 105, 105, 15));
    jLabel2.setForeground(Color.blue);
    jLabel2.setFont(new Font("Arial", 0, 13));
    jLabel3.setText("Odds");
    jLabel3.setBounds(new Rectangle(40, 165, 105, 15));
    jLabel3.setForeground(Color.blue);
    jLabel3.setFont(new Font("Arial", 0, 13));
    jTextField1.setBounds(new Rectangle(155, 100, 125, 20));
    jTextField1.setEditable(false);
    jTextField1.setEnabled(false);
    jTextField2.setBounds(new Rectangle(155, 160, 125, 20));
    jTextField2.setEditable(false);
    jTextField2.setEnabled(false);
    jMenuItem1.setText("About");
    jMenuItem1.setRolloverEnabled(true);
    jMenuItem1.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          helpAbout_ActionPerformed(e);
        }
      });
    this.setSize(new Dimension(400, 300));
    this.setTitle("Team Info Application");
    this.setResizable(false);
    menuFile.setText("File");
    menuFile.setRolloverEnabled(false);
    menuFile.setForeground(Color.blue);
    menuFileExit.setText("Exit");
    menuFileExit.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent ae)
        {
          fileExit_ActionPerformed(ae);
        }
      });
    menuHelp.setText("Help");
    menuHelp.setForeground(Color.blue);
    statusBar.setText("***");
    menuFile.add(menuFileExit);
    menuBar.add(menuFile);
    menuHelp.add(jMenuItem1);
    menuBar.add(menuHelp);
    this.getContentPane().add(statusBar, BorderLayout.SOUTH);
    panelCenter.add(jTextField2, null);
    panelCenter.add(jTextField1, null);
    panelCenter.add(jLabel3, null);
    panelCenter.add(jLabel2, null);
    panelCenter.add(jLabel1, null);
    panelCenter.add(jComboBox1, null);
    //Countries participating in the Cup.
    jComboBox1.addItem("Select Country");
    jComboBox1.addItem("India");
    jComboBox1.addItem("Australia");
    jComboBox1.addItem("South Africa");
    jComboBox1.addItem("England");
    jComboBox1.addItem("Pakistan");
    jComboBox1.addItem("Canada");


    this.getContentPane().add(panelCenter, BorderLayout.CENTER);
  }

  void fileExit_ActionPerformed(ActionEvent e)
  {
    System.exit(0);
  }

  void helpAbout_ActionPerformed(ActionEvent e)
  {
    JOptionPane.showMessageDialog(this, new Frame1_AboutBoxPanel1()
        , "About", JOptionPane.PLAIN_MESSAGE);
  }

  private void jComboBox1_actionPerformed(ActionEvent e)
  {
      String strSelItem= jComboBox1.getSelectedItem().toString();

      if(strSelItem.equalsIgnoreCase("India"))
      {
          statusBar.setText(
            "***Winners in 1983, India have a good chance this time round");
          jTextField1.setText("Saurav Ganguly");
          jTextField2.setText("13 / 2");
      }
      else if(strSelItem.equalsIgnoreCase("Australia"))
      {
          statusBar.setText(
            "*** Australia has won the cup twice before, in 1987 and 1999");
          jTextField1.setText("Ricky Ponting");
          jTextField2.setText("11 / 8");
      }
      else if(strSelItem.equalsIgnoreCase("England"))
      {
          statusBar.setText(
            "*** England has never won the cup. Maybe this time...");
          jTextField1.setText("Naseer Hussain");
          jTextField2.setText("25 / 1");
      }
      else if(strSelItem.equalsIgnoreCase("South Africa"))
      {
          statusBar.setText(
            "*** Have the home advantage. This could be their year");
          jTextField1.setText("Shawn Polock");
          jTextField2.setText("11 / 4");
      }
      else if(strSelItem.equalsIgnoreCase("Pakistan"))
      {
          statusBar.setText(
            "*** As unpredictable as ever. They were champions in 1992");
          jTextField1.setText("Waqar Younis");
          jTextField2.setText("12 / 1");
      }
      else if(strSelItem.equalsIgnoreCase("Canada"))
      {
          statusBar.setText(
            "*** Very new to international cricket. Their time will come");
          jTextField1.setText("-------");
          jTextField2.setText("5000 / 1");
      }
      else if(strSelItem.equalsIgnoreCase("Select Country"))
      {
          statusBar.setText("***");
          jTextField1.setText("");
          jTextField2.setText("");
      }

  }



}