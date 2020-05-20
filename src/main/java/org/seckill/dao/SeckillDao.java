package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    /**
     * 减库存
     * @param seckilled
     * @param killTime
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckilled, @Param("killTime") Date killTime);

    /**
     * 根据seckillId查询秒杀商品
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offet, @Param("limit") int limit);
}
