package org.oa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.oa.entity.TbGoods;

import java.util.List;

/**
 * @program: Spring-Boot-Shiro-master
 * @description: 物品模块业数据访问层
 * @author: tianlong
 * @create: 2019-01-09 13:07
 **/
public interface GoodsMapper extends BaseMapper<TbGoods> {
    public List<TbGoods> goodsAll();

    public int editGoods(@Param("tbGoods") TbGoods tbGoods);

    public int removeFindByIdGoods(@Param("id") Integer id);

    public int getByIdGoods(@Param("id") Integer id);

    public int addGoods(@Param("tbGoods") TbGoods tbGoods);

}
