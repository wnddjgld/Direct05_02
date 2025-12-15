erDiagram
    USER ||--o{ FAVORITE : "has"
    USER ||--o{ SEARCH_HISTORY : "has"
    
    USER {
        BIGINT id PK "사용자 ID"
        VARCHAR username UK "사용자명 (3-50자)"
        VARCHAR email UK "이메일"
        VARCHAR password "암호화된 비밀번호"
        TIMESTAMP created_at "생성일시"
        TIMESTAMP updated_at "수정일시"
    }
    
    FAVORITE {
        BIGINT id PK "즐겨찾기 ID"
        BIGINT user_id FK "사용자 ID"
        VARCHAR character_name "캐릭터명"
        VARCHAR ocid "캐릭터 OCID"
        VARCHAR world_name "월드명"
        VARCHAR character_class "직업명"
        INT character_level "레벨"
        VARCHAR character_image "캐릭터 이미지 URL"
        BIGINT combat_power "전투력"
        INT union_level "유니온 레벨"
        INT popularity "인기도"
        VARCHAR guild_name "길드명"
        TIMESTAMP created_at "생성일시"
    }
    
    SEARCH_HISTORY {
        BIGINT id PK "검색 기록 ID"
        BIGINT user_id FK "사용자 ID"
        VARCHAR character_name "캐릭터명"
        VARCHAR ocid "캐릭터 OCID"
        VARCHAR world_name "월드명"
        VARCHAR character_class "직업명"
        INT character_level "레벨"
        TIMESTAMP searched_at "검색일시"
    }
    
    API_CALL_LOG {
        BIGINT id PK "API 호출 로그 ID"
        VARCHAR endpoint "API 엔드포인트"
        DATE call_date "호출 날짜"
        INT call_count "호출 횟수"
        TIMESTAMP created_at "생성일시"
        TIMESTAMP updated_at "수정일시"
    }
