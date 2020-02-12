package com.locriangray.vldockingSampleApp;

import com.vlsolutions.swing.docking.DockKey;
import com.vlsolutions.swing.docking.Dockable;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
  The Grid of Buttons component

  This component simulates a palette window, or any command component
  used to modify, say, the TextEditor contents.
*/

class MyGridOfButtons2 extends JPanel implements Dockable {
  DockKey key = new DockKey("grid");

  public MyGridOfButtons2() {
    setLayout(new FlowLayout(FlowLayout.TRAILING, 3, 3));

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        add(new JButton("btn" + (i * 3 + j)));
      }
    }

    setPreferredSize(new Dimension(200, 300));
  }

  public DockKey getDockKey() {
    return key;
  }

  public Component getComponent() {
    return this;
  }
}
