create or REPLACE function citychk(get_city varchar) returns integer AS
$$
declare
city_index cursor for select city from place;
flag integer := 0;
cnt integer;
cityyyy varchar;
BEGIN
  select count(city) from place into cnt;
  open city_index;
    fetch city_index into  cityyyy;
    -- EXIT when  NOT FOUND;
    if get_city like cityyyy  THEN
      flag := 1;
      -- raise notice 'got';
    end if;
  -- close city_index;
  return flag;
end
$$language plpgsql;
