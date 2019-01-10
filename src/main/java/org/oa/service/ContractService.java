package org.oa.service;

import org.oa.entity.TbContract;

/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 15:14
 **/
public interface ContractService {

    public Object getContract();

    public Object removeContra(Integer id);

    public Object addContra(TbContract tbContract);
}
