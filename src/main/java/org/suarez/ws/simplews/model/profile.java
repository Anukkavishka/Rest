package org.suarez.ws.simplews.model;

public class profile {

		private long id;
		private String profilename;
		private String firstname;
		private String lastname;
		private String created_date;
		
		
		
		public profile(long id, String profilename, String firstname, String lastname, String created_date) {
			super();
			this.id = id;
			this.profilename = profilename;
			this.firstname = firstname;
			this.lastname = lastname;
			this.created_date = created_date;
		}
		
		
		public profile() {
			super();
			
		}


		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProfilename() {
			return profilename;
		}
		public void setProfilename(String profilename) {
			this.profilename = profilename;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getCreated_date() {
			return created_date;
		}
		public void setCreated_date(String created_date) {
			this.created_date = created_date;
		}
		
		
}
