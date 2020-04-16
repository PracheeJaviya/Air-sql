create or REPLACE function usnmchk(usernm varchar) returns integer AS
$$
declare
index cursor for select username from userdetails;
flag integer := 0;
cnt integer;
usnm varchar;
BEGIN
  select count(username) from userdetails into cnt;
  open index;
    fetch index into  usnm;
    -- select username into usnm from userdetails where i=index;
    if usernm like usnm  THEN
      flag := 1;
    end if;
  return flag;
end
$$language plpgsql;
