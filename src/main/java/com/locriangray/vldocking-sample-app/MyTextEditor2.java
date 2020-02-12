package com.locriangray.vldockingSampleApp;

import com.vlsolutions.swing.docking.DockKey;
import com.vlsolutions.swing.docking.Dockable;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
  Lesson 1 - Page 2 : My First Application

  And now... Docking !

  Here is the receipe to transform our application into a docking-enabled application :

  Have the GUI blocks (our four components) implement the Dockable interface

  Install a DockingDesktop on our Frame

  Add the dockables into the desktop.

  So let's start...

  Implement the Dockable interface

  The Dockable interface is simple : you just have two methods :

  public DockKey getDockKey();
  public Component getComponent();

  The DockKey is the JavaBean that contains presentation and behaviour
  informations about the dockable (name, icon, ...) and a special key
  field used as a primary key for loading and saving (this field was
  formerly known as 'dockName' but we have replaced it with a more
  comprehensive naming).

  We will use the most simple constructor, which takes only one argument : key.

  So let's look at one of the four GUI blocks and have it implement Dockable :
*/
class MyTextEditor2 extends JPanel implements Dockable {

  DockKey key = new DockKey("textEditor");

  JTextArea textArea = new JTextArea("A Text Area");

  public MyTextEditor2() {
    setLayout(new BorderLayout());
    JScrollPane jsp = new JScrollPane(textArea);
    jsp.setPreferredSize(new Dimension(200, 400));
    add(jsp, BorderLayout.CENTER);
  }

  public DockKey getDockKey() {
    return key;
  }

  public Component getComponent() {
    return this;
  }
}
