create or replace function dobchk(birth text) returns integer as
$$
declare
age integer;
today integer;
bday integer;
begin
      select extract (year from CURRENT_DATE) into today;
      SELECT substring(birth from 25 for 28) into bday;

    age=today-bday;
    raise notice '%' ,age;
    if age > 18 then
    return 1;
    else
      return 0;
    end if;
end;
$$language plpgsql;
