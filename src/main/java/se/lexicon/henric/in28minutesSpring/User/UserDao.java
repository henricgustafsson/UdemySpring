package se.lexicon.henric.in28minutesSpring.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	private static int usersCount =3;
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Eve",new Date()));
		users.add(new User(3,"Jack",new Date()));
	}
	
	public List<User> FindAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
