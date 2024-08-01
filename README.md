## MVC 패턴을 활용한 간단한 게시판 만들기
<img width="1440" alt="스크린샷 2024-08-01 오전 9 09 20" src="https://github.com/user-attachments/assets/61105943-a1af-4ca2-aad3-d7a70470c3c4">
<br/><br/><br/>
<h1>📚 목차</h1>
<ul>
  <li><a>프로젝트 소개</a></li>
  <li><a>프로젝트 기능</a></li>
  <li><a>사용 기술</a></li>
  <li><a>실행 화면</a></li>
  <li><a>패키지 구조</a></li>
  <li><a>DB 설계</a></li>
  <li><a>개발 내용</a></li>
  <li><a>후기</a></li>
</ul><br/><br/>

<h1>프로젝트 소개</h1>
<P>국비학원에서 배운 내용을 바탕으로 Java와 Spring Boot를 사용하여 게시판을 구현해보면서 웹 프로그래밍의 기초를 익히는 것을 목표로 했습니다.</P>
<p>MVC 패턴을 이해하고, 데이터베이스와의 연동을 통해 데이터를 저장하고 조회하는 방법을 익히는 것을 목표로 했습니다.</P><br/>

<h1>프로젝트 기능</h1>
<p>프로젝트의 주요 기능은 다음과 같습니다.</p>
<p>게시판 - CRUD 기능, 조회수, 페이징</p> 
<p>사용자 - Security 회원가입 및 로그인, OAuth 2.0 구글, 네이버, 카카오 로그인, 회원정보 수정, 회원가입시 유효성 검사 및 중복 검사</p>
<p>댓글 - CRUD 기능</p><br/>

<h1>사용 기술</h1>
<h3>백엔드</h3>
<p>주요 프레임워크 / 라이브러리</p>

<ul>
  <li>Java 17</li>
  <li>SpringBoot 3.2.5</li>
  <li>Spring Security</li>
  <li>Spring web</li>
  <li>JDBC API</li>
  <li>OAuth2 Client</li>
  <li>Lombok</li>
  <li>Validation</li>
</ul><br/>
  
<p>Build Tool</p>
<ul>
  <li>Gradle 7.2</li>
</ul><br/>

<p>DataBase</p>
<ul>
  <li>MySQL 8.0.36</li>
  <li>MyBatis Framework</li>
  <li>MySQL Driver</li>
</ul><br/>

<h3>프론트엔드</h3>

<ul>
  <li>Html/Css</li>
  <li>JavaScript</li>
  <li>jQuery</li>
  <li>Thymeleaf</li>
  <li>Bootstrap 4.3.1</li>
  <li>Summernote</li>
</ul><br/>

<h1>실행화면</h1>
<details>
  <summary><h3>로그인 사용자 인증 및 권한 관리</h3></summary>
  <img width="1363" alt="스크린샷 2024-08-01 오전 9 01 57" src="https://github.com/user-attachments/assets/2dfc5dfe-ffbe-4868-b51c-0aeff89d1381">
</details>
<br/>
<details>
  <summary><h3>게시글 상세보기</h3></summary>
  <p>사진 업로드와 첨부파일 다운로드 가능합니다! 또한 수정 삭제 가능합니다!</p>
  <p>게시글에 대한 댓글을 달 수 있고, 자신의 댓글만 삭제할 수 있습니다</p>
  <p>또한 자신의 게시물은 수정 삭제가 가능하지만 남의 게시물은 조회와 댓글만 가능합니다!</p>
  <img width="1440" alt="스크린샷 2024-08-01 오전 9 18 39" src="https://github.com/user-attachments/assets/a4bf023a-7bd7-4b84-b78c-da62b116fbbc">
  <img width="1440" alt="스크린샷 2024-08-01 오전 9 20 29" src="https://github.com/user-attachments/assets/60273f67-d803-438c-aa2e-7deac92962c1">
  <img width="1421" alt="스크린샷 2024-08-01 오전 9 10 48" src="https://github.com/user-attachments/assets/e5bc85b5-7dea-47d2-ab5e-efcf919a616e">
</details>
<br/>
<details>
  <summary><h3>게시글 작성 페이지</h3></summary>
  <p>게시글 작성은 물론, 글의 색상을 설정할 수 있고, 사진 업로드와 파일 첨부가 가능합니다!</p>
  <img width="1440" alt="스크린샷 2024-08-01 오전 9 23 57" src="https://github.com/user-attachments/assets/5803b5b4-39f3-4bf1-b5e3-fcc5907d3552">
</details>

<br/>
<h1>패키지 구조</h1>
<details>
<summary>패키지 구조 보기</summary>
📦ERD<br/>
 ┗ ⚫️t5_web.erd<br/>
📦src<br/>
 ┣ 📂main<br/>
 ┃ ┣ 📂java<br/>
 ┃ ┃ ┗ 📂com<br/>
 ┃ ┃ ┃ ┗ 📂lec<br/>
 ┃ ┃ ┃ ┃ ┗ 📂spring<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂config<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂oauth<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂provider<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵GoogleUserInfo<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵NaverUserInfo<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🟢OAuth2UserInfo<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵PrincipalOauth2UserService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CustomAccessDeniedHanlder<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CustomLoginFailureHandler<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CustomLoginSuccessHandler<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CustomLogoutSuccessHandler<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵MvcConfiguration<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵PrincipalDetails<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵PrincipalDetailService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵SecurityConfig<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵AttachmentController<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵BoardController<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CommentController<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵HomeController<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵OAuth2Controller<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵UserController<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂domain<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂oauth<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵KakaoOAuthToken<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵KakaoProfile<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵Attachment<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵Authority<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵Comment<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵Post<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵PostValidator<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵QryCommentList<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵QryResult<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵User<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵UserValidator<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂repository<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢AttachmentRepository<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢AuthorityRepository<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢CommentRepository<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢PostRepository<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🟢UserRepository<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢AttachmentService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵AttachmentServiceImpl<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢BoardService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵BoardServiceImpl<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢CommentService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🔵CommentServiceImpl<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 🟢UserService<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵UserServiceImpl<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂util<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵U<br/>
 ┃ ┗ 📂resources<br/>
 ┃ ┃ ┣ 📂mapper<br/>
 ┃ ┃ ┃ ┣ 🔴AttachmentRepository.xml<br/>
 ┃ ┃ ┃ ┣ 🔴AuthorityRepository.xml<br/>
 ┃ ┃ ┃ ┣ 🔴CommentRepository.xml<br/>
 ┃ ┃ ┃ ┣ 🔴PostRepository.xml<br/>
 ┃ ┃ ┃ ┣ 🔴UserRepository.xml<br/>
 ┃ ┃ ┣ 📂static<br/>
 ┃ ┃ ┃ ┣ 📂css<br/>
 ┃ ┃ ┃ ┃ ┗ 🩷common.css<br/>
 ┃ ┃ ┃ ┣ 📂image<br/>
 ┃ ┃ ┃ ┃ ┣ 📜google_login_button.png<br/>
 ┃ ┃ ┃ ┃ ┣ 📜kakao_login_button.png<br/>
 ┃ ┃ ┃ ┃ ┗ 📜naver_login_button.png<br/>
 ┃ ┃ ┃ ┗ 📂js<br/>
 ┃ ┃ ┃ ┃ ┣ 🟠detail.js<br/>
 ┃ ┃ ┃ ┃ ┣ 🟠list.js<br/>
 ┃ ┃ ┃ ┃ ┣ 🟠update.js<br/>
 ┃ ┃ ┃ ┃ ┗ 🟠write.js<br/>
 ┃ ┃ ┣ 📂templates<br/>
 ┃ ┃ ┃ ┗ 📂views<br/>
 ┃ ┃ ┃ ┃ ┣ 📂board<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚comment.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚deleteOk.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚detail.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚list.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚pagination.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚update.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚updateOk.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚write.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚writeOk.html<br/>
 ┃ ┃ ┃ ┃ ┣ 📂common<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚header.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚rejectAuth.html<br/>
 ┃ ┃ ┃ ┃ ┣ 📂user<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚login.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚register.html<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 💚registerOk.html<br/>
 ┃ ┃ ┣ 🌿application.yml<br/>
 ┃ ┃ ┣ 🌿application-dev.yml<br/>
 ┃ ┃ ┗ 🌿application-prod.yml<br/>
 ┗ 📂test<br/>
 ┃ ┗ 📂java<br/>
 ┃ ┃ ┗ 📂com<br/>
 ┃ ┃ ┃ ┗ 📂lec<br/>
 ┃ ┃ ┃ ┃ ┗ 📂spring<br/>
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller<br/>
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 🔵KBoardApplicationTests<br/>
📦upload<br/>
</details>

<br/>
<h1>DB 설계</h1>
<img width="1080" alt="스크린샷 2024-08-01 오후 12 48 48" src="https://github.com/user-attachments/assets/1cce25be-36c4-40ae-9de2-a9d29527a980">

<h3>1. 테이블 설명</h3>
<p>attachment</p>
<ul>
  <li>id (INT, PK, AI): 첨부 파일의 고유 ID</li>
  <li>post_id (INT, FK): 게시물 ID, t5_post 테이블과의 외래 키 관계</li>
  <li>sourcename (VARCHAR(100)): 원본 파일 이름</li>
  <li>filename (VARCHAR(100)): 서버에 저장된 파일 이름</li>
</ul>

<p>authority</p>
<ul>
  <li>id (INT, PK, AI): 권한의 고유 ID</li>
  <li>name (VARCHAR(40), UNIQUE): 권한 이름</li>
</ul>

<p>comment</p>
<ul>
  <li>id (INT, PK, AI): 댓글의 고유 ID</li>
  <li>user_id (INT, FK): 댓글 작성자 ID, t5_user 테이블과의 외래 키 관계</li>
  <li>post_id (INT, FK): 댓글이 달린 게시물의 ID, t5_post 테이블과의 외래 키 관계</li>
  <li>content (TEXT): 댓글 내용</li>
  <li>regdate (DATETIME, DEFAULT NOW()): 댓글 작성 날짜 및 시간</li>
</ul>

<p>post</p>
<ul>
  <li>id (INT, PK, AI): 게시물의 고유 ID</li>
  <li>user_id (INT, FK): 작성자 ID, t5_user 테이블과의 외래 키 관계</li>
  <li>subject (VARCHAR(200)): 게시물 제목</li>
  <li>content (LONGTEXT): 게시물 내용</li>
  <li>viewcnt (INT, DEFAULT 0): 조회수</li>
  <li>regdate (DATETIME, DEFAULT NOW()): 게시물 작성 날짜 및 시간</li>
</ul>

<p>user</p>
<ul>
  <li>id (INT, PK, AI): 사용자의 고유 ID</li>
  <li>username (VARCHAR(100), UNIQUE): 사용자 이름 (로그인 ID)</li>
  <li>password (VARCHAR(100)): 사용자 비밀번호 (일반 로그인용)</li>
  <li>name (VARCHAR(80)): 사용자 실명</li>
  <li>email (VARCHAR(80), NULL): 사용자 이메일</li>
  <li>regdate (DATETIME, DEFAULT NOW()): 회원가입 날짜 및 시간</li>
  <li>provider (VARCHAR(40)): OAuth2 인증 제공자</li>
  <li>providerId (VARCHAR(200)): OAuth2 제공자가 제공한 고유 사용자 ID</li>
</ul>

<p>user_authorities</p>
<ul>
  <li>user_id (INT, FK, PK): 사용자 ID, t5_user 테이블과의 외래 키 관계</li>
  <li>authority_id (INT, FK, PK): 권한 ID, t5_authority 테이블과의 외래 키 관계</li>
</ul>

<h3>2. 테이블 간의 관계</h3>
t5_user 와 t5_post: user_id가 외래 키로 설정되어 있으며, 한 사용자가 여러 게시물을 작성할 수 있는 일대다(1
) 관계입니다.<br/>
t5_post 와 t5_comment: post_id가 외래 키로 설정되어 있으며, 한 게시물에 여러 댓글이 달릴 수 있는 일대다(1
) 관계입니다.<br/>
t5_user 와 t5_comment: user_id가 외래 키로 설정되어 있으며, 한 사용자가 여러 댓글을 작성할 수 있는 일대다(1
) 관계입니다.<br/>
t5_post 와 t5_attachment: post_id가 외래 키로 설정되어 있으며, 한 게시물에 여러 첨부 파일이 있을 수 있는 일대다(1
) 관계입니다.<br/>
t5_user 와 t5_user_authorities: user_id가 외래 키로 설정되어 있으며, 한 사용자가 여러 권한을 가질 수 있는 다대다(N
) 관계입니다.<br/> t5_user_authorities 테이블이 이를 위한 조인 테이블 역할을 합니다.<br/>
t5_authority 와 t5_user_authorities: authority_id가 외래 키로 설정되어 있으며, 한 권한을 여러 사용자가 가질 수 있는 다대다(N
) 관계입니다.<br/><br/><br/>

<h1>개발 내용계</h1>

<ul>
  <li>게시판 프로젝트 명세서 정리</li>
  <li>게시판 CRUD 구현</li>
  <li>게시판 작성자만 삭제 수정 가능하게 하기</li>
  <li>게시판 조회수 기능 추가</li>
  <li>게시판 페이징 처리 구현</li>
  <li>Security 회원가입 및 로그인 구현</li>
  <li>회원가입 Validation 유효성 검사</li>
  <li>회원가입 Validation 커스터마이징 중복 검사</li>
  <li>Security 로그인 실패시 메시지 출력하기</li>
  <li>OAuth 2.0 구글 로그인 구현</li>
  <li>OAuth 2.0 네이버 로그인 구현</li>
  <li>xml 매핑으로 글 작성자만 수정, 삭제 가능하게 하기</li>
  <li>게시판 댓글 작성 및 조회 구현</li>
  <li>게시판 댓글 수정 및 삭제 구현</li>
  <li>게시판 댓글 작성자만 수정, 삭제 가능하게 하기</li>
</ul>
