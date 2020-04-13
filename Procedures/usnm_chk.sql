create or REPLACE function usnmchk(usernm varchar) returns integer AS
$$
declare
flag integer := 0;
cnt integer;
usnm varchar;
BEGIN
  select count(username) from userdetails into cnt;
  for i in 1..cnt loop
    select username into usnm from userdetails where i=index;
    if usernm like usnm  THEN
      flag := 1;
    end if;
    end loop;
  return flag;
end
$$language plpgsql;
