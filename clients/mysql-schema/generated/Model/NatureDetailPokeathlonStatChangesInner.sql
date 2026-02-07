--
-- PokéAPI.
-- Prepared SQL queries for 'NatureDetail_pokeathlon_stat_changes_inner' definition.
--


--
-- SELECT template for table `NatureDetail_pokeathlon_stat_changes_inner`
--
SELECT `max_change`, `pokeathlon_stat` FROM `NatureDetail_pokeathlon_stat_changes_inner` WHERE 1;

--
-- INSERT template for table `NatureDetail_pokeathlon_stat_changes_inner`
--
INSERT INTO `NatureDetail_pokeathlon_stat_changes_inner`(`max_change`, `pokeathlon_stat`) VALUES (?, ?);

--
-- UPDATE template for table `NatureDetail_pokeathlon_stat_changes_inner`
--
UPDATE `NatureDetail_pokeathlon_stat_changes_inner` SET `max_change` = ?, `pokeathlon_stat` = ? WHERE 1;

--
-- DELETE template for table `NatureDetail_pokeathlon_stat_changes_inner`
--
DELETE FROM `NatureDetail_pokeathlon_stat_changes_inner` WHERE 0;

