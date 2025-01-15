package himedia.myportal.services;

import org.springframework.beans.factory.annotation.Autowired;

import himedia.myportal.repositories.UserDao;
import himedia.myportal.repositories.vo.UserVo;
import jakarta.servlet.http.HttpServletRequest;

public class UserServieImpl implements UserService {

	@Autowired
	UserDao userDaoImpl;
	
	@Override
	public boolean join(UserVo vo) {
		return 1 == userDaoImpl.insert(vo);
	}

	@Override
	public UserVo getUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVo getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAuthenticated(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
