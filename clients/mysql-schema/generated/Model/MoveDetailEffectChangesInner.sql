--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_effect_changes_inner' definition.
--


--
-- SELECT template for table `MoveDetail_effect_changes_inner`
--
SELECT `effect_entries`, `version_group` FROM `MoveDetail_effect_changes_inner` WHERE 1;

--
-- INSERT template for table `MoveDetail_effect_changes_inner`
--
INSERT INTO `MoveDetail_effect_changes_inner`(`effect_entries`, `version_group`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_effect_changes_inner`
--
UPDATE `MoveDetail_effect_changes_inner` SET `effect_entries` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_effect_changes_inner`
--
DELETE FROM `MoveDetail_effect_changes_inner` WHERE 0;

