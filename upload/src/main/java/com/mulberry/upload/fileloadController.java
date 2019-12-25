package com.mulberry.upload;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class fileloadController {
    @RequestMapping("/dofile")
    public String file_UpLoad(@RequestParam("ufile") MultipartFile multipartFile
            ,@RequestParam("fname") String xxxx, ModelMap modelMap) throws IOException {

        System.out.println(xxxx);
//        加密
        String sfname = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        String newName = UUID.randomUUID().toString().replace("-","X");

        File newfile = new File("F:\\图片\\"+newName+sfname);
        System.out.println(newName+sfname);
//        上传文件
        multipartFile.transferTo(newfile);

        return "forward:index.jsp";
    }
}
