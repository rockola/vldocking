package com.locriangray.vldockingSampleApp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
  1 : My first application

  In this first lesson, you will create your first Java Swing
  application using the VLDocking Framework.

  Application description

  The Swing application we are going to create is very simple, it will
  be composed of 4 dockables :
  * a Dockable for a text editor component.
  * a Dockable for a JTree component
  * a Dockable for a grid of buttons
  * and finally, a Dockable for a JTable

  This application being a kind of "Hello World", don't expect to get
  something useful from it (excepted your first knowledge of the
  framework).

  Source code

  The final source code of the sample application can be found here.

  Creating the application components

  We will start writing down our Application components (the "GUI
  blocks"), then we'll transform them into dockables.

  The TextEditor component

  This component is a JPanel containing a JScrollPane, containing a
  JTextArea. We start with a JPanel to be able to add other components
  inside later (a toolbar, for example).
*/

class MyTextEditor extends JPanel {

  JTextArea textArea = new JTextArea("A Text Area");

  public MyTextEditor() {
    setLayout(new BorderLayout());

    JScrollPane jsp = new JScrollPane(textArea);
    jsp.setPreferredSize(new Dimension(300, 400));

    add(jsp, BorderLayout.CENTER);
  }
}
