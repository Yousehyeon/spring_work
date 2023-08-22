package di_p;

import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Class implements BeanNameAware, InitializingBean, DisposableBean {
		
		String name;
		String subject;
		String result;
		int [] score;
		int total;
		int avg;
		
		public Class() {
			
		}
		
		
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
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
		public void setScore(int [] score) {
			this.score = score;
			total = 0;
			for (int i : score) {
				total += i;
			}
			avg = total / score.length;
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
		


		@Override
		public String toString() {
			return "Class [name=" + name + ", subject=" + subject + ", score=" + Arrays.toString(score) + ", total="
					+ total + ", avg=" + avg + ", result=" + result + "]";
		}


		@Override
		public void destroy() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("destroy()");
		}
		@Override
		public void afterPropertiesSet() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("afterPropertiesSet()");
		}
		@Override
		public void setBeanName(String name) {
			// TODO Auto-generated method stub
			System.out.println("setBeanName():"+name);
		}
		
		
		
		
		

		


		
}
