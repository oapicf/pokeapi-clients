--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatAffectingNatures' definition.
--


--
-- SELECT template for table `PokeathlonStatAffectingNatures`
--
SELECT `increase`, `decrease` FROM `PokeathlonStatAffectingNatures` WHERE 1;

--
-- INSERT template for table `PokeathlonStatAffectingNatures`
--
INSERT INTO `PokeathlonStatAffectingNatures`(`increase`, `decrease`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatAffectingNatures`
--
UPDATE `PokeathlonStatAffectingNatures` SET `increase` = ?, `decrease` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatAffectingNatures`
--
DELETE FROM `PokeathlonStatAffectingNatures` WHERE 0;

