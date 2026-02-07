--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_effect_changes_inner_effect_entries_inner' definition.
--


--
-- SELECT template for table `MoveDetail_effect_changes_inner_effect_entries_inner`
--
SELECT `effect`, `language` FROM `MoveDetail_effect_changes_inner_effect_entries_inner` WHERE 1;

--
-- INSERT template for table `MoveDetail_effect_changes_inner_effect_entries_inner`
--
INSERT INTO `MoveDetail_effect_changes_inner_effect_entries_inner`(`effect`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_effect_changes_inner_effect_entries_inner`
--
UPDATE `MoveDetail_effect_changes_inner_effect_entries_inner` SET `effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_effect_changes_inner_effect_entries_inner`
--
DELETE FROM `MoveDetail_effect_changes_inner_effect_entries_inner` WHERE 0;

