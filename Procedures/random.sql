-- generates random fare
create function fare() returns void as
$$
declare
total integer;
price integer;
begin
 select count(freq) into total from flightdetails;
 for i in 1..total loop
    -- price[i] = select floor(random() * 7000) + 5000::int;
    update flightdetails set fare=(select floor(random() * 7000) + 5000::int) where index=i;
 end loop;
end;
$$language plpgsql;
