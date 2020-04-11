CREATE TRIGGER usnm_chktrig
BEFORE INSERT  OF col1, col2, col3, col4  -- fire only when relevant
ON userdetails
FOR EACH ROW EXECUTE PROCEDURE usnm_chk();
