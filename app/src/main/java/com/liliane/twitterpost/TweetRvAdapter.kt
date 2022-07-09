package com.liliane.twitterpost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweetList:List<Tweet>):RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
       var itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.post_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet=tweetList.get(position)
        holder.tvName.text=currentTweet.name
        holder.tvHandle.text=currentTweet.handle
        holder.tvTime.text=currentTweet.time
        holder.tvTweet.text=currentTweet.tweet
        holder.tvReplies.text=currentTweet.replies
        holder.tvRetweet.text=currentTweet.retweet
        holder.tvLikes.text=currentTweet.likes

    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}

class TweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var tvName=itemView.findViewById<TextView>(R.id.tvName)

    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)

    var tvTime=itemView.findViewById<TextView>(R.id.tvTime)

    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)

    var tvReplies=itemView.findViewById<TextView>(R.id.tvReplies)

    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)

    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)

}
