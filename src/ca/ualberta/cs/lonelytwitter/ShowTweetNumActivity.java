package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;

public class ShowTweetNumActivity extends LonelyTwitterActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_tweet_num);
	}
	public int getNumTweets()
	{
		int numTweets = LonelyTwitterActivity.giveTweets().size();
		return numTweets;
		
	}
}
