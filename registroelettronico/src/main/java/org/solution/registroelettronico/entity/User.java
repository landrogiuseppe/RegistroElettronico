package org.solution.registroelettronico.entity;

import javax.persistence.*;

@Entity
public class User {
	
	 	private int id;
	    private String nickname;
	    private String password;
	    
	    
	    @Id
	    @Column(name = "id", nullable = false)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		@Basic
	    @Column(name = "nickname", nullable = false, length = 45)
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		
		@Basic
	    @Column(name = "password", nullable = false, length = 45)
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		

}
