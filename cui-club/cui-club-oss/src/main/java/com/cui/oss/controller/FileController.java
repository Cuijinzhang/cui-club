package com.cui.oss.controller;

import com.cui.oss.entity.Result;
import com.cui.oss.service.FileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件操作controller
 *
 * @author: ChickenWing
 * @date: 2023/10/14
 */
@RestController
public class FileController {

    @Resource
    private FileService fileService;

    @RequestMapping("/testGetAllBuckets")
    public String testGetAllBuckets() throws Exception {
        List<String> allBucket = fileService.getAllBucket();
        return allBucket.get(0);
    }

    @RequestMapping("/getUrl")
    public String getUrl(String bucketName, String objectName) throws Exception {
        return fileService.getUrl(bucketName, objectName);
    }

    /**
     * 上传文件
     */
    @RequestMapping("/upload")
    public Result upload(MultipartFile uploadFile, String bucket, String objectName) throws Exception {
        String url = fileService.uploadFile(uploadFile, bucket, objectName);
        return Result.ok(url);
    }

}
