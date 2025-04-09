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
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "social_user")
    @JsonIgnore
    private SocialUser user;

    private String description;

    public void setSocialUser(SocialUser socialUser){
        this.user = socialUser;
        if (user.getSocialProfile() != this)
            user.setSocialProfile(this);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SocialUser getUser() {
		return user;
	}

	public void setUser(SocialUser user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SocialProfile(Long id, SocialUser user, String description) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
	}

	public SocialProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SocialProfile [id=" + id + ", user=" + user + ", description=" + description + "]";
	}
    
    
}
