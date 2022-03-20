import java.util.ArrayList;
/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
    ArrayList<Celebrity> celebGameList = new ArrayList<Celebrity>();
    CelebrityGame app = new CelebrityGame(celebGameList);
    System.out.println("Testing Celebrity Runner");
	}
}
