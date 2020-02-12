package com.locriangray.vldockingSampleApp;

import com.vlsolutions.swing.docking.DockKey;
import com.vlsolutions.swing.docking.Dockable;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

/*
  The JTree component

  This component is a simple JTree, and like for TextEditor, we will
  start with a JPanel containing a JScrollPane, containing the JTree,
  for extension purposes.
*/

class MyTree2 extends JPanel implements Dockable {
  DockKey key = new DockKey("tree");
  JTree tree = new JTree();

  public MyTree2() {
    setLayout(new BorderLayout());

    JScrollPane jsp = new JScrollPane(tree);
    jsp.setPreferredSize(new Dimension(200, 200));
    add(jsp, BorderLayout.CENTER);
  }

  public DockKey getDockKey() {
    return key;
  }

  public Component getComponent() {
    return this;
  }
}
