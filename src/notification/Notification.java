/*
 * 
 */
package notification;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * The Class Notification.
 */
public class Notification {
		
	/** The Constant PG_DRIVER. */
	private static final String PG_DRIVER = "org.postgresql.Driver";
	
	/** The Constant DB_USERNAME. */
	private static final String DB_USERNAME = "postgres";
	
	/** The Constant URL. */
	private static final String URL = "jdbc:postgresql://51.254.216.116:5432/gonenpru";

	/**
	 * Start.
	 */
	public static void start() {
		Connection connection;
		String listenTo[] = { "planemovements_notify" };
		try {
			Class.forName(PG_DRIVER);
			connection = DriverManager.getConnection(URL, DB_USERNAME, "");
			SocketIO cl = new SocketIO(connection, listenTo);
			(new Thread(cl)).start();
			SocketIO.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Stop.
	 */
	public static void stop() {
		SocketIO.stop();
	}

	/**
	 * Send notification.
	 *
	 * @param receivingGroup the receiving group
	 * @param message the message
	 */
	public static void sendNotification(String receivingGroup, String message) {
		SocketIO.sendNotification(receivingGroup, message);
	}
}
