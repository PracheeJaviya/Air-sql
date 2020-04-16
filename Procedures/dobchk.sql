create or replace function dobchk(birth text) returns integer as
$$
declare
age integer;
today integer;
bday integer;
flag integer=0;
begin
      select extract (year from CURRENT_DATE) into today;
      SELECT substring(birth from 25 for 28) into bday;
    age=today-bday;
    if age > 18 then
    flag=1;
    end if;
return flag;
end;
$$language plpgsql;
