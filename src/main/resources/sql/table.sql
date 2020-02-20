---------------------------------------------------------------------------------------------------------------------------------------
-------- ------------------------------------------------------ SQLite ------------------------------------------------------- --------
---------------------------------------------------------------------------------------------------------------------------------------
PRAGMA foreign_keys = ON;


------------------------------------------------------------------------
-------------------------------- [画报] --------------------------------
------------------------------------------------------------------------
--- ----------------
--- 画报信息(静态表)
--- ----------------
drop table if exists pictorial_info;
create table pictorial_info
(
    -- 主键
    id                    integer      not null primary key autoincrement,
    -- 画报名称
    pictorial_name        varchar(100) not null,
    -- 画报作者
    pictorial_author      varchar(100) not null,
    -- 内容敏感画报
    sensitive             integer(1)            default 0,
    -- 画报标题
    pictorial_title       varchar(100) not null,
    -- 画报封面图片
    pictorial_front_cover varchar(255) not null default '',
    -- 更新用户
    update_user           varchar(100) not null default '',
    -- 更新时间
    update_date           date         not null default (datetime('now', 'localtime')),
    -- 上传用户
    create_user           varchar(100) not null default '',
    -- 上传时间
    create_date           date         not null default (datetime('now', 'localtime'))
);

--- -------------------
--- 画报易变信息(易变表)
--- -------------------
drop table if exists pictorial_variable_info;
create table pictorial_variable_info
(
    -- 主键
    id                     integer      not null primary key autoincrement,
    -- 画报信息id
    pictorial_info_id      integer      not null,
    -- 画报用户评分
    pictorial_score        varchar(100) not null,
    -- 画报用户评论数
    pictorial_comment_num  integer      not null,
    -- 画报用户点赞数
    pictorial_like_num     integer      not null,
    -- 画报用户收藏数
    pictorial_favorite_num integer      not null

);

--- -------------------
--- 画报书信息
--- -------------------
drop table if exists pictorial_book;
create table pictorial_book
(
    -- 主键
    id                integer not null primary key autoincrement,
    -- 画报信息id
    pictorial_info_id integer not null,
    -- 画报书文件大小(b)
    book_files_size   integer not null,
    -- 画报书显示顺序(越小显示越靠前)
    book_sequence     integer not null
);

--- -------------------
--- 画片信息
--- -------------------
drop table if exists pictorial_page_file;
create table pictorial_page_file
(
    -- 主键
    id                integer      not null primary key autoincrement,
    -- 画报书id
    pictorial_book_id integer      not null,
    -- 画片文件(路径)
    page_file         varchar(255) not null,
    -- 画片显示顺序(越小显示越靠前)
    page_sequence     integer      not null
);


--- ----------------
--- 画报信息-分类表(中间表)
--- ----------------
drop table if exists pictorial_sort;
create table pictorial_sort
(
    -- 主键
    id        integer     not null primary key autoincrement,
    -- 分类名称
    sort_name varchar(32) not null
);

--- ----------------
--- 画报信息-分类表(中间表)
--- ----------------
drop table if exists pictorial_info_sort;
create table pictorial_info_sort
(
    -- 主键
    id                integer not null primary key autoincrement,
    -- 画报信息id
    pictorial_info_id integer not null,
    -- 画报标签id
    pictorial_sort_id integer not null

);



--- ----------------
--- 画报标签(静态表)
--- ----------------
drop table if exists pictorial_tag;
create table pictorial_tag
(
    -- 主键
    id       integer     not null primary key autoincrement,
    -- 标签名称
    tag_name varchar(32) not null
);

--- ----------------------
--- 画报信息-标签表(中间表)
--- ----------------------
drop table if exists pictorial_info_tag;
create table pictorial_info_tag
(
    -- 主键
    id                integer not null primary key autoincrement,
    -- 画报信息id
    pictorial_info_id integer not null,
    -- 画报标签id
    pictorial_tag_id  integer not null

);



------------------------------------------------------------------------
-------------------------------- [用户] --------------------------------
------------------------------------------------------------------------


------------------------------------------------------------------------
-------------------------------- [评论] --------------------------------
------------------------------------------------------------------------





