package challenge;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MCQAss {
	public static void main(String[] args) {
		MCQAss mcq = new MCQAss();
		mcq.ques();
	}
	public void ques() {
		Map<Integer,String> ques = new TreeMap<Integer,String>();
		ques.put(1, "Indian flag has how many colours ?");
		ques.put(2, "Indian Nation bird ?");
		ques.put(3, "Which is Captial city of India !");
		ques.put(4, "Manchester of India is known as !");
		ques.put(5, "Blue city of India is known as !");
		
		Map<Integer,String> ans = new TreeMap<Integer,String>();
		ans.put(0, "three");
		ans.put(1, "peacock");
		ans.put(2, "delhi");
		ans.put(3, "mumbai");
		ans.put(4, "jaipur");
		
		Scanner sc = new Scanner(System.in);
		int v=0;
		Random generator = new Random();
		
		Set<Map.Entry<Integer, String> > entrySet = ques.entrySet();
		Object[] values = ques.values().toArray();

		for(int j=0;j<5;j++) {
		int i=generator.nextInt(values.length);
		Object randomValue = values[i];
		System.out.println(randomValue);
		String answer = sc.nextLine();
		answer = answer.toLowerCase();
		if(answer.equals(ans.get(i))) {
			++v;	
		}
		}
		System.out.println(score(v));


	}
	public String score(int i) {
		String a="";
		switch(i) {
		case 0: a="General knowledge will always help you. Take it seriously.";break;
		case 1: a="Needs to take interest";break;
		case 2: a="Read more to score more";break;
		case 3: a="Good";break;
		case 4: a="Excellent";break;
		case 5: a="Outstanding";break;
		
		}
		return a;
	}
}
