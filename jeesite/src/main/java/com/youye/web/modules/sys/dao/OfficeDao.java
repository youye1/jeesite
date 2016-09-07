/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.youye.web.modules.sys.dao;

import com.youye.web.common.persistence.TreeDao;
import com.youye.web.common.persistence.annotation.MyBatisDao;
import com.youye.web.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
