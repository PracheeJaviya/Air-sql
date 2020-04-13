create or replace function mailchk(mail text)returns integer as
$$
begin
  if mail like '%@gmail.com' then
    return 1;
    else
     return 0;
  end if;
end

$$language plpgsql;
-- if 1 then execute insert query
