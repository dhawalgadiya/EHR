package ehr.data.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ehr.data.dao.UserDao;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = Logger
			.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;
}
