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

<h1>개발 내용</h1>

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

<h1>후기</h1>

개발 과정에서의 주요 성과
<ul>
  <li>MVC 패턴의 적용: 프로젝트의 주요 목표 중 하나는 MVC (모델-뷰-컨트롤러) 패턴을 활용한 애플리케이션 개발이었습니다. 이 패턴을 통해 코드의 구조가 깔끔하게 유지되었고, 각 기능이 명확하게 분리되었습니다. 이를 통해 유지보수성과 확장성이 높은 애플리케이션을 개발할 수 있었습니다.</li>
  <li>CRUD 기능 구현: 게시판의 기본적인 CRUD(Create, Read, Update, Delete) 기능을 구현하면서 데이터베이스와의 연동 및 사용자 인터페이스 디자인의 중요성을 실감할 수 있었습니다. 특히, 게시물의 작성자만 수정 및 삭제가 가능하도록 권한을 설정하는 과정에서 Security의 중요성을 느꼈습니다.</li>
  <li>회원 관리 및 보안: Spring Security를 활용하여 회원가입과 로그인 기능을 구현하였고, OAuth 2.0을 통해 구글, 네이버, 카카오 로그인을 추가했습니다. 이 과정에서 다양한 인증 방식에 대한 이해를 높일 수 있었고, 사용자 정보를 안전하게 관리하는 방법을 배울 수 있었습니다.</li>
  <li>댓글 기능 및 권한 관리: 댓글 기능을 통해 사용자 상호작용을 구현하였으며, 댓글 작성자만 자신의 댓글을 수정 및 삭제할 수 있도록 권한을 관리했습니다. 이는 사용자 경험을 향상시키는 데 중요한 요소였습니다.</li>
  <li>페이징 및 조회수 기능: 게시판의 페이징 처리 및 조회수 기능을 추가함으로써 대량의 데이터 처리에 대한 효율성을 높였으며, 사용자에게 보다 나은 경험을 제공할 수 있었습니다.</li>
  <li>프론트엔드와의 통합: Thymeleaf와 Bootstrap을 활용하여 사용자 친화적인 인터페이스를 구현하였고, Summernote를 통해 편리한 게시글 작성 기능을 제공했습니다. 이로 인해 사용자는 보다 직관적으로 게시글을 작성하고 편집할 수 있었습니다.</li>
</ul>

느낀 점
<ul>
  <li>구현의 복잡성과 보람: 프로젝트를 진행하면서 MVC 패턴과 Spring Framework의 깊이 있는 사용이 복잡하지만 매우 유익하다는 것을 느꼈습니다. 처음에는 어려움이 있었지만, 문제를 해결하고 기능을 구현하면서 큰 성취감을 느꼈습니다. 코드가 실제로 동작하고 사용자에게 유용한 기능을 제공할 때의 보람은 매우 컸습니다.</li>
  <li>보안의 중요성: 사용자 데이터를 보호하는 것이 얼마나 중요한지를 실감했습니다. Spring Security와 OAuth 2.0을 통해 인증 및 권한 관리 기능을 구현하면서 보안의 복잡성과 그 중요성을 깊게 이해할 수 있었습니다. 보안 취약점이 시스템에 미칠 수 있는 영향을 깨달으면서, 철저한 보안 설계와 검토의 필요성을 느꼈습니다.</li>
  <li>기술적 도전과 성장: 다양한 기술 스택을 접하고 이를 프로젝트에 적용하는 과정에서 많은 도전과 성장을 경험했습니다. Java, Spring Boot, MyBatis, OAuth 2.0 등 새로운 기술을 배우고 이를 실전에서 활용하면서 기술적 역량이 크게 향상되었다는 느낌을 받았습니다.</li>
  <li>지속적인 학습의 필요성: 프로젝트를 진행하면서 기술의 발전 속도가 빠르고, 새로운 기술과 도구가 계속 등장한다는 것을 실감했습니다. 따라서, 지속적인 학습과 자기 개발이 중요하다는 것을 다시 한번 느꼈습니다. 앞으로도 새로운 기술에 대한 학습을 게을리하지 않고, 최신 트렌드를 반영하여 발전해 나가고자 합니다.</li>
</ul>
<br/>
이 프로젝트를 통해 얻은 경험과 교훈은 앞으로의 개발 활동에 큰 밑거름이 될 것입니다. 프로젝트를 마무리하며, 이러한 배움과 느낀 점을 바탕으로 더 나은 개발자가 되기 위해 계속 노력하겠습니다.
