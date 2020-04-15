-- generates random fare
create function fare() returns void as
$$
declare
airname text;
aircur cursor for select aircraft from fare;
total integer;
-- price integer;
begin
open cursor;

 select count(aircraft) into total from fare;
 for i in 1..total loop
 fetch aircur into airname;
    -- price[i] = select floor(random() * 7000) + 5000::int;
    update fare set fare=(select floor(random() * 1000) + 5000::int);
    update fare set bfare=(select floor(random()*13000)+40000::int);
exit when not found;
 end loop;
end;
$$language plpgsql;