package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.LoginDto;
import com.heima.model.user.pojos.ApUser;
import org.springframework.stereotype.Service;

public interface ApUserService extends IService<ApUser> {

    // app端登录功能
    public ResponseResult login(LoginDto dto);
}
