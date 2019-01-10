package org.oa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.oa.entity.TbArchives;

import java.util.List;

/**
 * @program: Spring-Boot-Shiro-master
 * @description: 人事档案管理数据访问层
 * @author: tianlong
 * @create: 2019-01-10 10:17
 **/
public interface ArchivesMapper extends BaseMapper<TbArchives> {
    public List<TbArchives> getArchives();

    public int removeArchives(@Param("id") Integer id);
}
