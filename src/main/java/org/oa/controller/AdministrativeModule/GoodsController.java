package org.oa.controller.AdministrativeModule;

import org.oa.entity.TbGoods;
import org.oa.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-09 14:24
 **/
@RestController
@RequestMapping(value = "/administrative")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/view/goods_all")
    public Object goodsAll(@RequestParam(defaultValue = "1") Integer pageNum,
                           @RequestParam(defaultValue = "10") Integer pageSize) {
        return goodsService.goodsAll(pageNum, pageSize);
    }

    @PostMapping(value = "/goods/edit/find_id")
    public Object editGoodsId(@RequestBody TbGoods tbGoods) throws Exception {
        return goodsService.editGoods(tbGoods);
    }

    @PostMapping(value = "/goods/remove/find_id_remove/{id}")
    public Object removeFindByIdGoods(@PathVariable Integer id) {
        return goodsService.removeFindByIdGoods(id);
    }

    @PostMapping(value = "/goods/add/addGoods")
    public Object addGoods(@RequestBody  TbGoods tbGoods) {
        return goodsService.addGoods(tbGoods);
    }
}
