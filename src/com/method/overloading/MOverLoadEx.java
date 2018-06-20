package com.method.overloading;

public class MOverLoadEx {
	void fifa() {
		System.out.println("Fifa World Cup");
	}
	void fifa(String hostName) {
		System.out.println("Host: "+hostName);
	}
	int fifa(int totalTeam) {
		System.out.println("Total Team: "+totalTeam);
		return totalTeam;
	}
	public static void main(String[] args) {
		MOverLoadEx mLoadEx = new MOverLoadEx();
		mLoadEx.fifa();
		mLoadEx.fifa("Russia");
		mLoadEx.fifa(32);
	}

}
