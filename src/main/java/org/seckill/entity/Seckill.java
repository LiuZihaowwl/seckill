package org.seckill.entity;

import java.util.Date;

public class Seckill {
    private long suckillId;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public Seckill(long suckillId, String name, int number, Date startTime, Date endTime, Date createTime) {
        this.suckillId = suckillId;
        this.name = name;
        this.number = number;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
    }

    public Seckill() {
    }

    public long getSuckillId() {
        return suckillId;
    }

    public void setSuckillId(long suckillId) {
        this.suckillId = suckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "suckillId=" + suckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
