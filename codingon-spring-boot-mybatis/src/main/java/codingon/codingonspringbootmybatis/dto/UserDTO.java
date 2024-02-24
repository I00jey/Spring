package codingon.codingonspringbootmybatis.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {
    private  int id;
    private String name;
    private  String nickname;
    private int no;
    // domain.User 와 다르게 "no" 항목 추가
    // 실제 테이블에 존재하는 칼럼은 아니지만 서비스 로직에서 no 정보 활용 예정

}

// @Builder
// - 빌더 패턴
// - 디자인 패턴의 "생성" 패턴 중 하나
// - 객체를 생성하는 방법 중 하나
// 1) set 함수를 이용하는 방법
// 2) 생성자에 주입하는 방법
// 빌더 사용하면 setter 없이 생성 가능
// 빌더 패턴은 복잡한 객체의 생성 과정 및 표현 방법을 분리해
// 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴