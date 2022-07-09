package com.liliane.twitterpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.liliane.twitterpost.databinding.ActivityMainBinding
import com.liliane.twitterpost.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= inflate(layoutInflater)
        setContentView(binding.root)
        postTweets()

    }

    fun postTweets(){
        var tweet=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")
        var tweet2=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")
        var tweet3=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")
        var tweet4=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")
        var tweet5=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")
        var tweet6=Tweet("Liliane","@lilkundiro","4hr","Is it a sin to be seen?","60","40","900k")

        var tweets= listOf(tweet,tweet2,tweet3,tweet4,tweet5,tweet6)

        var TweetsAdapter=TweetRvAdapter(tweets)
        binding.rvPost.layoutManager= LinearLayoutManager(this)
        binding.rvPost.adapter=TweetsAdapter

    }
}


