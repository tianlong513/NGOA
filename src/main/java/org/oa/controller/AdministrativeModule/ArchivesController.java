package org.oa.controller.AdministrativeModule;

import org.oa.service.ArchivesService;
import org.oa.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: Spring-Boot-Shiro-master
 * @description:
 * @author: tianlong
 * @create: 2019-01-10 11:09
 **/
@RestController
@RequestMapping(value = "/administrative")
public class ArchivesController {
    private Logger logger = LoggerFactory.getLogger(ArchivesController.class);

    @Autowired
    private ArchivesService archivesService;

    @GetMapping(value = "/archives/view/getarchives")
    public Object getArchives() {
        return archivesService.getArchives();
    }

    @PostMapping(value = "file")
    public Object singleFileUpload(MultipartFile file, HttpServletRequest request) {
        String cloudPath = request.getSession().getServletContext().getRealPath("/");
        System.out.println(cloudPath);
        return FileUtil.singleFileUpload(file);
    }

    @PostMapping(value = "/archives/remove/find_id_remove/{id}")
    public Object findByIdRemove(@PathVariable Integer id) {
        return archivesService.removeArchives(id);
    }
}
