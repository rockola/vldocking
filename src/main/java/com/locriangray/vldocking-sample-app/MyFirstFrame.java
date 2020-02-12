package com.locriangray.vldockingSampleApp;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
  Creating the Frame

  Our frame object will be a standard JFrame subclass, with a main()
  method for testing purposes.
*/

public class MyFirstFrame extends JFrame {

  MyTextEditor editorPanel = new MyTextEditor();
  MyTree treePanel = new MyTree();
  MyGridOfButtons buttonGrid = new MyGridOfButtons();
  MyJTable tablePanel = new MyJTable();

  public MyFirstFrame() {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    getContentPane().add(editorPanel, BorderLayout.CENTER);
    getContentPane().add(treePanel, BorderLayout.WEST);
    getContentPane().add(buttonGrid, BorderLayout.NORTH);
    getContentPane().add(tablePanel, BorderLayout.EAST);
  }

  public static void main(String[] args) {
    final MyFirstFrame frame = new MyFirstFrame();
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
