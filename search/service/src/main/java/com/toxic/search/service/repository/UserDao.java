/*
 *
 *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
 *
 */

package com.toxic.search.service.repository;

import com.toxic.search.service.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @author py
 * @date 2019/3/31 10:09 PM.
 */
public interface UserDao extends ElasticsearchCrudRepository<User,String> {
}
