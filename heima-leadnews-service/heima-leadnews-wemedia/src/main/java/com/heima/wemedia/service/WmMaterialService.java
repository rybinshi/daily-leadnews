package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmMaterialDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.springframework.web.multipart.MultipartFile;

public interface WmMaterialService extends IService<WmMaterial> {

    /**
     * 上传图片等文件
     * @param multipartFile
     * @return
     */
    public ResponseResult uploadFile(MultipartFile multipartFile);

    ResponseResult findMaterialList(WmMaterialDto wmMaterialDto);
}
