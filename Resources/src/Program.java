import java.io.IOException;


public class Program
{

	public static void main(String[] args) 
	{
		/*
		DBConnection db = new DBConnection();
		try
		{
			db.execute();
		}
		finally {
			db.close();
		}*/
		
		// since Java 7
		try (DBConnection db = new DBConnection();
				DBConnection db2 = new DBConnection();) {
			db.execute();
			db2.execute();
		} // db.close()
	
		// since Java 9
		DBConnection db = new DBConnection();
		try (db) {
			db.execute();
		} // db.close()
		
		// System.gc();

	}

}
