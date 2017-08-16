package com.clou.model;

import java.math.BigDecimal;

public class Bill {
    private Integer billPayId;

    private String billPayNo;

    private String startTime;

    private String endTime;

    private Integer pileId;

    private Integer innerId;

    private String startType;

    private BigDecimal preAmount;

    private BigDecimal amount;

    private BigDecimal chgPower;

    private BigDecimal elceFee;

    private BigDecimal servFee;

    private BigDecimal parkFee;

    private String createTime;

    private String finishTime;

    private String payState;

    private String checkState;

    private String billDesc;

    private Integer orgId;

    private Integer consId;

    private String isStop;

    private Integer settleTimes;

    private String payType;

    private String prepayId;

    private String outBillNo;

    private BigDecimal powerZxyg1;

    private BigDecimal powerZxyg2;

    private BigDecimal powerZxyg3;

    private BigDecimal powerZxyg4;

    private BigDecimal prcZxygz1;

    private BigDecimal prcZxygz2;

    private BigDecimal prcZxygz3;

    private BigDecimal prcZxygz4;

    private BigDecimal servPrice;

    private Integer carId;

    private Long couponId;

    private Integer minutes;

    private Integer orderStatus;

    private Double discountFee;

    private Integer fig;

    public Integer getBillPayId() {
        return billPayId;
    }

    public void setBillPayId(Integer billPayId) {
        this.billPayId = billPayId;
    }

    public String getBillPayNo() {
        return billPayNo;
    }

    public void setBillPayNo(String billPayNo) {
        this.billPayNo = billPayNo == null ? null : billPayNo.trim();
    }

    public Integer getPileId() {
        return pileId;
    }

    public void setPileId(Integer pileId) {
        this.pileId = pileId;
    }

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType == null ? null : startType.trim();
    }

    public BigDecimal getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(BigDecimal preAmount) {
        this.preAmount = preAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getChgPower() {
        return chgPower;
    }

    public void setChgPower(BigDecimal chgPower) {
        this.chgPower = chgPower;
    }

    public BigDecimal getElceFee() {
        return elceFee;
    }

    public void setElceFee(BigDecimal elceFee) {
        this.elceFee = elceFee;
    }

    public BigDecimal getServFee() {
        return servFee;
    }

    public void setServFee(BigDecimal servFee) {
        this.servFee = servFee;
    }

    public BigDecimal getParkFee() {
        return parkFee;
    }

    public void setParkFee(BigDecimal parkFee) {
        this.parkFee = parkFee;
    }


    
    public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState == null ? null : payState.trim();
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState == null ? null : checkState.trim();
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc == null ? null : billDesc.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getConsId() {
        return consId;
    }

    public void setConsId(Integer consId) {
        this.consId = consId;
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop == null ? null : isStop.trim();
    }

    public Integer getSettleTimes() {
        return settleTimes;
    }

    public void setSettleTimes(Integer settleTimes) {
        this.settleTimes = settleTimes;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId == null ? null : prepayId.trim();
    }

    public String getOutBillNo() {
        return outBillNo;
    }

    public void setOutBillNo(String outBillNo) {
        this.outBillNo = outBillNo == null ? null : outBillNo.trim();
    }

    public BigDecimal getPowerZxyg1() {
        return powerZxyg1;
    }

    public void setPowerZxyg1(BigDecimal powerZxyg1) {
        this.powerZxyg1 = powerZxyg1;
    }

    public BigDecimal getPowerZxyg2() {
        return powerZxyg2;
    }

    public void setPowerZxyg2(BigDecimal powerZxyg2) {
        this.powerZxyg2 = powerZxyg2;
    }

    public BigDecimal getPowerZxyg3() {
        return powerZxyg3;
    }

    public void setPowerZxyg3(BigDecimal powerZxyg3) {
        this.powerZxyg3 = powerZxyg3;
    }

    public BigDecimal getPowerZxyg4() {
        return powerZxyg4;
    }

    public void setPowerZxyg4(BigDecimal powerZxyg4) {
        this.powerZxyg4 = powerZxyg4;
    }

    public BigDecimal getPrcZxygz1() {
        return prcZxygz1;
    }

    public void setPrcZxygz1(BigDecimal prcZxygz1) {
        this.prcZxygz1 = prcZxygz1;
    }

    public BigDecimal getPrcZxygz2() {
        return prcZxygz2;
    }

    public void setPrcZxygz2(BigDecimal prcZxygz2) {
        this.prcZxygz2 = prcZxygz2;
    }

    public BigDecimal getPrcZxygz3() {
        return prcZxygz3;
    }

    public void setPrcZxygz3(BigDecimal prcZxygz3) {
        this.prcZxygz3 = prcZxygz3;
    }

    public BigDecimal getPrcZxygz4() {
        return prcZxygz4;
    }

    public void setPrcZxygz4(BigDecimal prcZxygz4) {
        this.prcZxygz4 = prcZxygz4;
    }

    public BigDecimal getServPrice() {
        return servPrice;
    }

    public void setServPrice(BigDecimal servPrice) {
        this.servPrice = servPrice;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Double discountFee) {
        this.discountFee = discountFee;
    }

    public Integer getFig() {
        return fig;
    }

    public void setFig(Integer fig) {
        this.fig = fig;
    }
}