--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityChange' definition.
--


--
-- SELECT template for table `AbilityChange`
--
SELECT `version_group`, `effect_entries` FROM `AbilityChange` WHERE 1;

--
-- INSERT template for table `AbilityChange`
--
INSERT INTO `AbilityChange`(`version_group`, `effect_entries`) VALUES (?, ?);

--
-- UPDATE template for table `AbilityChange`
--
UPDATE `AbilityChange` SET `version_group` = ?, `effect_entries` = ? WHERE 1;

--
-- DELETE template for table `AbilityChange`
--
DELETE FROM `AbilityChange` WHERE 0;

