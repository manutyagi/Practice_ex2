package com.stackroute.pe2;

public class StudentsAndGrades {
	public String calculateAvg(String n,int[] grades) {
		if(n.isEmpty()) {
			return null;
		}else if(Integer.parseInt(n)>grades.length){
			return null;
		}
		else {
			int numberOfStudents = Integer.parseInt(n);
			float sum = 0;
			for(int i=0;i<numberOfStudents;i++) {
				sum+=grades[i];
			}
			sum/=numberOfStudents;
			System.out.println(sum);
			return sum+"";
		}
	}
	public String calculateMin(String n,int[] grades) {
		if(n.isEmpty()) {
			return null;
		}else {
			int numberOfStudents = Integer.parseInt(n);
			int temp = grades[0];
			for(int i = 1;i<numberOfStudents;i++) {
				if(grades[i]<temp) {
					temp = grades[i];
				}
			}
			return temp+"";
		}
	}
	public String calculateMax(String n,int[] grades) {
		if(n.isEmpty()) {
			return null;
		}else {
			int numberOfStudents = Integer.parseInt(n);
			int temp = grades[0];
			for(int i = 1;i<numberOfStudents;i++) {
				if(grades[i]>temp) {
					temp = grades[i];
				}
			}
			return temp+"";
		}
	}
}
