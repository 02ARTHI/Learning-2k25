package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private SocialUser socialUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SocialUser getSocialUser() {
		return socialUser;
	}

	public void setSocialUser(SocialUser socialUser) {
		this.socialUser = socialUser;
	}

	public Post(Long id, SocialUser socialUser) {
		super();
		this.id = id;
		this.socialUser = socialUser;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", socialUser=" + socialUser + "]";
	}
    
    
}
