insert into folder (name) values ('Folder 1');
insert into folder (name) values ('Folder 2');
insert into folder (name) values ('Folder 3');
update folder set parent_id = null;
select * from folder;

alter table folder alter column updated set default null;