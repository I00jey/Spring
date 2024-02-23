package codingon.codingonspringboot.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public class UserVO {
    private String name;
    private String age;

    // 동등성 구현을 위한 코드
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;

        UserVO userVO = (UserVO) o;

        // 여기서 모든 필드를 비교
        return Objects.equals(name, userVO.name) && Objects.equals(age,userVO.age);
    }
    @Override
    public int hashCode(){
        // 필드들을 이용한 해시코드 생성
        return Objects.hash(name, age);
    }
}
// ex. CRUD 구현 시 한 값과 다른 값을 비교할 때 사용하기 위해 equals 와 hashCode 오버라이딩
// equals 의 값이 true 이고 두 값(객체)의 해시코드까지 같아야 같은 객체로 인식
