package GUI.Components;


import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends javax.swing.JTable{
    
    public Table(){
        getModel().addTableModelListener(this);
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setAutoCreateRowSorter(true);

        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(o + "");
                
                return header;
            }
        });
    }

    
    public DefaultTableModel getTableModel(){
        DefaultTableModel model = (DefaultTableModel) super.getModel();
        return model;
    }

    @Override
    public int getSelectedRow() {
        return super.getSelectedRow(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
