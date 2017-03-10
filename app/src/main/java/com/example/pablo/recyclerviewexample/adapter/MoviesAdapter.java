package com.example.pablo.recyclerviewexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pablo.recyclerviewexample.Movie;
import com.example.pablo.recyclerviewexample.R;

import java.util.List;

/**
 * Created by Pablo on 08/01/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.year = (TextView) view.findViewById(R.id.year);
            this.genre = (TextView) view.findViewById(R.id.genre);
        }
    }

    public MoviesAdapter(List<Movie> moviesList){
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
