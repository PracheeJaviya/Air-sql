create or replace function cancel(travel_date text) returns integer as
$$
declare
current_month integer;
current_day integer;
mon integer;
travel_day integer;
travel_month text;
flag integer :=1;
mnth integer;
day_diff integer;
begin
      select extract(month from CURRENT_DATE)::integer into current_month;
      select extract (day from CURRENT_DATE)::integer into current_day;
      SELECT substring(travel_date, 5 ,3) into travel_month;
      select substring(travel_date, 8, 3)::integer into travel_day;
      if travel_month like 'Jan' then mon = 1;end if;
      if travel_month like 'Feb' then mon = 2;end if;
      if travel_month like 'Mar' then mon = 3;end if;
      if travel_month like 'Apr' then mon = 4;end if;
      if travel_month like 'May' then mon = 5;end if;
      if travel_month like 'Jun' then mon = 6;end if;
      if travel_month like 'Jul' then mon = 7;end if;
      if travel_month like 'Aug' then mon = 8;end if;
      if travel_month like 'Sep'then  mon = 9;end if;
      if travel_month like 'Oct' then mon = 10;end if;
      if travel_month like 'Nov' then mon = 11;end if;
      if travel_month like 'Dec' then mon = 12;end if;

      mnth = -current_month+mon;
    if mnth < 0 then
    flag = 0;
    end if;
    day_diff = current_day - travel_day;
    if mnth = 0 then
        if day_diff > 0 then
        flag = 0;
        end if;
    end if;
    raise notice '%',flag;
    return flag;
end;
$$language plpgsql;
