package com.chieyoun.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.UUID;

@Controller
public class CkeditorController {

    @PostMapping(value = "/image/upload")
    public ModelAndView image(MultipartHttpServletRequest request) throws Exception {

        ModelAndView mav = new ModelAndView("jsonView");

        MultipartFile uploadFile = request.getFile("upload");

        String originalFileName = uploadFile.getOriginalFilename();

        String ext = originalFileName.substring(originalFileName.indexOf("."));

        String newFileName = UUID.randomUUID() + ext;

        String realPath = request.getServletContext().getRealPath("/");

        String savePath = realPath + "upload/" + newFileName;

        String uploadPath = "./upload/" + newFileName;

        File file = new File(savePath);

        uploadFile.transferTo(file);

        mav.addObject("uploaded", true);
        mav.addObject("url", uploadPath);

        return mav;
    }

}