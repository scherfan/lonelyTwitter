
package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTest extends
        ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListModelTest()
	{
		super(LonelyTwitterActivity.class);
	}

	public void testFiveIsFive()
	{
		assertEquals(5, 5);
	}

	public void testTweetListModel()
	{
		TweetListModel tlm = new TweetListModel();
	}

	public void testAdd()
	{
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel n = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		try
		{
			tlm.add(t);
			tlm.add(n);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			// fail();
		}
		assertEquals(t, n);
	}

	public void testGetTweets()
	{
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel n = new LonelyTweetModel("Hello World");
		TweetListModel tlm = new TweetListModel();
		try
		{
			tlm.add(t);
			tlm.add(n);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LonelyTweetModel tn = new LonelyTweetModel("Hello");
		LonelyTweetModel nn = new LonelyTweetModel("Hello World");
		TweetListModel tln = new TweetListModel();
		try
		{
			tln.add(tn);
			tln.add(nn);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(tlm.getTweets(), tln.getTweets());
	}

	public void testHasTweet()
	{
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		LonelyTweetModel n = new LonelyTweetModel("Hello World");
		TweetListModel tlm = new TweetListModel();
		try
		{
			tlm.add(t);
			tlm.add(n);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(tlm.hasTweet(t));
		assertEquals(tlm.hasTweet(t), tlm.hasTweet(n));
	}

	public void testRemoveTweet()
	{
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		try
		{
			tlm.add(t);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(tlm.hasTweet(t));
		tlm.removeTweet(t);
		assertFalse(tlm.hasTweet(t));
	}

	public void testGetCount()
	{
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		try
		{
			tlm.add(t);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LonelyTweetModel n = new LonelyTweetModel("Hellow World!");
		try
		{
			tlm.add(n);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(tlm.getCount() == 2);
	}
}
