package org.seckill.dao;

import org.seckill.entity.Successkilled;

/**
 * Created by mcg on 2017/6/24.
 */
public interface SuccesskilledDao {
    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询successkilled并携带秒杀产品对象
     * @param seckillId
     * @return
     */
    Successkilled queryByIdWithSeckill(long seckillId);
}
