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

public class VendListAdapter extends RecyclerView.Adapter<VendListAdapter.SelectionListViewHolder> {

    private Context mCtx;
    private List<VendMachine> vendMachinesList;

    public VendListAdapter(Context mCtx, List<VendMachine> vendMachines) {
        this.mCtx = mCtx;
        this.vendMachinesList = vendMachines;
    }

    @NonNull
    @Override
    public SelectionListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.vendmachine_list, null);
        return new SelectionListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectionListViewHolder holder, int position) {
        VendMachine vendMachine = vendMachinesList.get(position);

        holder.tvVendModel.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineModelN())));
        holder.tvVendSerialN.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineSerialN())));
        holder.tvVendBuildStd.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineBuildStd())));
        holder.tvVendAssetN.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineAssetN())));
        holder.tvVendDecimal.setText(Html.fromHtml(String.valueOf(vendMachine.getDecimaPoint())));
        holder.tvVendLocation.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineLocation())));
        holder.tvVendType.setText(Html.fromHtml(String.valueOf(vendMachine.getVendType())));
        holder.tvVendUserDef.setText(Html.fromHtml(String.valueOf(vendMachine.getMachineUserDefinded())));

        holder.tvBillModel.setText(Html.fromHtml(String.valueOf(vendMachine.getBillValidatorModelN())));
        holder.tvBillSerial.setText(Html.fromHtml(String.valueOf(vendMachine.getBillValidatorSerialN())));
        holder.tvBillSoftRev.setText(Html.fromHtml(String.valueOf(vendMachine.getBillValidatorSoftRev())));

        holder.tvCoinModel.setText(Html.fromHtml(String.valueOf(vendMachine.getCoinMechModelN())));
        holder.tvCoinSerialN.setText(Html.fromHtml(String.valueOf(vendMachine.getCoinMechSerialN())));
        holder.tvCoinSoftRev.setText(Html.fromHtml(String.valueOf(vendMachine.getCoinMechSoftRev())));

        holder.tvMachineModel.setText(Html.fromHtml(String.valueOf(vendMachine.getBoardModelN())));
        holder.tvMachineSerialN.setText(Html.fromHtml(String.valueOf(vendMachine.getBoardSerialN())));
        holder.tvMachineSoftRev.setText(Html.fromHtml(String.valueOf(vendMachine.getBoardSoftRev())));

        holder.tvSystemDate.setText(Html.fromHtml(String.valueOf(vendMachine.getSystemDate())));
        holder.tvSystemTime.setText(Html.fromHtml(String.valueOf(vendMachine.getSystemTime())));

    }

    @Override
    public int getItemCount() {
        return vendMachinesList.size();
    }

    class SelectionListViewHolder extends RecyclerView.ViewHolder {
        TextView tvVendModel,tvVendBuildStd,tvVendLocation,tvVendUserDef, tvVendAssetN,tvVendType,tvVendDecimal,tvVendSerialN,
                tvBillModel,tvBillSerial,tvBillSoftRev,tvCoinModel,tvCoinSerialN,tvCoinSoftRev,tvMachineModel,tvMachineSerialN,
                tvMachineSoftRev,tvSystemDate,tvSystemTime;


        public SelectionListViewHolder(@NonNull View myview) {
            super(myview);


            tvVendModel = myview.findViewById(R.id.tvModel);
            tvVendBuildStd = myview.findViewById(R.id.tvBuildStd);
            tvVendLocation =  myview.findViewById(R.id.tvLocation);
            tvVendUserDef =  myview.findViewById(R.id.tvUserDefined);
            tvVendAssetN =  myview.findViewById(R.id.tvAssetN);
            tvVendType =  myview.findViewById(R.id.tvVendType);
            tvVendDecimal =  myview.findViewById(R.id.tvVendDecimal);
            tvVendSerialN =  myview.findViewById(R.id.tvSerialN);

            tvBillModel =  myview.findViewById(R.id.tvBillModel);
            tvBillSerial =  myview.findViewById(R.id.tvBillSn);
            tvBillSoftRev = myview.findViewById(R.id.tvBillSoftRev);

            tvCoinModel =  myview.findViewById(R.id.tvCoinModel);
            tvCoinSerialN = myview.findViewById(R.id.tvCoinSn);
            tvCoinSoftRev = myview.findViewById(R.id.tvCoinSoftRev);

            tvMachineModel =  myview.findViewById(R.id.tvMachineModel);
            tvMachineSerialN =  myview.findViewById(R.id.tvMachSerialN);
            tvMachineSoftRev =  myview.findViewById(R.id.tvMachineSoftRev);

            tvSystemDate =  myview.findViewById(R.id.tvSystemDate);
            tvSystemTime =  myview.findViewById(R.id.tvSystemTime);

        }
    }
}
