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
- Java
- Hibernate ( JPA 구현체 )

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

## 진행 중 발생한 어려움에 대한 기록

현재 호환성 문제로 어플리케이션이 정상적으로 실행되지 않고 있습니다.
이 문제를 해결하기 위해 [스트링 부트 버전 호환성 사이트](https://docs.spring.io/spring-boot/docs/current/reference/html/dependency-versions.html#appendix.dependency-versions)와 구글링을 통해 찾아보는 중입니다.
