package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; // Matriz de pe�as
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // Matriz de pe�as instanciada na quantidade de linhas e colunas informadas.
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {  // retorn a matriz pieces na linha row e coluna column
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { // sobrecarga
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
