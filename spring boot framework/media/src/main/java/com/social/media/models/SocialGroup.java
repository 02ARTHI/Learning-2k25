package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "groups")
    @JsonIgnore
    private Set<SocialUser> socialUsers = new HashSet<>();

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<SocialUser> getSocialUsers() {
		return socialUsers;
	}

	public void setSocialUsers(Set<SocialUser> socialUsers) {
		this.socialUsers = socialUsers;
	}

	public SocialGroup(Long id, Set<SocialUser> socialUsers) {
		super();
		this.id = id;
		this.socialUsers = socialUsers;
	}

	public SocialGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SocialGroup [id=" + id + ", socialUsers=" + socialUsers + "]";
	}
    
    
}
