import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setName("Max");
		u1.setId(19910916);
		User u2 = new User();
		u2.setName("Alix");
		u2.setId(19930612);
		
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		
//		Collections.sort(list, new Comparator<User>() {
//			public int compare(User user1, User user2) {
//				return user1.getId().compareTo(user2.getId());				
//			}
//		});
		
		Collections.sort(list, new Comparator<User>() {
			public int compare(User user1, User user2) {
				return user1.getName().compareTo(user2.getName());				
			}
		});
		
		for (User user : list)
			System.out.println(user.getName());
				
	}

}
