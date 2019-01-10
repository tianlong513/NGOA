package org.oa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.oa.bean.ResponseBean;
import org.oa.entity.TbContract;
import org.oa.mapper.ContractMapper;
import org.oa.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 15:14
 **/
@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractMapper contractMapper;

    @Override
    public Object getContract() {
        QueryWrapper<TbContract> wrapper = new QueryWrapper<>();
        wrapper.eq("`del`", 1);
        IPage<TbContract> iPage = new Page<>();
        IPage<TbContract> contractIPage = contractMapper.selectPage(iPage, wrapper);

        return new ResponseBean(200, "success", iPage);
    }

    @Override
    public Object removeContra(Integer id) {
        try {
            int res = contractMapper.removeContra(id);
            if (res < 1) {
                return new ResponseBean(500, "删除失败", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseBean(500, "删除失败，服务器发生错误" + e.getMessage(), null);
        }

        return new ResponseBean(200, "success", null);
    }

    @Override
    public Object addContra(TbContract tbContract) {
        try {
            int res = contractMapper.addContra(tbContract);
            if (res < 1) {
                return new ResponseBean(500, "添加失败", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseBean(500, "添加失败，服务器发生错误" + e.getMessage(), null);
        }

        return new ResponseBean(200, "success", null);
    }
}
