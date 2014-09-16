/**
 * Inverts a string using the abstract classes methods
 */
package ca.ualberta.cs.lonelytwitter;

public class TweetSubClass1 extends AbstractTweetModel
{
	private String inverted;
	
	public TweetSubClass1(String t)
    {
		super(t);
    }
	
	public String invertString(AbstractTweetModel t)
	{
		inverted = t.getText();
		inverted = new StringBuilder(inverted).reverse().toString();
		return inverted;
	}

}
