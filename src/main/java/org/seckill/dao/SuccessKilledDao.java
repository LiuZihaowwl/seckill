package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * @InterfaceName SuccessKilledDao
 * @Description
 * @Author LiuZihao
 * @Date 2020/5/19 22:38
 * @Version 1.0
 **/
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);

    /**seckillId查询SuccessKilled并携带秒杀商品对象实体
     * 根据
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);


}
