package com.jdevbook.chap10;
import oracle.ide.Ide;
import oracle.ide.addin.Addin;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import oracle.ide.IdeAction;
import oracle.ide.MainWindow;
import javax.swing.JMenu;
import oracle.ide.addin.Controller;
import oracle.ide.addin.Context;
import oracle.ide.log.LogPage;

public class LogExtension implements Addin, Controller 
{
  // %%TODO: Change this ID to something related to your command
  public static final int MYCOMMAND_CMD_ID = Ide.newCmd("com.jdevbook.chap10.LogExtension.MYCOMMAND_CMD_ID");


  private JMenuItem menuItem = null;
  public LogExtension()
  {
  }

  public void initialize()
  {
    // Do not do major initialization here, it can slow down the startup of JDeveloper
    JMenuItem mainMenuItem = createMenu_MYCOMMAND_CMD_ID("Menu16x16.gif", "LogExtension", 76);
    JMenu mainMenu = MainWindow.Tools;
    mainMenu.add(mainMenuItem);
  }

  public void shutdown()
  {
    // Do any necessary cleanup here
  }

  public float version()
  {
    // return the version of your extension
    return 1.0f;
  }

  public float ideVersion()
  {
    return Ide.IDE_VERSION;
  }

  public boolean canShutdown()
  {
    return true;
  }

  private Icon loadIcon(String iconName)
  {
    URL url = getClass().getResource(iconName);
    Icon icon = null;
    if (url != null)
    {
      icon = new ImageIcon(url);
    }
    return icon;
  }

  private JMenuItem createMenu_MYCOMMAND_CMD_ID(String iconName, String menuLabel, int mnemonic)
  {
    // String class name which extends oracle.ide.addin.AbstractCommand or null
    String cmdClass = null;
    // Category of the keymap to which this entry belongs
    String category = null;
    // Icon for the menu item
    Icon icon = loadIcon(iconName);
    // Data to be associated with the Action
    Object data = null;
    // Should the action be enabled by default
    boolean enabled = true;

    IdeAction action;
    // Create the IdeAction
    action = IdeAction.get(MYCOMMAND_CMD_ID, cmdClass, menuLabel, category, new Integer(mnemonic), icon, data, enabled);
    // Set the default controller for this action
    action.setController(this);
    // Create MenuItem
    JMenuItem menuItem = Ide.getMenubar().createMenuItem(action);
    return menuItem;
  }

  public Controller supervisor()
  {
    return null;
  }

  public boolean handleEvent(IdeAction action, Context context)
  {
    final int cmdId = action.getCommandId();
    if (cmdId == com.jdevbook.chap10.LogExtension.MYCOMMAND_CMD_ID)
    {
      executeCommand();
      return true;
    }
    return false;
  }

  private boolean executeCommand()
  {
    LogPage logPage = Ide.getLogManager().getMsgPage();
    logPage.log("Date & Time: "+ new java.util.Date()+"\n");    
    logPage.log("java.home = "+System.getProperty("java.home"));
    return true;
  }

  public boolean update(IdeAction action, Context context)
  {
    final int cmdId = action.getCommandId();
    if (cmdId == com.jdevbook.chap10.LogExtension.MYCOMMAND_CMD_ID)
    {
      action.setEnabled(is_MYCOMMAND_CMD_ID_Available(context));
      return true;
    }
    return false;
  }

  private boolean is_MYCOMMAND_CMD_ID_Available(Context context)
  {
    // %%TODO: Modify this method to the enabled state of the command.
    return true;
  }

  public void checkCommands(Context action, Controller controller)
  {
    // If your command is on the main menu and has an accelerator you need to call update from here
    // If your command is on the toolbar then you also must call update from here
  }
}