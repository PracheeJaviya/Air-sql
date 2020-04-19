create or REPLACE function citychk(get_city varchar) returns integer AS
$$
declare
city_index cursor for select city from place;
flag integer := 0;
cnt integer;
cityyyy varchar;
BEGIN
  -- select count(city) from place into cnt;
  open city_index;
  loop
    fetch city_index into  cityyyy;
    exit when not found;
    if get_city like cityyyy  THEN
      flag := 1;
    end if;
  end loop;
  return flag;
  close city_index;
end
$$language plpgsql;
