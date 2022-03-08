package Constructor;

import java.util.ArrayList;

public class University {
// Design a University class template with the following features:
		/* variables:
			name﻿
			country
			stablishedDate
			List of course provided in Array List<String>
			Design the constructor of this class with different parameters and all parameters.
			Write the get method of each variable with return keyword.
*/
		String name;
		String country;
		String establishedDate;
		ArrayList<String> courses;
		
		
		public University(String name, String country) {
			this.name = name;
			this.country = country;
		}

	
		public University(String name, String country,String establishedDate, ArrayList<String> courses) {
			this.name = name;
			this.country = country;
			this.establishedDate=establishedDate;
			this.courses = courses;
		}


		
		
		
		
		
		
		
		
		
		
		
	

}
