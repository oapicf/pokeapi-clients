--
-- PokéAPI.
-- Prepared SQL queries for 'NaturePokeathlonStat' definition.
--


--
-- SELECT template for table `NaturePokeathlonStat`
--
SELECT `max_change`, `pokeathlon_stat` FROM `NaturePokeathlonStat` WHERE 1;

--
-- INSERT template for table `NaturePokeathlonStat`
--
INSERT INTO `NaturePokeathlonStat`(`max_change`, `pokeathlon_stat`) VALUES (?, ?);

--
-- UPDATE template for table `NaturePokeathlonStat`
--
UPDATE `NaturePokeathlonStat` SET `max_change` = ?, `pokeathlon_stat` = ? WHERE 1;

--
-- DELETE template for table `NaturePokeathlonStat`
--
DELETE FROM `NaturePokeathlonStat` WHERE 0;

