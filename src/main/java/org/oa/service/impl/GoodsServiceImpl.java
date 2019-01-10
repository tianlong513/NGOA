package org.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.oa.bean.ResponseBean;
import org.oa.entity.TbGoods;
import org.oa.mapper.GoodsMapper;
import org.oa.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: tianlong
 * @create: 2019-01-09 11:31
 **/
@SuppressWarnings("All")
@Service
public class GoodsServiceImpl implements GoodsService {

    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Object goodsAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TbGoods> goodsList = goodsMapper.goodsAll();

        PageInfo<TbGoods> goodsPageInfo = new PageInfo<TbGoods>(goodsList);
        return new ResponseBean(200, "success", goodsPageInfo);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Object editGoods(TbGoods tbGoods) {
        int result = goodsMapper.editGoods(tbGoods);
        return new ResponseBean(200, "success", result);
    }

    @Override
    public Object removeFindByIdGoods(Integer id) {
        int findById = goodsMapper.getByIdGoods(id);
        if (findById <= 0) {
            return new ResponseBean(200, "物品不存在", "");
        }
        try {
            int result = goodsMapper.removeFindByIdGoods(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResponseBean(500, e.getMessage(), "");
        }
        return new ResponseBean(200, "success", "");
    }

    @Override
    public int getByIdGoods(Integer id) {
        return 0;
    }

    @Override
    public Object addGoods(TbGoods tbGoods) {
        try {
            int result = goodsMapper.addGoods(tbGoods);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResponseBean(500, e.getMessage(), "");
        }
        return new ResponseBean(200, "success", "");
    }
}
