package com.wowinteractive.apps.medicalcenter.daoimplementation.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.wowinteractive.apps.medicalcenter.core.dao.UserDAO;
import com.wowinteractive.apps.medicalcenter.core.model.User;

public class UserDAOImplementation extends HibernateDaoSupport implements UserDAO{
	
	 

	public User getUserByUsername(String username) {
		User user= null;
		Criteria criteria=this.getHibernateTemplate().getSessionFactory().getCurrentSession()
		.createCriteria(User.class).add(Restrictions.eq("username",username));
		user = (User) criteria.uniqueResult();
		return user;
	}

	public User getUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void disableUser(String username) {
		// TODO Auto-generated method stub
		
	}

	public User updateUser(User anUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
