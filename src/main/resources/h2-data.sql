insert into CATEGORY(CREATED_AT, LAST_MODIFIED_AT, LINK, NAME)
    values ( now(), now(), '/best', '👍침하하' ),
           ( now(), now(), '/new', '전체글' ),
           ( now(), now(), '/new/chim', '침착맨 나라' ),
           ( now(), now(), '/humor_try/likes/zilioner', '짤 나라' ),
           ( now(), now(), '/new/free', '일상 나라' ),
           ( now(), now(), '/new/district', '자치 구역' ),
           ( now(), now(), '/check', '소원의 돌' ),
           ( now(), now(), '/recommend_goods', '구쭈 나라' ),
           ( now(), now(), '/2022awards', '⭐️이벤트 나라' ),
           ( now(), now(), '/report', '신고/건의');


insert into BOARD(CREATED_AT, LAST_MODIFIED_AT, NAME)
    values ( now(), now(), '👍침하하'),
           ( now(), now(), '🏛짤렉산드리아 도서관'),

           ( now(), now(), '👀방송일정 및 공지'),
           ( now(), now(), '😊침착맨'),
           ( now(), now(), '🎃침착맨 짤'),
           ( now(), now(), '🎨침착맨 팬아트'),
           ( now(), now(), '📣방송 요청'),
           ( now(), now(), '🍳침투부 찾아요'),
           ( now(), now(), '🎬쇼츠 요정'),
           ( now(), now(), '👓추천 침투부'),
           ( now(), now(), '🎪침착맨 갤러리'),

           ( now(), now(), '🌅짤 심사'),

           ( now(), now(), '🙏잡담'),
           ( now(), now(), '😄유머'),
           ( now(), now(), '🕹게임'),
           ( now(), now(), '💻추천'),
           ( now(), now(), '📖이야기&썰'),
           ( now(), now(), '⚔️삼국지'),
           ( now(), now(), '🐶반려동물'),
           ( now(), now(), '📋게시판 요청'),

           ( now(), now(), '미래전략식(김풍)'),
           ( now(), now(), '대인국(주펄)'),
           ( now(), now(), '구쭈왕국(박정민)'),
           ( now(), now(), '꺽다리는꺽꺽하고웃지(주우재)'),
           ( now(), now(), '진보맹국(단군)'),
           ( now(), now(), '감자밭(빠니보틀)'),
           ( now(), now(), '준빈나라(곽튜브)'),
           ( now(), now(), '궤도사령부(궤도)'),
           ( now(), now(), '차돌짬뽕 잠실점(철면수심)'),
           ( now(), now(), '이세계식당(승우아빠)'),
           ( now(), now(), '괘시판(심윤수)'),
           ( now(), now(), '닭익는마을(통닭천사)'),
           ( now(), now(), '나비치과 탕비실(매직박)'),
           ( now(), now(), '퍼즐세상(임세모)'),

           ( now(), now(), '👕구쭈'),
           ( now(), now(), '📸구쭈 후기'),

           ( now(), now(), '2022 침투부어워즈 투표장'),
           ( now(), now(), '⚽️카타르 월드컵');

insert into CATEGORY_BOARD(BOARD_ID, CATEGORY_ID)
values ( 1, 1 ),
       ( 2, 1 ),
       ( 3, 3 ),
       ( 4, 3 ),
       ( 5, 3 ),
       ( 6, 3 ),
       ( 7, 3 ),
       ( 8, 3 ),
       ( 9, 3 ),
       ( 10, 3 ),
       ( 11, 3 ),
       ( 2, 4 ),
       ( 12, 4 ),
       ( 13, 5 ),
       ( 14, 5 ),
       ( 15, 5 ),
       ( 16, 5 ),
       ( 17, 5 ),
       ( 18, 5 ),
       ( 19, 5 ),
       ( 20, 5 ),

       ( 21, 6 ),
       ( 22, 6 ),
       ( 23, 6 ),
       ( 24, 6 ),
       ( 25, 6 ),
       ( 26, 6 ),
       ( 27, 6 ),
       ( 28, 6 ),
       ( 29, 6 ),
       ( 30, 6 ),
       ( 31, 6 ),
       ( 32, 6 ),
       ( 33, 6 ),
       ( 34, 6 ),

       ( 35, 8 ),
       ( 36, 8 ),

       ( 37, 9 ),
       ( 38, 9 )

;



