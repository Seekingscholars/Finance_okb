package com.cn.manager.web.controller;

import com.cn.core.common.ResultModel;
import com.cn.core.controller.BaseController;
import com.cn.core.db.DatabaseContextHolder;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 用户列表 Controller
 * @author: nmnl
 * @version 1.0.0
 * @date: 20180403 18:25
 */
@Controller
@Scope("prototype")
@RequestMapping("/manager/user/")
public class ManageUserController extends BaseController {

    /**
	 * 统计用户列表
     * @auther nmnl
     * @version 1.0.0
     * @data 20180403 19:22
     */
	@RequestMapping(value = "listUser.htm", method = {RequestMethod.GET})
	public ResponseEntity<ResultModel> listUser() throws Exception {
		DatabaseContextHolder.setDbName(DatabaseContextHolder.READ_DB);
		this.logger.info("设计之初. !!!!! ");
		return new ResponseEntity<>(ResultModel.ok(), HttpStatus.OK);
	}


}
