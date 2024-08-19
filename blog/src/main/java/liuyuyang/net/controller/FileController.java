package liuyuyang.net.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.qiniu.common.QiniuException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liuyuyang.net.execption.YuYangException;
import liuyuyang.net.model.File;
import liuyuyang.net.result.Result;
import liuyuyang.net.service.FileService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@Api(tags = "文件管理")
@RestController
@RequestMapping("/file")
@Transactional
public class FileController {
    @Resource
    private FileService fileService;

    @GetMapping("/{name}")
    @ApiOperation("获取文件信息")
    @ApiOperationSupport(author = "刘宇阳 | liuyuyang1024@yeah.net", order = 1)
    public Result<File> get(@PathVariable String name) throws QiniuException {
        File data = fileService.get(name);
        return Result.success(data);
    }

    @GetMapping
    @ApiOperation("获取文件列表")
    @ApiOperationSupport(author = "刘宇阳 | liuyuyang1024@yeah.net", order = 1)
    public Result<List<File>> list() throws QiniuException {
        List<File> list = fileService.list();
        return Result.success(list);
    }
}
