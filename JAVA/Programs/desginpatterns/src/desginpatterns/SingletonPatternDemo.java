package desginpatterns;

class DbConnection{
	private static DbConnection instance;
    
    private DbConnection() {
        //private constructor to prevent instantiation
    }
    
    public static DbConnection getInstance() {
        if(instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Connected to the database.");
    }
}

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection db1 = DbConnection.getInstance();
		DbConnection db2 = DbConnection.getInstance();

		System.out.println("Are both instances the same? " + (db1 == db2));
		System.out.println("Instance 1 hash:" + db1.hashCode());
		System.out.println("Instance 2 hash:" + db2.hashCode());

	}

}
