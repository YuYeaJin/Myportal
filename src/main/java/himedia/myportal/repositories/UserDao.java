package himedia.myportal.repositories;

import himedia.myportal.repositories.vo.UserVo;

public interface UserDao {
	public int insert(UserVo vo); // 가입할때 
	public UserVo selectUser(String email); // 중복체크
	public UserVo selectUser(String email, String password); // 로그인
}
