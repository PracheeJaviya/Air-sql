create or replace function dobchk(birth text) returns integer as
$$
declare
age integer;
today integer;
bday integer;
begin
      select extract (year from CURRENT_DATE) into today;
      SELECT substring(birth from 1 for 4) into bday;
    --  select extract (year from '04-11-1999') into bday;
    --  select (to_number(birth,"yyyy")) into bday;
    age=today-bday;
    if age > 18 then return 1;
    else
      return 0;
    end if;
end;
$$language plpgsql;
