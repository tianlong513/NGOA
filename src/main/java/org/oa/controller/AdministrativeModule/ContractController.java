package org.oa.controller.AdministrativeModule;

import org.oa.entity.TbContract;
import org.oa.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 15:22
 **/
@RestController
@RequestMapping(value = "/administrative")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @GetMapping(value = "/contract/view/getContract")
    public Object getContract() {
        return contractService.getContract();
    }

    @PostMapping(value = "/contract/remove/find_id_remove/{id}")
    public Object removeContra(@PathVariable Integer id) {
        return contractService.removeContra(id);
    }

    @PostMapping(value = "/contract/add/addContra")
    public Object addContra(@RequestBody TbContract tbContract) {
        return contractService.addContra(tbContract);
    }
}
