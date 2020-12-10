package socialnetwork;
import java.awt.image.*;
import java.util.*;

		public class profileInfo 
		{
			private BufferedImage image;
			private String name;
			private String currentStatus;
			private ArrayList<profileInfo> friendList;
			
			/** Constructor for an instance of a profile. */
			public profileInfo()
			{} 
			
			/** Returns the picture associated with the profile.
			@return  The profile's picture. */
			public BufferedImage getProfilePicture()
			{
				return image;	
			}

			/** Sets the picture associated with the profile to the given picture.
			@param newPicture  The new picture associated with the profile. */
			public void setProfilePicture(BufferedImage newpic)
			{
				this.image = newpic;
			}
			
			/** Sets the name associated with the profile to the given name.
		       @param firstName  The first name for the profile.
		       @param lastName   The last name for the profile. */
			public void setName(String fName, String lName)
			{
				this.name = fName + " " + lName;
			}
			
			/** Returns the name associated with the profile.
			    @return  The profile's name. */	
			public String getName()
			{
				return this.name;
			}
			
			/** Sets the current status of the profile to the given string.
				@param stat  The new status for the profile. */
			public void setStatus(String stat)
			{
				this.currentStatus = stat;		
			}

			/** Returns the status associated with the profile.
				@return  The profile's status.*/
			public String getStatus()
			{
				return this.currentStatus;		
			}

			/** Returns a list of all the person's friendProfiles on the social network.
				@return  The list of friendProfiles. */
			public ArrayList<profileInfo> getFriends()
			{
				return friendList;		
			}

			/** Adds a friend to the profile's list of friendProfiles.
				@param p  The profile to be added to the list. */
			public void addFriend(profileInfo p)
			{
				this.friendList.add(p);		
			}

			/** Removes a friend from the profile's list of friendProfiles.
				@param p  The profile to be removed from the list.
		       @return  True if the profile was removed. */
			public boolean removeFriend(profileInfo p)
			{
				return this.friendList.remove(p);		
			}

			public String toString()
			{
				return name + " " + currentStatus;	
			}

			/** Displays the profile's information and friendProfiles. */
			public void display()
			{
				BufferedImage b = getProfilePicture();
				System.out.println(name);
				System.out.println(currentStatus);
				System.out.print(b);
				for(profileInfo p: friendList)
				{
					String name = p.getName();
					System.out.println(name);
				}
			}
		}



