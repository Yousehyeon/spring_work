package aaa.model;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinData2 {

	@NotEmpty(message = "아이디가 없오")
	@Size(min=3, max = 10, message = "id 길이 좀")
	String pid;
	
	@Pattern(regexp="[가-힣]{2,5}", message = "한글 2~5 입니다.")
	String pname;
	String pw1;
	String pw2;
	
	@Min(value=1,message="점수가 이상하다")
	@Max(value=100,message="점수가 이상하다")
	int kor;
	@Min(value=1,message="점수가 이상하다")
	@Max(value=100,message="점수가 이상하다")
	int eng;
	@Min(value=1,message="점수가 이상하다")
	@Max(value=100,message="점수가 이상하다")
	int math;
	
	@Email(message = "이메일 형식")
	String email;
	
	//@Past(message = "오늘 이전만 입력")
	//Date birth;
	
	String birth;
	
	
	@Positive(message = "양수만 입력")
	int ban;
}