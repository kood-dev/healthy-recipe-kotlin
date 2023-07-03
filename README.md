# healthy-recipe-kotlin
- 육아를 하며 **"오늘 반찬 뭐 해먹이지?" 하는 고민을 줄이고자 탄생** 하였습니다.

## 아이디어 & 기획
[노션페이지](https://gwkoo.notion.site/4a263e13e09c4b21837817c156d25dff?pvs=4)

## 아키텍쳐
- 헥사고날 아키텍처를 적용하여 코드의 결합도를 낮추고, 테스트와 유지보수를 쉽게 할 수 있도록 처리 합니다.
- 주요 패키지는 구조는 아래와 같습니다.
```bash
├── domain
│   ├── model
│   ├── repository
│   └── service
├── application
│   └── service
└── adapter
    ├── in
    │   └── web
    └── out
        └── persistence
```

## 모델링
- plantuml을 사용하여 설계합니다.
- {class-path}/erd/modeling.puml


## 참고
### api
[공공 OPEN API](http://www.foodsafetykorea.go.kr/api/openApiInfo.do?menu_grp=MENU_GRP31&menu_no=661&show_cnt=10&start_idx=1&svc_no=COOKRCP01])
[스푼 API](https://spoonacular.com/food-api)