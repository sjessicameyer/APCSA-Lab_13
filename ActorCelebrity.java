import java.util.ArrayList;

/**
 * Subclass of Celebrity to show how methods can be overridden and super can be called while changing functionality.
 * @author cody.henrichsen
 * @version 1.0 15/09/2018
 */
public class ActorCelebrity extends Celebrity
{
	private String films;
  private String combinedClue;
	
	public ActorCelebrity(String answer, String clues, String films)
	{
		super(answer, clues);
    this.films=films;
		processClues();
	}
  
	private void processClues()
	{
    System.out.println("1");
		this.setClue(this.getClue()+"; This celebrity is featured in the following films: "+films);
	}
  
	@Override
	public String toString()
	{
		String dsc = "This is the actor celebrity: " + getAnswer() + "\nThe clue is:"+this.getClue();
		return dsc;
	}

}