package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)   // 부모쪽은 호출하지 않게하기
@NoArgsConstructor
public class QryCommentList extends QryResult{

    @ToString.Exclude
    @JsonProperty("data")   // list 라는 이름 말고 data 라는 이름으로 나오게하기
    List<Comment> list;
}
