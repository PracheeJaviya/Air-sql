CREATE OR REPLACE FUNCTION usnm_chk()
  RETURNS trigger AS
  $$
BEGIN

IF EXISTS (SELECT username FROM userdetails
           WHERE (username)
           = (NEW.username)) THEN
   RETURN NULL;
END IF;
RETURN NEW;
END
$$LANGUAGE plpgsql;
