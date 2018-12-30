package com.evadts.aknesol.evadts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabVendingMachine extends Fragment {

    private TextView tvVendModel;
    private TextView tvVendBuildStd;
    private TextView tvVendLocation;
    private TextView tvVendUserDef;
    private TextView tvVendAssetN;
    private TextView tvVendType;
    private TextView tvVendDecimal;
    private TextView tvVendSerialN;

    private TextView tvBillModel;
    private TextView tvBillSerial;
    private TextView tvBillSoftRev;

    private TextView tvCoinModel;
    private TextView tvCoinSerialN;
    private TextView tvCoinSoftRev;

    private TextView tvMachineSerialN;
    private TextView tvMachineModel;
    private TextView tvMachineSoftRev;

    private TextView tvSystemDate;
    private TextView tvSystemTime;

    VendMachine vendMachine;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.vendmachine_list, container, false);

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

        return myview;
    }
}
