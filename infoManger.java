package socialnetwork;

	import java.awt.image.*;
	import java.util.*;
	import GraphPackage.*;

	public class infoManager 
	{
		private UndirectedGraph<profileInfo> listOfProfiles;
		
		/** Constructor for an instance of a profile manager. */
		public infoManager()
		{
			listOfProfiles = new UndirectedGraph<>();
		} 
		
		/** Adds profile to the social network.
			@param p  The profile to be added to the network. */
		public void addProfile(profileInfo p)
		{
			listOfProfiles.add(p);
		} 
		
		public void createFriendship(profileInfo user1, profileInfo user2)
		{
			user1.addFriend(user2);
			user2.addFriend(user1);
		}
		/** Creates a friendship between two users on the social network.
			@param a  The first user in the friendship.
			@param b  The second user in the friendship. */
		
		/** Displays each profile's information and friends. */
		public void display(profileInfo startProfile)
		{
			for(profileInfo p : listOfProfiles)
			{
				p.display();						
			}
		}
	}



