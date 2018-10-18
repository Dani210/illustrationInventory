package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Inventory 
        extends AbstractTableModel
{

    private ArrayList<Illustration> entries;
    
    //enum hab ich nicht geschafft
    public final static String[] COLNAMES = {
      "ID", "Titel", "Hinzugefügt am:"  
    };

    public Inventory() {
        entries = new ArrayList<>();
    }
    
    
    @Override
    public int getRowCount() {
        return entries.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Illustration ill = entries.get(rowIndex);
        
        //hab noch keinen eleganteren Weg gefunden
        switch(columnIndex){
            case 0:
                return ill.getId();
            case 1:
                return ill.getTitle();
            case 2:
                return ill.getAddingDate();
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public String getColumnName(int column) {
        return COLNAMES[column];
    }
    
    
    
}
