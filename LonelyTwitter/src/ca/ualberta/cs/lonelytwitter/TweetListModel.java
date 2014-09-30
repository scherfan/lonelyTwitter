
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetListModel
{

	private static final Exception IllegalArgumentException = null;
	private ArrayList<LonelyTweetModel> tweets;

	public TweetListModel()
	{
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel t) throws Exception
	{
		if (hasTweet(t) == true)
			throw (IllegalArgumentException);
		tweets.add(t);
	}

	public boolean hasTweet(LonelyTweetModel t)
	{
		return tweets.contains(t);
	}

	public void removeTweet(LonelyTweetModel t)
	{
		tweets.remove(t);
	}

	public int getCount()
	{
		return tweets.size();
	}

	public ArrayList<LonelyTweetModel> getTweets()
	{
		Collections.sort(tweets, new Comparator<LonelyTweetModel>()
		{

			public int compare(LonelyTweetModel lhs, LonelyTweetModel rhs)
            {
	            return lhs.getTimestamp().compareTo(rhs.getTimestamp());
            }
		});
		return tweets;
	}

}
