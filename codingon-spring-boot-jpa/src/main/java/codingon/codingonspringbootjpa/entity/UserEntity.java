package codingon.codingonspringbootjpa.entity;

// Entity
// - DB 에서 쓰이는 필드와 매핑이 되는 클래스 (DB 테이블과 대응되는 클래스)

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


// Builder, Entity 어노테이션 동시 사용 -> 두 개가 충돌해서 생성자가 만들어지지 않는 문제가 생김
// 원래는 Entity, Builder 각각에 맞는 생성자가 자동으로 생김
// 빌더 -> 모든 필드를 사용하는 생성자 필요
// 엔티티 -> 기본 생성자 필요

@Getter
@Builder // 객체 생성 처리
@AllArgsConstructor // 모든 필드를 사용하는 생성자
@Entity // 해당 클래스가 Entity 클래스임을 명시 (반드시 추가하기)
@NoArgsConstructor // 매개변수가 없는 생성자 (기본 생성자)
@Table(name = "user") // 테이블 명과 클래스 명이 동일한 경우는 생략 가능 (대문자 사용하려면 따로 설정 필요함)

public class UserEntity {
    @Id // PK 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 사용 옵션
    private int id;

    @Column(nullable = false, length = 20) // NOT NULL varchar(20)
    private String name; // 만약, 컬럼명이 다르면 name="text" 로 매핑시킬 컬럼명 적어주면 됨

    // 타입 : text (varchar X)
    @Column(columnDefinition = "TEXT")
    private String nickname;

    // 참고. Enum 타입 가능
//    @Column
//    @Enumerated(EnumType.STRING)
//    private UserType type;
//    public enum UserType{
//        STUDENT, TEACHER
//    }

}
