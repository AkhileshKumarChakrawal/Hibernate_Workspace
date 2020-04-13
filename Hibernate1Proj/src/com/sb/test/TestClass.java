package com.sb.test;


public class TestClass {
private int eno;
private String ename;
private float sal;
private String eaddr;

public int getEno() {
	return eno;
}

public void setEno(int eno) {
	this.eno = eno;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public float getSal() {
	return sal;
}

public void setSal(float sal) {
	this.sal = sal;
}

public String getEaddr() {
	return eaddr;
}

public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}

@Override
public String toString() {
	return "TestClass [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", eaddr=" + eaddr + "]";
}

}
