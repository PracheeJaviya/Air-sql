create or replace function index_trigger() returns trigger as
$$
begin
IF old.username = new.username THEN
     update userdetails set index=index-1;
end if;
RETURN null;
end;
$$language plpgsql;

create trigger index_trigger after insert on userdetails
for each row execute function index_trigger();
