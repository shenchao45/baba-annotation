package com.shenchao.controller.admin;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by shenchao on 2017/2/11.
 */
@Controller
public class UploadController {

    @RequestMapping("/upload/uploadPic.do")
    @ResponseBody
    public Map uploadPic(@RequestParam(required = false) MultipartFile pic) throws IOException {
        String fileName = "http://localhost:8088/image-web/upload/"+UUID.randomUUID().toString().replace("-", "")+pic.getOriginalFilename().substring(pic.getOriginalFilename().indexOf("."));
        Client client = new Client();
        WebResource resource = client.resource(fileName);
        resource.put(pic.getBytes());
        Map map = new HashMap();
        map.put("url", fileName);
        map.put("path", fileName);
        return map;
    }
}
