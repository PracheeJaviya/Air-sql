-- generates random fare for different aircrafts
create function fare() returns trigger as
$$
declare
airname text;
aircur cursor for select aircraft from fare;
total integer;
begin
open cursor;

 select count(aircraft) into total from fare;
 for i in 1..total loop
 fetch aircur into airname;
 exit when not found;
    update fare set new.efare=(select floor(random() * 1000) + 5000::int);
    update fare set new.bfare=(select floor(random()*13000)+40000::int);
 end loop;
 return new;
end;
$$language plpgsql;
create trigger fare on fare before insert
on each row execute function fare();
