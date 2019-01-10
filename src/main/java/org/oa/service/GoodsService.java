package org.oa.service;

import org.apache.ibatis.annotations.Param;
import org.oa.entity.TbGoods;

/**
 * @description:
 * @author: tianlong
 * @create: 2019-01-09 11:30
 **/
public interface GoodsService {

    /**
     * 分页查询全部货物
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Object goodsAll(Integer pageNum, Integer pageSize);


    public Object editGoods(TbGoods tbGoods);

    public Object removeFindByIdGoods(Integer id);

    public int getByIdGoods(Integer id);

    public Object addGoods(TbGoods tbGoods);
}
