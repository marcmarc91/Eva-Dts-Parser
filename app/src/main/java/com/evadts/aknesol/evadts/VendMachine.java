package com.evadts.aknesol.evadts;

public class VendMachine {
    // Vending Machine
    private String machineSerialN; //ID1 01
    private String machineModelN; //ID1 02
    private String machineBuildStd; //ID1 03
    private String machineLocation; //ID1 04
    private String machineUserDefinded; //ID1 05
    private String machineAssetN; //ID1 06

    private String decimaPoint; //ID4 01
    private String vendType; //MA1 02

    private String systemDate; //ID5 01
    private String systemTime; //ID5 02

    // Vending Machine Controller
    private String boardSerialN; // CB1 01
    private String boardModelN; //CB1 02
    private String boardSoftRev;// CB1 03

    // Coin Mechanism
    private String coinMechSerialN; //CA1 01
    private String coinMechModelN; //CA1 02
    private String coinMechSoftRev; //CA1 03

    // Bill Validator
    private String billValidatorSerialN; //BA1 01
    private String billValidatorModelN; //BA1 02
    private String billValidatorSoftRev; //BA1 03

    public VendMachine(String machineSerialN, String machineModelN, String machineBuildStd, String machineLocation, String machineUserDefinded, String machineAssetN, String decimaPoint, String vendType, String systemDate, String systemTime, String boardSerialN, String boardModelN, String boardSoftRev, String coinMechSerialN, String coinMechModelN, String coinMechSoftRev, String billValidatorSerialN, String billValidatorModelN, String billValidatorSoftRev) {
        this.machineSerialN = machineSerialN;
        this.machineModelN = machineModelN;
        this.machineBuildStd = machineBuildStd;
        this.machineLocation = machineLocation;
        this.machineUserDefinded = machineUserDefinded;
        this.machineAssetN = machineAssetN;
        this.decimaPoint = decimaPoint;
        this.vendType = vendType;
        this.systemDate = systemDate;
        this.systemTime = systemTime;
        this.boardSerialN = boardSerialN;
        this.boardModelN = boardModelN;
        this.boardSoftRev = boardSoftRev;
        this.coinMechSerialN = coinMechSerialN;
        this.coinMechModelN = coinMechModelN;
        this.coinMechSoftRev = coinMechSoftRev;
        this.billValidatorSerialN = billValidatorSerialN;
        this.billValidatorModelN = billValidatorModelN;
        this.billValidatorSoftRev = billValidatorSoftRev;
    }

    public String getMachineSerialN() {
        return machineSerialN;
    }

    public void setMachineSerialN(String machineSerialN) {
        this.machineSerialN = machineSerialN;
    }

    public String getMachineModelN() {
        return machineModelN;
    }

    public void setMachineModelN(String machineModelN) {
        this.machineModelN = machineModelN;
    }

    public String getMachineBuildStd() {
        return machineBuildStd;
    }

    public void setMachineBuildStd(String machineBuildStd) {
        this.machineBuildStd = machineBuildStd;
    }

    public String getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(String machineLocation) {
        this.machineLocation = machineLocation;
    }

    public String getMachineUserDefinded() {
        return machineUserDefinded;
    }

    public void setMachineUserDefinded(String machineUserDefinded) {
        this.machineUserDefinded = machineUserDefinded;
    }

    public String getMachineAssetN() {
        return machineAssetN;
    }

    public void setMachineAssetN(String machineAssetN) {
        this.machineAssetN = machineAssetN;
    }

    public String getDecimaPoint() {
        return decimaPoint;
    }

    public void setDecimaPoint(String decimaPoint) {
        this.decimaPoint = decimaPoint;
    }

    public String getVendType() {
        return vendType;
    }

    public void setVendType(String vendType) {
        this.vendType = vendType;
    }

    public String getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public String getBoardSerialN() {
        return boardSerialN;
    }

    public void setBoardSerialN(String boardSerialN) {
        this.boardSerialN = boardSerialN;
    }

    public String getBoardModelN() {
        return boardModelN;
    }

    public void setBoardModelN(String boardModelN) {
        this.boardModelN = boardModelN;
    }

    public String getBoardSoftRev() {
        return boardSoftRev;
    }

    public void setBoardSoftRev(String boardSoftRev) {
        this.boardSoftRev = boardSoftRev;
    }

    public String getCoinMechSerialN() {
        return coinMechSerialN;
    }

    public void setCoinMechSerialN(String coinMechSerialN) {
        this.coinMechSerialN = coinMechSerialN;
    }

    public String getCoinMechModelN() {
        return coinMechModelN;
    }

    public void setCoinMechModelN(String coinMechModelN) {
        this.coinMechModelN = coinMechModelN;
    }

    public String getCoinMechSoftRev() {
        return coinMechSoftRev;
    }

    public void setCoinMechSoftRev(String coinMechSoftRev) {
        this.coinMechSoftRev = coinMechSoftRev;
    }

    public String getBillValidatorSerialN() {
        return billValidatorSerialN;
    }

    public void setBillValidatorSerialN(String billValidatorSerialN) {
        this.billValidatorSerialN = billValidatorSerialN;
    }

    public String getBillValidatorModelN() {
        return billValidatorModelN;
    }

    public void setBillValidatorModelN(String billValidatorModelN) {
        this.billValidatorModelN = billValidatorModelN;
    }

    public String getBillValidatorSoftRev() {
        return billValidatorSoftRev;
    }

    public void setBillValidatorSoftRev(String billValidatorSoftRev) {
        this.billValidatorSoftRev = billValidatorSoftRev;
    }
}
