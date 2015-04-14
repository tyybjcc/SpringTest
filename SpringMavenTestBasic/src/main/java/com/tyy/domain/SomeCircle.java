package com.tyy.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SomeCircle {
	private Circle[] circleArray;
	private List<Circle> circleList = new ArrayList<Circle>();
	private Map<String,Circle> circleMap = new HashMap<String,Circle>();
	private Set<Circle> circleSet = new HashSet<Circle>();
	private Properties circleProperties;
	
	private Circle myCircle;
	
	public SomeCircle(){
		this.myCircle = new Circle();
	}
	
	
	
	public Circle getMyCircle() {
		return myCircle;
	}

	public void setMyCircle(Circle myCircle) {
		this.myCircle = myCircle;
	}

	public Circle[] getCircleArray() {
		return circleArray;
	}

	public void setCircleArray(Circle[] circleArray) {
		this.circleArray = circleArray;
	}

	public List<Circle> getCircleList() {
		return circleList;
	}

	public void setCircleList(List<Circle> circleList) {
		this.circleList = circleList;
	}

	public Map<String, Circle> getCircleMap() {
		return circleMap;
	}

	public void setCircleMap(Map<String, Circle> circleMap) {
		this.circleMap = circleMap;
	}
	
	
	
	public Set<Circle> getCircleSet() {
		return circleSet;
	}

	public void setCircleSet(Set<Circle> circleSet) {
		this.circleSet = circleSet;
	}
	
	

	public Properties getCircleProperties() {
		return circleProperties;
	}

	public void setCircleProperties(Properties circleProperties) {
		this.circleProperties = circleProperties;
	}

	public void printArray(){
		System.out.println("print array----");
		for(Circle c : circleArray){
			System.out.println("circle radius: "+c.getRadius());
		}
	}
	
	public void printList(){
		System.out.println("print list----");
		for(Circle c : circleList){
			System.out.println("circle radius: "+c.getRadius());
		}
	}
	
	//entrySet的使用(只有将hashmap转换为entryset才能通过for-each进行遍历)
	public void printMap(){
		System.out.println("print map----");
		for(Entry<String,Circle> entry : circleMap.entrySet()){
			System.out.println("circle key: "+entry.getKey()+", radius: "+entry.getValue());
		}
	}
	
	public void printSet(){
		System.out.println("print set----");
		for(Circle c : circleSet) {
			System.out.println("circle radius: "+c.getRadius());
		}
	}
	
	public void printProperties() {
		System.out.println("print properties");
		for(Entry entry : this.circleProperties.entrySet()){
			System.out.println("circle property: key="+entry.getKey()+", value="+entry.getValue());
		}
	}
}
