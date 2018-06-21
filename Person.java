package javaproj;

public class Person {
protected String name;
protected String add;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public String toString() {
	return "Person [name=" + name + ", add=" + add + "]";
}


	
}
