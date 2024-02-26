package codingon.codingonspringbootjpa.service;

import codingon.codingonspringbootjpa.dto.UserDTO;
import codingon.codingonspringbootjpa.entity.UserEntity;
import codingon.codingonspringbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<UserDTO> getUserList(){
        // repository 에서 전체 조회 가능하도록 구현
        // findAll() : JpaRepository 인터페이스에 정의되어 있는 메소드

        List<UserEntity> users = userRepository.findAll();
        List<UserDTO> result =  new ArrayList<>();
        for(UserEntity user: users){
            UserDTO userDTO = UserDTO.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .nickname(user.getNickname())
                    .no(user.getId()+100)
                    .build();

            result.add(userDTO);
        }
        return result;
    }

    public String insertUser(UserEntity user){
        // jpa save(T) 메소드 : T 는 Entity
        // - insert 할 때
        // - 기존 entity 를 update 할 때
        // => 기본값(pk) 상태에 따라 다르게 동작
        //      pk 가 존재한다면 pk 와 연결된 entity update
        //      pk 가 없는 경우, 새로운 entity insert
        UserEntity newUser = userRepository.save(user);
        // save 를 했을 때 반환되는 객체는 Entity 객체
        return newUser.getName();
    }
}
