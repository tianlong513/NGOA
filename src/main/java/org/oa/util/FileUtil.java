package org.oa.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: Spring-Boot-Shiro-master
 * @description: 文件上传工具类
 * @author: tianlong
 * @create: 2019-01-10 13:57
 **/
public class FileUtil {
    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);


    /**
     * 上传单个图片
     */

    public static Map<String, String> singleFileUpload(MultipartFile file) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String cloudPath = request.getSession().getServletContext().getRealPath("/");
        Map<String, String> resMap = new HashMap<>();
        try {
            byte[] bytes = file.getBytes();

            int index = file.getOriginalFilename().lastIndexOf(".");
            //获取文件后缀
            String tosuffix = file.getOriginalFilename().substring(index, file.getOriginalFilename().length());
            //使用uuid生成新的文件名
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "");
            //判断是否有该文件夹
            File filePath = new File(cloudPath + "\\files\\");
            if (!filePath.exists()) {
                filePath.mkdirs();
            }

            Path path = Paths.get(cloudPath + "\\files\\" + newFileName + tosuffix);
            //如果没有files文件夹，则创建
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get(cloudPath));
            }
            //文件写入指定路径
            Files.write(path, bytes);
            logger.debug("文件写入成功，文件地址为" + path);
            resMap.put("msg", "success");
            resMap.put("data", "/files/" + newFileName + tosuffix);
        } catch (IOException e) {
            e.printStackTrace();
            resMap.put("msg", "后端异常");
        }
        return resMap;
    }


}
