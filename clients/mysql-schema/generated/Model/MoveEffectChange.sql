--
-- PokéAPI.
-- Prepared SQL queries for 'MoveEffectChange' definition.
--


--
-- SELECT template for table `MoveEffectChange`
--
SELECT `version_group`, `effect_entries` FROM `MoveEffectChange` WHERE 1;

--
-- INSERT template for table `MoveEffectChange`
--
INSERT INTO `MoveEffectChange`(`version_group`, `effect_entries`) VALUES (?, ?);

--
-- UPDATE template for table `MoveEffectChange`
--
UPDATE `MoveEffectChange` SET `version_group` = ?, `effect_entries` = ? WHERE 1;

--
-- DELETE template for table `MoveEffectChange`
--
DELETE FROM `MoveEffectChange` WHERE 0;

