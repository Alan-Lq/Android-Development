package com.example.vkontakte_recyclerview;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.RowId;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.vkontakte_recyclerview.FeedModel;
import com.example.vkontakte_recyclerview.R;



import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapterFeed<ItemClickListener> extends RecyclerView.Adapter<RecyclerViewAdapterFeed.MyViewHolder> {
    Context context;
    private List<FeedModel> mData;
    RequestManager glide;
    private @Nullable ItemClickListener listener;

    public RecyclerViewAdapterFeed(Context context, List<FeedModel> mData) {
        this.context = context;
        this.mData = mData;
        this.glide = Glide.with(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapterFeed.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vk_feed, null, false);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        view.setLayoutParams(params);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterFeed.MyViewHolder holder,final int position) {
        final FeedModel feedModel = mData.get(getItemViewType(position));
        holder.uploadername.setText(mData.get(position).getName());
        holder.posttime.setText(mData.get(position).getTime());
        holder.likes.setText(mData.get(position).getLikes());
        holder.comments.setText(mData.get(position).getComments());
        holder.shares.setText(mData.get(position).getShares());
        holder.views.setText(mData.get(position).getViews());
        holder.postText.setText(mData.get(position).getPostText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(context,FeedDetailActivity.class);
                detailActivity.putExtra(FeedDetailActivity.EXTRA_DETAIL,mData.get(position));
                context.startActivity(detailActivity);
            }
        });

        glide.load(mData.get(position).getUploaderpic()).into(holder.uploader);
        glide.load(mData.get(position).getPostpic()).into(holder.post);

    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView uploadername,posttime,postText,likes,comments,shares,views;
        CircleImageView uploader;
        ImageView post;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            uploadername = itemView.findViewById(R.id.user_name);
            posttime = itemView.findViewById(R.id.post_time);
            likes = itemView.findViewById(R.id.cnt_like);
            postText = itemView.findViewById(   R.id.post_text);
            comments = itemView.findViewById(R.id.cnt_comment);
            shares = itemView.findViewById(R.id.cnt_shares);
            views = itemView.findViewById(R.id.cnt_view);

            uploader = itemView.findViewById(R.id.user_avatar);
            post = itemView.findViewById(R.id.post_pic);
        }
    }
    public int getItemViewType(int position){
        return position;
    }

    interface ItemClickListener{
        void ItemClick(int position,FeedModel item);
    }
}