package com.sagar.jobApp.model;

public class JobPost {
	private int postId;
	private String postProfile;

	public JobPost(int postId, String postProfile) {
		this.postId = postId;
		this.postProfile = postProfile;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostProfile() {
		return postProfile;
	}

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}
}
