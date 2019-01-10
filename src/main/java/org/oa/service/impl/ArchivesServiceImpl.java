package org.oa.service.impl;

import org.oa.bean.ResponseBean;
import org.oa.entity.TbArchives;
import org.oa.mapper.ArchivesMapper;
import org.oa.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Spring-Boot-Shiro-master
 * @description: 人事档案业务逻辑层
 * @author: tianlong
 * @create: 2019-01-10 11:06
 **/
@SuppressWarnings("all")
@Service
public class ArchivesServiceImpl implements ArchivesService {

    @Autowired
    private ArchivesMapper archivesMapper;

    @Override
    public Object getArchives() {
        List<TbArchives> listArc = archivesMapper.getArchives();
        /*List<Object> l = new LinkedList<>();
        for (TbArchives o : listArc) {
            l.clear();
            for (TbStaffOnJob t : o.getTbStaffOnJobList()) {
                l.add(t.getJobId());
            }
            o.setList(l);
        }
        for (Object l1 : l) {
            System.out.println(l1);
        }*/

        return listArc;
    }

    @Override
    public Object removeArchives(Integer id) {
        try {
            int res = archivesMapper.removeArchives(id);
            if (res < 1) {
                return new ResponseBean(500, "删除失败", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseBean(500, "删除失败，服务器发生了异常", "");
        }
        return new ResponseBean(200, "success", "");
    }
}
