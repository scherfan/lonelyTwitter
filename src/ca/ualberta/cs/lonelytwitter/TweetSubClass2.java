/**
 * Appends a number 5 to the end of a string.
 */
package ca.ualberta.cs.lonelytwitter;

public class TweetSubClass2 extends AbstractTweetModel
{
	private int number = 5;
	
	public TweetSubClass2(String t)
    {
	    super(t);
	    t = getText();
    }
	
	public void addNum(String text, AbstractTweetModel t)
	{
		String newText = (text + " " + number);
		t.setText(newText);
	}

}
