package com.rays.StrimeAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ContestantTest {

	public static void main(String[] args) {
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ram", "9827715686"));
		list.add(new Contestant("Anil", "9827715685"));
		list.add(new Contestant("Aman", "9827715684"));
		list.add(new Contestant("Gopal", "9827716666"));
		list.add(new Contestant("Naman", "9827715686658"));
		list.add(new Contestant("Harish", "9827715683"));
		list.add(new Contestant("Manoj", "9827715687"));
		list.add(new Contestant("Shivam", "9827715655"));
		list.add(new Contestant("Riya", "9827715696"));
		list.add(new Contestant("Monika", "982771586"));
		list.add(new Contestant("Rajesh", "9827715518"));
		list.add(new Contestant("Invalid Number", "77"));
		
		
		list.stream().map(e -> e.getPhone()).filter(e -> e.length() == 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e -> {
		Collections.shuffle(e);
		return e.stream();
		})).limit(3).forEach(e -> System.out.println(e));
		
		}		

	}


