create or replace function agechk(birth text) returns integer as
$$
declare
age integer;
today integer;
bday integer;
flag integer=1;
begin
      select extract (year from CURRENT_DATE) into today;
      SELECT substring(birth from 25 for 28) into bday;
    age=today-bday;
    if age > 80 then
    flag=0;
    end if;
return flag;
end;
$$language plpgsql;
