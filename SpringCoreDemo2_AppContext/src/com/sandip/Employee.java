package com.sandip;

public class Employee {
	
	private int eid;
	private String ename;
	private String eaddress;
	
	public Employee()
	{
		System.out.println("---Object Constructed---");
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEaddress() {
		return eaddress;
	}
	
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress="
				+ eaddress + "]";
	}
	
	public void myInit()
	{
		System.out.println("-----Object Initialized-----");
	}
	
	public void myDestroy()
	{
		System.out.println("-----Object Destroyed-----");
	}
}
