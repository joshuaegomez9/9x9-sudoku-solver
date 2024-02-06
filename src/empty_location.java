public class empty_location {
		private int row;
		private int col;
		
		public empty_location() {
			row = -1;
			col = -1;
		}
		
		public void set_row(int r) {
			row = r;
		}
		
		public void set_col(int c) {
			col = c;
		}
		
		public int get_row() { return row; };
		public int get_col() { return col; };
	}