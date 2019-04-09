package com.sghwang.springwebservice.web;

import com.sghwang.springwebservice.domain.posts.PostsRepository;
import com.sghwang.springwebservice.domain.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController annotation은 클래스의 모든 메소드에
 * @ResponseBody를 적용시켜준다.
 */

/*
 * Bean을 주입받는 방법은 1.@Autowired, 2.setter 3.생성자
 * 이 중에서 생성자로 주입받는 것을 가장 권장.
 *
 * @AllArgsConstructor
 *      - 현재 클래스의 모든 필드를 인자값으로 하는 생성자를 만들어줌.
 */

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());
    }
}
