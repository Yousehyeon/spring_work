package di_p;

import java.util.Arrays;

public class Student {
		
		String name;
		String subject;
		int [] score;
		int total;
		int avg;
		int rank;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public int[] getScore() {
			return score;
		}
		public void setScore(int[] score) {
			 this.score = score;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			for (int s : score) {
				this.total = total += s;
	        }
		}
		public int getAvg() {
			return avg;
		}
		public void setAvg(int avg) {
			if (score.length > 0) {
	            this.avg = total / score.length;
	        }
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", subject=" + subject + ", score=" + Arrays.toString(score) + ", total="
					+ total + ", avg=" + avg + ", rank=" + rank + "]";
		}
		
		
		
		

		


		
}
