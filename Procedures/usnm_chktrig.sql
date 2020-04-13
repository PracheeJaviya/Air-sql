-- trigger used for validating
CREATE TRIGGER usnm_chktrig
BEFORE INSERT  OF username  -- fire only when relevant
ON userdetails
FOR EACH ROW EXECUTE PROCEDURE usnm_chk();
