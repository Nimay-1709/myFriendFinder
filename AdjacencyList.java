package mainPackage;

import java.util.*;

public class AdjacencyList<profileInfo>
{
	private profileInfo[] list;
	private int noOfProfile;
	private boolean isInitialized = false;
	private static final int DEFAULT_CAP = 20;
	private static final int MAX_CAP = 1000;
	public AdjacencyList()
	{
		this(DEFAULT_CAP);
	}
	@SuppressWarnings("unchecked")
	public AdjacencyList(int initialCap)
	{
		if(initialCap < DEFAULT_CAP)
			initialCap = DEFAULT_CAP;
		else
			checkCapacity(initialCap);
		
		list = (profileInfo[]) (new Object[initialCap + 1]);
		noOfProfile = 0;
		isInitialized = true;
	}
	
	public void add(profileInfo newProfile)
	{
		add( noOfProfile + 1, newProfile);		
	}
	
	public void add(int location, profileInfo profile)
	{
		checkinitialization();
		if((location >= 1) && (location <= noOfProfile + 1))
		{
			if(location <= noOfProfile)
				makeRoom(location);
			list[location] = profile;
			noOfProfile++;
			ensureCapacity();
		}
		else
		{
			throw new IndexOutOfBoundsException("The location is larger than the actual size of storage");
		}
	}
	
	public profileInfo remove(int location)
	{
		checkinitialization();
		if((location >= 1) && (location <= noOfProfile))
		{
			assert !isEmpty();
			profileInfo result = list[location];
			if(location < noOfProfile)
				removeGap(location);
			noOfProfile--;
			return result;
		}
		else
		{
			throw new IndexOutOfBoundsException("There is no profile present at this location");
		}
	}
	
	public void clear()
	{
		checkinitialization();
		for(int index = 1; index <= noOfProfile; index++)
		{
			list[index] = null;
		}
		noOfProfile = 0;
	}
	
	public profileInfo replaceProfile(int location, profileInfo replaceProfile)
	{
		checkinitialization();
		if((location >= 1) && (location <= noOfProfile))
		{
			assert !isEmpty();
			profileInfo original = list[location];
			list[location] = replaceProfile;
			return original;
		}
		else
		{
			throw new IndexOutOfBoundsException("To replace a Profile, there is no profile present at this location");
		}
	}
	
	public profileInfo getEntry(int location)
	{
		checkinitialization();
		if((location >= 1) && (location <= noOfProfile))
		{
			assert !isEmpty();
			return list[location];
		}
		else
		{
			throw new IndexOutOfBoundsException("There is no profile present at this location");
		}
	}
	
	public boolean contains(profileInfo profile)
	{
		checkinitialization();
		boolean result = false;
		int index = 1;
		while(index <= noOfProfile && !result )
		{
			if(profile.equals(list[index]))
			{
				result = true;
			}
			index++;
		}
		return result;
	}
	
	public int getLength() {   return noOfProfile;   }
	
	public boolean isEmpty()
	{
		return (noOfProfile == 0);
	}
	
	public void ensureCapacity()
	{
		int capacity = list.length - 1;
		if(noOfProfile >= capacity)
		{
			int newCapacity = 2*capacity;
			checkCapacity(newCapacity);
			list = Arrays.copyOf(list,  newCapacity + 1);
		}
	}
	
	public void makeRoom(int newLocation)
	{
		assert(newLocation >= 1) && (newLocation <= noOfProfile + 1);
		int newindex = newLocation;
		int finalIndex = noOfProfile;
		for(int index = finalIndex; index >= newindex; index--)
		{
			list[index + 1] = list[index];
		}
	}
	
	public void removeGap(int location)
	{
		assert (location >= 1) && (location < noOfProfile);
		int lastIndex = noOfProfile;
		for(int index = location; index < lastIndex; index++)
		{
			list[index] = list[index + 1];
		}
	}
	
	private void checkinitialization()
	{
		if(!isInitialized)
		{
			throw new SecurityException("The profile is not properly initialized");
		}
	}
	
	private void checkCapacity(int capacity)
	{
		if(capacity > MAX_CAP)
		{
			throw new IllegalStateException("Improper attempt to  create list that exceeds total capacity");
		}
	}	
}
