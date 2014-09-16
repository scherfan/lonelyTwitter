package ca.ualberta.cs.lonelytwitter;

/** 
 * Adds basic methods for tweeting.
 * @author scherfan
 *
 */

public abstract class AbstractTweetModel
{
	private String text;
		
	public AbstractTweetModel(String t)
    {
	    text = t;
    }

	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
}
