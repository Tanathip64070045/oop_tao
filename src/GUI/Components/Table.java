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
    
//    public void updateTable(){
//        DefaultTableModel model = (DefaultTableModel) getModel();
//        model.setRowCount(0);
//        
//        for(int i = 0; i < db.getArrayList().size();i++){
//            int id = ((Product)(db.getArrayList().get(i))).getId();
//            String img = ((Product)(db.getArrayList().get(i))).getImg();
//            String productName = ((Product)(db.getArrayList().get(i))).getProductName();
//            double price = ((Product)(db.getArrayList().get(i))).getPrice();
//            String category = ((Product)(db.getArrayList().get(i))).getCategory();
//            String action = "action";
//            
//            Object[] data = {id,img,productName,price,category,action};
//            
//            model.addRow(data);
//        }
//        model.fireTableDataChanged();
//        super.repaint();
//    }
    
//    public void insertData(){
//        try{
//            String sql = "SELECT * FROM products";
//            Statement statement = Connection.connection().createStatement();
//            ResultSet result = statement.executeQuery(sql);
//            while(result.next()){
//                String id = result.getString("id");
//                String img = result.getString("image");
//                String product = result.getString("product");
//                String price = result.getString("price");
//                String category = result.getString("category");
//                Object[] asd = new Object[]{id,img,product,price,category,"action"};
//                addRow(asd);
//            }
//        } catch (SQLException e){
//            System.out.println(e);;
//        } finally {
//            System.out.println("test");
//        }
//        
//    }
//    public void tableChanged(TableModelEvent e){
//        
//    }
//    public void fecth(){
//        try{
//            String sql = "SELECT * FROM products";
//            PreparedStatement pstmt = Connection.connection().prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            super.setModel(DbUtils.resultSetToTableModel(rs));
//            
//        } catch (SQLException e){
//            System.out.println(e);
//        } finally {
//            
//        }
//    }

    @Override
    public int getSelectedRow() {
        return super.getSelectedRow(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
