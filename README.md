# 웹 페이지 구축 미션 프로젝트

사용자들이 자기 자신의 정보를 직접 드러낼 필요 없이 의견을 교환할 수 있는 웹 페이지를 만들어봅니다.
단, 자신이 누군지를 드러낼 필요는 없지만 작성한 사람이 원한다면 수정 ∙ 삭제는 가능해야합니다.

## 프로젝트 구조

- `controller/`: 컨트롤러 파일이 있는 디렉토리
- `entitiy/`: 엔티티 클래스 파일이 있는 디렉토리
- `repository/`: 레포지토리 클래스 파일이 있는 디렉토리
- `service/`: 서비스 클래스 파일이 있는 디렉토리

## 사용된 기술 스택

- Spring Boot
- SQLite
- Hibernate
- Lombok
- test


## 주요 파일 설명

- `BoardController.java`: 게시판과 관련된 HTTP 요청을 처리하는 컨트롤러
- `PostController.java`: 게시글과 관련된 HTTP 요청을 처리하는 컨트롤러
- `CommentController.java`: 댓글과 관련된 HTTP 요청을 처리하는 컨트롤러
- `Board.java`: 게시판 엔티티 클래스
- `Post.java`: 게시글 엔티티 클래스
- `comment.java`: 댓글 엔티티 클래스
- `BoardRepository.java`: 게시판 데이터베이스 조작을 위한 리포지토리
- `PostRepository.java`: 게시글 데이터베이스 조작을 위한 리포지토리
- `CommentRepository.java`: 댓글 데이터베이스 조작을 위한 레포지토리

## 프로젝트 진행 중 느낀 어려웠던 점, 새로웠던 점

1. spring boot 프레임워크를 사용하기 앞서 필요했던 환경 설정 및 의존성 관리의 새로운 개념을 배웠음
2. JPA 및 Hibernate를 사용하여 데이터베이스와 상호작용하는 방법에 대해 어려움을 느낌
3. 웹 페이지 및 Thymeleaf에 대한 이해력이 부족했음
4. 프론트엔드 기능과 백엔드의 기능을 직접적으로 같이 작성하는것에 복잡함을 느낌
5. 보안 및 예외 처리로 사용자 인증, 권한 관리, 예외 처리등에 다음과 같은 로직에 복잡함을 느낌
  
![화면 캡처 2024-01-11 155354](https://github.com/kosh8348/Mission_koseunghyun/assets/150996149/88c12abd-3e6e-470e-af10-ff1a12462f91)
![화면 캡처 2024-01-11 155500](https://github.com/kosh8348/Mission_koseunghyun/assets/150996149/7c5a34c8-5138-4c68-8cd9-8a7c0226df39)



