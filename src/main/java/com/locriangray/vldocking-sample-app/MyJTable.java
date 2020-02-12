package com.locriangray.vldockingSampleApp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
  The Table component

  This component is a JPanel containing a JScrollPane, containing a
  JTable.
*/

class MyJTable extends JPanel {

  JTable table = new JTable();

  public MyJTable() {
    setLayout(new BorderLayout());
    table.setModel(new DefaultTableModel(5, 5));
    JScrollPane jsp = new JScrollPane(table);
    jsp.setPreferredSize(new Dimension(200, 200));
    add(jsp, BorderLayout.CENTER);
  }
}
