/*
 *
 *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
 *
 */

package com.toxic.search.biz.business;

import com.toxic.search.service.model.User;
import com.toxic.search.service.repository.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author py
 * @date 2019/4/1 3:52 PM.
 */
@Component
public class SearchBusiness {
    @Resource
    private UserDao userDao;

    public void save(User user) {
        this.userDao.save(user);
    }
}
