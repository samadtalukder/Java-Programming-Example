package com.getter_setter;

public class FacebookMain {

	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.setPost("What's on your mind friends");
		fb.setCountLike(120);
		System.out.println("Your Status: "+fb.getPost());
		System.out.println("Your Status Like: "+fb.getCountLike());
	}

}
