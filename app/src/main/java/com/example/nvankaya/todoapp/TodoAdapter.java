package com.example.nvankaya.todoapp;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder> {

    private final List<String> todos;

    public TodoAdapter(List<String> todos) {
        this.todos = todos;
    }

    @NonNull
    @Override
    public TodoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View todoItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_row, null, false);
        return new TodoHolder(todoItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoHolder holder, int position) {
        String todo = todos.get(position);
        holder.titleView.setText(todo);
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public class TodoHolder extends RecyclerView.ViewHolder {

        private final TextView titleView;

        public TodoHolder(View itemView) {
            super(itemView);
            titleView = (TextView) itemView.findViewById(R.id.itemTextView);
        }

    }
}
