package GUI.Components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends javax.swing.JTable{
    public Table(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if(column != 1){
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    com.setBackground(Color.WHITE);
                    return com;
                }
                return new JLabel("Testing");
            }
            
        });
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(o + "");
                
                return header;
            }
        });
    }
}
