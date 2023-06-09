# RefreshHomeP

## 1. 프로젝트 개요

### 프로젝트 주제

- 10년 이상 방치된 기업 홍보용 사이트 리뉴얼 사이트 제작

### 선정 배경

1. **관리되지 않은 회사의 사이트는 고객에게 신뢰성을 주기 힘듦.**
    - 오래된 기업 사이트를 리뉴얼하며 사용자들에게 전문적이고 현대적인 이미지를 제공
    - 기업 브랜딩에 기여. 또한, 검색 엔진 최적화를 통해 더 많은 방문자를 유입되는 것을 목적으로 함.
2. **오직 PC, 데스크탑 환경만을 고려하여 제작된 사이트는 모바일 기기 사용자에게 불편한 사이트가 됨.**
    - 사용자 중심의 정보 제공과 반응형 웹을 통해 모바일 최적화를 하여 사용자 만족도를 높임

### 개발 및 수행 목표

우리의 주요 목표는 기존 웹사이트보다 더 나은 디자인을 구현하여 회사의 이미지에 적합하고 어울리는 리뉴얼된 반응형 웹사이트를 개발하는 것.

## 2. 팀 소개

### 조채윤

- 역할 : 백엔드
- 이메일 : Spring.codbs@gmail.com
- 깃허브 : [https://github.com/chieyoun](https://github.com/chieyoun)

### 이수빈

- 역할 : 디자인, 프론트
- 이메일 : dfox0505@naver.com
- 깃허브 : [https://github.com/subann](https://github.com/subann)

### 한채영

- 역할 : 디자인, 프론트
- 이메일 : gks4167@naver.com
- 깃허브 : [https://github.com/hanchaeyoung](https://github.com/hanchaeyoung)

## 3. 사용 기술

### 개발에 사용한 기술

html, css, javascript, Spring, mysql, emailjs

### 개발에 소요된 물품 및 준비물

웹서버

## 4. 프로젝트 진행 과정 (월별 진행상황)

3월 : 홈페이지 디자인

4월 : 웹 개발

5월 : 웹 개발

6월 : 웹 보완

7월 : 수정 및 보완

## 5. 프로젝트 상세 소개

### 레이아웃 세부 설명

- header : 회사 로고 및 목록
- main : 회사 소개 및 제품소개, 고객지원(공지사항, FAQ), 견적 문의
- footer : 회사 정보

### 데이터베이스 / 데이터플로우 / 시스템 구조

![db.png](RefreshHomeP%20bd6a0f7f783248b886ed2b7935103f71/db.png)

### 사용자 수행에 따른 세부 동작 과정

- **삼정테크**
    - header에 있는 회사소개, 제품소개, 고객지원, 견적문의를 누르면 해당하는 위치로 이동
    - 제품소개에 있는 제품들을 누르면 제품 상세페이지로 이동
    - 고객지원에 있는 공지사항을 누르면 공지사항 상세페이지로 이동
    - 고객지원에 있는 FAQ를 누르면 드롭다운으로 FAQ 내용이 보임
    - 견적문의에 정보를 입력하고 제출 버튼을 누르면 관리자에게 이메일로 전송됨

- **잉크테크**
    - 메인페이지
        - 메인페이지 header에서 home, 제품소개, 견적문의를 확인할 수 있고, 누르면 그 페이지로 이동.
        - More about us를 누르면 잉크테크가 개발한 제품을 볼 수 있도록 제품소개 페이지로 이동.
        - Our gallery에서 개발 제품과 기술연구소를 확인할 수 있음.
    - 제품소개페이지
        - 디지털 프린팅 시스템을 만나보세요 버튼을 누르면 잉크테크의 프린트 사업 페지를 확인할 수 있음.
        - 디지털 프린팅 시스템 이미지로 마우스 커서를 가져가면 이미지가 확대됨.
    - 견적문의페이지
        - 지도를 움직일 수 있습니다.
        - 이름과 이메일, 문의 할 내용을 입력시 관리자에게 내용을 전달합니다.

### 레이아웃 세부 설명

- header: 회사 로고 및 목록
- section: 회사의 간단한 소개와 제품 갤러리
- footer: 회사 정보

## 6. 프로젝트 추진 결과

### 수행 과정 및 결과 분석

### **개발 과정**

1. **3월**
    - 한채영: 선정한 회사의 자료 조사 및 유형 파악, 계획서 작성 및 스토리보드 작성
    - 이수빈: 홈페이지 디자인 초기 설계
    - 조채윤: db 설계, 구축, 공지사항 구현
2. **4월**
    - 한채영: 삼정테크 홈페이지 제작
    - 이수빈: 디자인 설계 및 메인 컬러 선정
    - 조채윤: 로그인, 로그아웃 기능 구현
3. **5월**
    - 한채영: 삼정테크 홈페이지 제작 및 백엔드 연결
    - 이수빈: 메인 페이지 코딩 시작
    - 조채윤: 기업 제품 관리를 위한 crud 구현
4. **6월**
    - 한채영: 삼정테크 메인 사진 선정 및 홈페이지 디자인 수정
    - 이수빈: 서브페이지 코딩 및 GitHub 업로드
    - 조채윤: 서버 환경 구축 및 업로드
5. **7월**
    - 한채영: 수정 및 보완 작업
    - 이수빈: 수정 및 보완 작업
    - 조채윤: 버그 및 오류 사항 수정, 보완

### 결과 분석

각 팀원이 설계한 디자인 아이디어와 선정한 컬러 팔레트를 충실히 반영하여 웹사이트를 개발하여 완성했고, 이 과정에서 기존 웹페이지보다 더 나은 디자인과 시각적인 효과를 구현하기 위해 노력했습니다. 우리 팀은 사용자 경험과 시각적인 매력을 고려하여 각 요소들의 배치와 디자인을 최적화하였습니다.

### 유지 보수 계획

- 성능 최적화: 웹사이트의 로딩 속도를 개선하기 위해 캐싱 기능을 도입하거나, 이미지 최적화 기술을 적용하여 페이지의 렌더링 속도를 향상 시킬 예정입니다.
- 보안 업그레이드: 웹사이트의 보안 취약점을 해결하기 위해 최신 보안 패치를 적용하고, SSL 인증서를 갱신하여 사용자 데이터의 보호를 강화할 예정입니다.
- 향상된 검색 엔진 최적화: 검색 엔진 최적화를 위해 최신 SEO 기법을 적용하고, 구조적인 데이터 마크업을 강화하여 검색 결과에서 더욱 높은 순위로 노출되도록 할 예정입니다.
