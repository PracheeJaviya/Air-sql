create or replace function mobchk(num text) returns integer as
$$
begin
    if length(num) = 10 then
       return 1;
    else return 0;
    end if;
end;
$$language plpgsql;
