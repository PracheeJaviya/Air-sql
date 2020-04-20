create or replace function cancel(travel_date varchar) returns integer as
$$
declare
mon_travel integer;
day_travel integer;
mon integer;
chk_day integer;
chk_month text;
flag integer=1;
begin
      select extract (month from CURRENT_DATE) into mon_travel;
      select extract (day from CURRENT_DATE) into day_travel;
      SELECT substring(travel_date from 4 for 6) into chk_month;
      select substring(travel_date from 8 for 9) into chk_day;
      if chk_month 'Jan' then mon = 1;
      elsif chk_month 'Feb' then mon = 2;
      elsif chk_month 'Mar' then mon = 3;
      elsif chk_month 'Apr' then mon = 4;
      elsif chk_month 'May' then mon = 5;
      elsif chk_month 'Jun' then mon = 6;

      elsif chk_month 'Jul' then mon = 7;
      elsif chk_month 'Aug' then mon = 8;
      elsif chk_month 'Sep' then mon = 9;
      elsif chk_month 'Oct' then mon = 10;
      elsif chk_month 'Nov' then mon = 11;
      else then mon = 12;

    if mon_travel-mon < 0 then
    flag=0;

    else if mon_travel-mon =0 then
        if day_travel - chk_day < 0 then
        flag = 0;
        end if;
    end if;

return flag;
end;
$$language plpgsql;
