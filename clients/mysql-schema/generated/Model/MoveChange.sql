--
-- PokéAPI.
-- Prepared SQL queries for 'MoveChange' definition.
--


--
-- SELECT template for table `MoveChange`
--
SELECT `accuracy`, `power`, `pp`, `effect_chance`, `effect_entries`, `type`, `version_group` FROM `MoveChange` WHERE 1;

--
-- INSERT template for table `MoveChange`
--
INSERT INTO `MoveChange`(`accuracy`, `power`, `pp`, `effect_chance`, `effect_entries`, `type`, `version_group`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveChange`
--
UPDATE `MoveChange` SET `accuracy` = ?, `power` = ?, `pp` = ?, `effect_chance` = ?, `effect_entries` = ?, `type` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `MoveChange`
--
DELETE FROM `MoveChange` WHERE 0;

