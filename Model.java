package ideias300;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Model implements TableModel {

	private String[] headers;
	private Object[][] values;
	
	public Model(Object[][] values, String[] headers){
		this.values = values;
		this.headers = headers;
	}

	//
	public int getRowCount() {
		return values.length;
	}

	public int getColumnCount() {
		return headers.length;
	}

	public String getColumnName(int columnIndex) {
		return headers[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return headers[columnIndex].getClass();
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return values[rowIndex][columnIndex];
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		values[rowIndex][columnIndex] = (String) aValue;
	}

	public void addTableModelListener(TableModelListener l) {

	}

	public void removeTableModelListener(TableModelListener l) {

	}

}