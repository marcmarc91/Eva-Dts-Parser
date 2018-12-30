package com.evadts.aknesol.evadts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class SelectionListAdapter extends RecyclerView.Adapter<SelectionListAdapter.SelectionListViewHolder> {

    private Context mCtx;
    private List<Selection> selectionList;
    private RelativeLayout relativeLayout;
    int color;

    public SelectionListAdapter(Context mCtx, List<Selection> selectionList, int c) {
        this.mCtx = mCtx;
        this.selectionList = selectionList;
        this.color = c;
    }

    @NonNull
    @Override
    public SelectionListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.selection_list, null);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeCardview);
        relativeLayout.setBackgroundResource(color);
        return new SelectionListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectionListViewHolder holder, int position) {
        Selection selection = selectionList.get(position);
        holder.tvProductName.setText(Html.fromHtml(String.valueOf(selection.getProductName())));
        holder.tvNumberSel.setText(String.valueOf(selection.getProductNumber()));
        holder.tvStatus.setText(Html.fromHtml(String.valueOf(selection.getProductStatus())));
        holder.tvPrice.setText(String.valueOf(selection.getProductPrice()));
        holder.tvpaidCountLast.setText(String.valueOf(selection.getPaidCountLast()));
        holder.tvpaidValueLast.setText(String.valueOf(selection.getPaidValueLast()));
        holder.tvpaidCountInit.setText(String.valueOf(selection.getPaidCountInit()));
        holder.tvpaidValueInit.setText(String.valueOf(selection.getPaidValueInit()));
        holder.tvtestCountLast.setText(String.valueOf(selection.getTestCountLast()));
        holder.tvtestValueLast.setText(String.valueOf(selection.getTestValueLast()));
        holder.tvtestCountInit.setText(String.valueOf(selection.getTestCountInit()));
        holder.tvtestValueInit.setText(String.valueOf(selection.getTestValueInit()));
        holder.tvfreeCountLast.setText(String.valueOf(selection.getFreeCountLast()));
        holder.tvfreeValueLast.setText(String.valueOf(selection.getFreeValueLast()));
        holder.tvfreeCountInit.setText(String.valueOf(selection.getFreeCountInit()));
        holder.tvfreeValueInit.setText(String.valueOf(selection.getFreeValueInit()));
        holder.tvrecentSale.setText(String.valueOf(selection.getDateSale()));
    }

    @Override
    public int getItemCount() {
        return selectionList.size();
    }

    class SelectionListViewHolder extends RecyclerView.ViewHolder {
        TextView tvProductName, tvNumberSel, tvStatus, tvPrice, tvpaidCountLast, tvpaidValueLast, tvpaidCountInit, tvpaidValueInit, tvtestCountLast, tvtestValueLast, tvtestCountInit, tvtestValueInit, tvfreeCountLast, tvfreeValueLast, tvfreeCountInit, tvfreeValueInit, tvrecentSale;

        public SelectionListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvNumberSel = itemView.findViewById(R.id.tvNumberSel);
            tvStatus = itemView.findViewById(R.id.tvStatus);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvpaidCountLast = itemView.findViewById(R.id.tvPaidCountLast);
            tvpaidValueLast = itemView.findViewById(R.id.tvValuePaidLast);
            tvpaidCountInit = itemView.findViewById(R.id.tvPaidCountInit);
            tvpaidValueInit = itemView.findViewById(R.id.tvValuePaidInit);
            tvtestCountLast = itemView.findViewById(R.id.tvTestCountLast);
            tvtestValueLast = itemView.findViewById(R.id.tvValueTestLast);
            tvtestCountInit = itemView.findViewById(R.id.tvTestCountInit);
            tvtestValueInit = itemView.findViewById(R.id.tvValueTestInit);
            tvfreeCountLast = itemView.findViewById(R.id.tvFreeCountLast);
            tvfreeValueLast = itemView.findViewById(R.id.tvValueFreeLast);
            tvfreeCountInit = itemView.findViewById(R.id.tvFreeCountInit);
            tvfreeValueInit = itemView.findViewById(R.id.tvValueFreeInit);
            tvrecentSale = itemView.findViewById(R.id.tvRecentSale);

        }
    }


}
