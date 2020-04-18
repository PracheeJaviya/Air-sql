create or REPLACE function citychk(get_state varchar) returns integer AS
$$
declare
state_index cursor for select city from place;
flag integer := 0;
cnt integer;
stateee varchar;
BEGIN
  select count(city) from place into cnt;
  open state_index;
    fetch state_index into  stateee;
    if get_state like stateee  THEN
      flag := 1;
    end if;
  return flag;
end
$$language plpgsql;
