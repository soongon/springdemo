package kr.re.kitri.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    // 전체 글보기
    public String getAllPosts() {
        // 글이 저장된 데이터베이스에스 글을 가져온다.
        // 가져온 글을 자바 객체에 담아서 반환한다.
        return "전체 글.... with DI";
    }

    // 상세 글보기
}
