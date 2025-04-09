package com.social.media.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "user", cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE})
    //@JoinColumn(name = "social_profile_id")
    private SocialProfile socialProfile;

    @OneToMany(mappedBy = "socialUser", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Post> posts = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<SocialGroup> groups = new HashSet<>();

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public void setSocialProfile(SocialProfile socialProfile){
        socialProfile.setUser(this);
        this.socialProfile = socialProfile;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Set<SocialGroup> getGroups() {
		return groups;
	}

	public void setGroups(Set<SocialGroup> groups) {
		this.groups = groups;
	}

	public SocialProfile getSocialProfile() {
		return socialProfile;
	}

	public SocialUser(Long id, SocialProfile socialProfile, List<Post> posts, Set<SocialGroup> groups) {
		super();
		this.id = id;
		this.socialProfile = socialProfile;
		this.posts = posts;
		this.groups = groups;
	}

	public SocialUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SocialUser [id=" + id + ", socialProfile=" + socialProfile + ", posts=" + posts + ", groups=" + groups
				+ "]";
	}
    
    
}
