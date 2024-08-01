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
  <li><a>API 설계</a></li>
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
