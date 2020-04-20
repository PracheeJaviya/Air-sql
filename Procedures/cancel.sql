create or replace function cancel(travel_date varchar) returns integer as
$$
declare
current_month integer;
current_day integer;
mon integer;
travel_day integer;
travel_month varchar;
flag integer=1;
mnth integer;
day_diff integer;
jan varchar := 'Jan';
feb varchar := 'Feb';
mar varchar := 'Mar';
apr varchar := 'Apr';
may varchar := 'May';
jun varchar := 'Jan';
jul varchar := 'Jul';
aug varchar := 'Aug';
sep varchar := 'Sep';
oct varchar := 'Oct';
nov varchar := 'Nov';
dece varchar := 'Dec';
begin
      select extract (month from CURRENT_DATE) into current_month;
      select extract (day from CURRENT_DATE) into current_day;
      SELECT substring(travel_date from 5 for 3) into travel_month;
      select substring(travel_date from 8 for 3) into travel_day;
      if travel_month like jan then mon = 1;end if;
      if travel_month like feb then mon = 2;end if;
      if travel_month like mar then mon = 3;end if;
      if travel_month like apr then mon = 4;end if;
      if travel_month like may then mon = 5;end if;
      if travel_month like jun then mon = 6;end if;
      if travel_month like jul then mon = 7;end if;
      if travel_month like aug then mon = 8;end if;
      if travel_month like sep then mon = 9;end if;
      if travel_month like oct then mon = 10;end if;
      if travel_month like nov then mon = 11;end if;
      if travel_month like dece then mon = 12;end if;

      mnth = -current_month+mon;
        raise notice 'current month = %, mon = %',current_month,mon;
        raise notice '%',mnth;
    if mnth < 0 then
    flag=0;
    end if;
    day_diff = current_day - travel_day;
    if current_month-mon = 0 then
        if day_diff > 0 then
        flag = 0;
        end if;
    end if;
    raise notice '%',flag;
    return flag;
end;
$$language plpgsql;
