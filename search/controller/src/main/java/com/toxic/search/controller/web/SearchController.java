/*
 *
 *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
 *
 */

package com.toxic.search.controller.web;

import com.toxic.search.biz.business.SearchBusiness;
import com.toxic.search.service.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author py
 * @date 2019/4/1 3:54 PM.
 */
@Controller
@RequestMapping("/search")
public class SearchController {
    @Resource
    private SearchBusiness searchBusiness;

    @RequestMapping("/testSave")
    public void test(){
        User user = new User();
        user.setAge("17");
        user.setId("20190401001");
        user.setName("潘滢");
        user.setSex("男");
        searchBusiness.save(user);
    }
}
