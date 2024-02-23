package codingon.codingonspringboot.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public class UserVoPrac {
    private String name;
    private String gender;
    private int year;
    private int month;
    private int date;
    private String hobby;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;

        UserVoPrac userVO = (UserVoPrac) o;

        return Objects.equals(name, userVO.name) && Objects.equals(gender,userVO.gender)&& Objects.equals(year,userVO.year)&& Objects.equals(month,userVO.month)&& Objects.equals(date,userVO.date)&& Objects.equals(hobby,userVO.hobby);
    }

}
