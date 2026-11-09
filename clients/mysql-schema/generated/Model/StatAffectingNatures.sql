--
-- PokéAPI.
-- Prepared SQL queries for 'StatAffectingNatures' definition.
--


--
-- SELECT template for table `StatAffectingNatures`
--
SELECT `increase`, `decrease` FROM `StatAffectingNatures` WHERE 1;

--
-- INSERT template for table `StatAffectingNatures`
--
INSERT INTO `StatAffectingNatures`(`increase`, `decrease`) VALUES (?, ?);

--
-- UPDATE template for table `StatAffectingNatures`
--
UPDATE `StatAffectingNatures` SET `increase` = ?, `decrease` = ? WHERE 1;

--
-- DELETE template for table `StatAffectingNatures`
--
DELETE FROM `StatAffectingNatures` WHERE 0;

