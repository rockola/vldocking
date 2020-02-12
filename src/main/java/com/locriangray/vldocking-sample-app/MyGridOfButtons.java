package com.locriangray.vldockingSampleApp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
  The Grid of Buttons component

  This component simulates a palette window, or any command component
  used to modify, say, the TextEditor contents.
*/

class MyGridOfButtons extends JPanel {

  public MyGridOfButtons() {
    setLayout(new FlowLayout(FlowLayout.TRAILING, 3, 3));

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        add(new JButton("btn" + (i * 3 + j)));
      }
    }

    setPreferredSize(new Dimension(200, 300));
  }
}
