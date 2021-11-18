package com.user.serviceImpul;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.Entities.User;
import com.user.service.UserService;
@Service
public class UserServiceImpul implements UserService {
	
	//fake user List
	List<User> list=List.of(
			new User(123L,"parvaiz sajad","6360098613"),
			new User(124L,"sajad Hussain","9900098613"),
			new User(125L,"/tahseen sajad","20202098613"),
			new User(126L,"Tabasum sajad","88030098613")
			
			
			);

	public User getUser(Long id) {
		// TODO Auto-generated method stub
	
	
		return this.list.stream().filter(user->user.getUser_id().equals(id)).findAny().orElse(null);
	}

}
