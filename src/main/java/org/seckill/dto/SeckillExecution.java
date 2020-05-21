package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * @ClassName SeckillExecution
 * @Description 封装秒杀执行后的结果
 * @Author Administrator
 * @Date 2020/5/20 14:46
 * @Version 1.0
 **/
public class SeckillExecution {
    private long seckillId;
    //秒杀执行结果状态
    SeckillStatEnum seckillStatEnum;
    //状态表示
    private String stateInfo;
    //秒杀成功对象
    private SuccessKilled successKilled;

    public SeckillExecution(long seckillId, SeckillStatEnum seckillStatEnum) {
        this.seckillId = seckillId;
        this.seckillStatEnum = seckillStatEnum;
    }

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.seckillStatEnum = statEnum;
        this.stateInfo = statEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckillId, SeckillStatEnum seckillStatEnum, String stateInfo) {
        this.seckillId = seckillId;
        this.seckillStatEnum = seckillStatEnum;
        this.stateInfo = stateInfo;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public SeckillStatEnum getSeckillStatEnum() {
        return seckillStatEnum;
    }

    public void setSeckillStatEnum(SeckillStatEnum seckillStatEnum) {
        this.seckillStatEnum = seckillStatEnum;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", seckillStatEnum=" + seckillStatEnum +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}
