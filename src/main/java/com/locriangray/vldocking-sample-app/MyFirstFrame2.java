package com.locriangray.vldockingSampleApp;

import com.vlsolutions.swing.docking.DockingConstants;
import com.vlsolutions.swing.docking.DockingDesktop;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
  Creating the Frame

  Our frame object will be a standard JFrame subclass, with a main()
  method for testing purposes.
*/

public class MyFirstFrame2 extends JFrame {

  MyTextEditor2 editorPanel = new MyTextEditor2();
  MyTree2 treePanel = new MyTree2();
  MyGridOfButtons2 buttonGrid = new MyGridOfButtons2();
  MyJTable2 tablePanel = new MyJTable2();
  DockingDesktop desk = new DockingDesktop();

  public MyFirstFrame2() {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    // desk becomes the only one component
    getContentPane().add(desk);
    desk.addDockable(editorPanel);
    desk.split(editorPanel, treePanel, DockingConstants.SPLIT_LEFT);
    desk.split(editorPanel, buttonGrid, DockingConstants.SPLIT_RIGHT);
    desk.split(buttonGrid, tablePanel, DockingConstants.SPLIT_BOTTOM);
  }

  public static void main(String[] args) {
    final MyFirstFrame2 frame = new MyFirstFrame2();
    frame.setSize(800, 600);
    frame.validate();
    SwingUtilities.invokeLater(
        new Runnable() {
          // in the event dispatch thread
          public void run() {
            frame.setVisible(true);
          }
        });
  }
}
