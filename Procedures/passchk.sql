create or replace function passchk(pass varchar,conpass varchar)returns integer as
$$
begin
  if pass like conpass then
    return 1;
    else
    return 0;
  end if;
end

$$language plpgsql;
-- if 1 then execute insert query
