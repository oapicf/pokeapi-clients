--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatAffectingNature' definition.
--


--
-- SELECT template for table `PokeathlonStatAffectingNature`
--
SELECT `max_change`, `nature` FROM `PokeathlonStatAffectingNature` WHERE 1;

--
-- INSERT template for table `PokeathlonStatAffectingNature`
--
INSERT INTO `PokeathlonStatAffectingNature`(`max_change`, `nature`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatAffectingNature`
--
UPDATE `PokeathlonStatAffectingNature` SET `max_change` = ?, `nature` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatAffectingNature`
--
DELETE FROM `PokeathlonStatAffectingNature` WHERE 0;

