package com.sghwang.springwebservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * @NoArgsConstructor
 *      - 기본 생성자 자동 추가
 *      - access = AccessLevel.PROTECTED : 기본생성자의 접근 권한을 protected로 제한
 *      - 생성자로 protected Posts() {}와 같은 효과
 * @Entity
 *      - 테이블과 링크될 클래스임을 나타냅니다.
 *      - 언더스코어 네이밍(_)으로 이름을 매칭합니다.
 *      - ex) SalesManager.java -> sales_manager table
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {

    /*
     * @Id
     *      - 해당 테이블의 PK 필드를 나타냅니다.
     * @GeneratedValue
     *      - PK의 생성 규칙을 나타냅니다.
     *      - 기본값은 AUTO 로, MySQL의 auto_increment와 같이 자동증가하는 정수형 값이 됩니다.
     *      - 스프링 부트 2.0에선 옵션을 추가하셔야만 auto_increment가 됩니다!
     */
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /*
     * @Builder
     *      - 해당 클래스의 빌더패턴 클래스를 생성
     */
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
