package com.evadts.aknesol.evadts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ErrorListAdapter extends RecyclerView.Adapter<ErrorListAdapter.ErrorListViewHolder> {

    private Context mCtx;
    private List<Error> errorList;


    public ErrorListAdapter(Context mCtx, List<Error> errorList) {
        this.mCtx = mCtx;
        this.errorList = errorList;
    }

    @NonNull
    @Override
    public ErrorListAdapter.ErrorListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.error_list, null);

        return new ErrorListAdapter.ErrorListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ErrorListAdapter.ErrorListViewHolder holder, int position) {
        Error error = errorList.get(position);
        holder.tvEventDescription.setText(String.valueOf(error.getEventDescription()));
        holder.tvEventCode.setText(String.valueOf(error.getEventCode()));
        holder.tvEventDate.setText(Html.fromHtml(String.valueOf(error.getEventDate())));
        holder.tvEventDefinition.setText(String.valueOf(error.getEventDefinition()));

    }

    @Override
    public int getItemCount() {
        return errorList.size();
    }

    class ErrorListViewHolder extends RecyclerView.ViewHolder {
        TextView tvEventDescription, tvEventCode, tvEventDate, tvEventDefinition;

        public ErrorListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEventDescription = (TextView) itemView.findViewById(R.id.tvEventDescription);
            tvEventCode = (TextView) itemView.findViewById(R.id.tvEventCode);
            tvEventDate = (TextView) itemView.findViewById(R.id.tvEventDate);
            tvEventDefinition = (TextView) itemView.findViewById(R.id.tvEventDefinition);
        }
    }

}
