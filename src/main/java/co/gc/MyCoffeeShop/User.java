package co.gc.MyCoffeeShop;

public class User {
		private String firstname;
		private String lastname;
		private String email;
		private String phonenumber;
		private String birthday;
		private boolean newsletter;
		private String password;
		
		public User() {
			
		}

		public User(String firstname, String lastname, String email, String phonenumber, String birthday,
				boolean newsletter, String password) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.phonenumber = phonenumber;
			this.birthday = birthday;
			this.newsletter = newsletter;
			this.password = password;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public boolean getNewsletter() {
			return newsletter;
		}

		public void setNewsletter(boolean newsletter) {
			this.newsletter = newsletter;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phonenumber="
					+ phonenumber + ", birthday=" + birthday + ", newsletter=" + newsletter + ", password=" + password
					+ "]";
		}
		
}
