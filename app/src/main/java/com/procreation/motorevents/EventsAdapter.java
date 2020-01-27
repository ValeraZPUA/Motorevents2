package com.procreation.motorevents;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.procreation.motorevents.databinding.RecyclerViewItemBinding;

import java.net.URL;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {

    private RecyclerViewItemBinding binding;
    private List<EventModel> posts;

    public EventsAdapter(List<EventModel> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = RecyclerViewItemBinding.inflate(inflater, parent, false);
        //binding = DataBindingUtil.setContentView((Activity) parent.getContext(),R.layout.recycler_view_item);
        return new ViewHolder(binding.getRoot());
        /*
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);*/
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EventModel post = posts.get(position);

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.post.setText(Html.fromHtml(post.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        } else {*/
            //holder.post.setText(post.getTitle());
        //}
        binding.setEvent(post);

    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //TextView post;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //post = itemView.findViewById(R.id.tv_post);
        }


    }
}
