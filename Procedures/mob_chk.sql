create or replace function mobchk(num text) returns void as
$$
declare
begin
    if length(num) == 10 then
      -- execute insert query
    end if;
end;
$$language plpgsql;
