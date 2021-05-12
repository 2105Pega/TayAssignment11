package com.revature;

public class Run {
private int far;
private String name;
public int getFar() {
	return far;
}
public void setFar(int far) {
	this.far = far;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Run [far=" + far + ", name=" + name + "]";
}

}
