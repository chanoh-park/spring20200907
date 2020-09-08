drop table t_post;
drop table t_bulletin_board;

-- 게시판 : 자유게시판, 공지사항, FAQ ...
create table t_bulletin_board (
	id				number(10),
	name			varchar2(50),
	primary key(id)
);

insert into t_bulletin_board (id, name) values (-1, '자유게시판');

-- 게시글
create table t_post (
	id				number(10),
	parent_id		number(10),
	bb_id			number(10),
	writer_id		number(10),
	content			varchar2(2000),
	post_type		varchar2(50),		-- POST, REPLY
	title			varchar2(500),
	primary key(id),
	CONSTRAINT fk_post_bb FOREIGN KEY (bb_id) REFERENCES t_bulletin_board(id),
	CONSTRAINT fk_post_party FOREIGN KEY (writer_id) REFERENCES t_party(id),
	CONSTRAINT fk_post_post FOREIGN KEY (parent_id) REFERENCES t_post(id)
);

-- 게시글 테스트 데이터
insert into t_post (id, bb_id, writer_id, content, post_type, title) values (-100, -1, -10000000, '안녕', 'POST', '하세요');
insert into t_post (id, bb_id, writer_id, content, post_type, title) values (-101, -1, -20000000, '고객님', 'POST', '많이 사세요');

-- 댓글 테스트 데이터
insert into t_post (id, parent_id, writer_id, content) values (-200, -100, -10000001, 'U 2');
insert into t_post (id, parent_id, writer_id, content) values (-300, -200, -10000000, '답변 주셔서 감사합니다.');

-- 원글에 달려있는 모든 댓글을 한번에 조회 (Composite Pattern에 따른 개발 방법)
SELECT LEVEL, id, title, content
  FROM t_post
 START WITH id = -100
CONNECT BY PRIOR  id = parent_id;