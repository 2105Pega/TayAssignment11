package com.revature;

public class Fly {
private int jump;
private String name;

public Fly(int jump, String name) {
	super();
	this.jump = jump;
	this.name = name;
}
public int getJump() {
	return jump;
}
public void setJump(int jump) {
	this.jump = jump;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Fly [jump=" + jump + ", name=" + name + "]";
}

}
