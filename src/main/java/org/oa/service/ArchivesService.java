package org.oa.service;

import org.apache.ibatis.annotations.Param;
import org.oa.entity.TbArchives;

import java.util.List;

/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 11:04
 **/
public interface ArchivesService {
    public Object getArchives();

    public Object removeArchives(Integer id);
}
