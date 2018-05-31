import java.io.*;


public class DBConnection implements Closeable
{
	
	public DBConnection() {
		System.out.println("Open connection...");
	}
	
	public void execute()
	{
		System.out.println("execute command...");
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Close connection...");
	}*/
	
	




	private boolean isClosed;
	@Override
	public void close() {
		if (!isClosed) {
			System.out.println("close connection...");
			isClosed = true;
		}
	}
}
