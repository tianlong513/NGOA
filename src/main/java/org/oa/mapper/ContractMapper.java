package org.oa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.oa.entity.TbContract;


/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 15:13
 **/
public interface ContractMapper extends BaseMapper<TbContract> {
    public int removeContra(@Param("id")Integer id);

    public int addContra(@Param("tbContract")TbContract tbContract);
}
