--
-- PokéAPI.
-- Prepared SQL queries for 'MoveChange_effect_entries_inner' definition.
--


--
-- SELECT template for table `MoveChange_effect_entries_inner`
--
SELECT `effect`, `short_effect`, `language` FROM `MoveChange_effect_entries_inner` WHERE 1;

--
-- INSERT template for table `MoveChange_effect_entries_inner`
--
INSERT INTO `MoveChange_effect_entries_inner`(`effect`, `short_effect`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MoveChange_effect_entries_inner`
--
UPDATE `MoveChange_effect_entries_inner` SET `effect` = ?, `short_effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveChange_effect_entries_inner`
--
DELETE FROM `MoveChange_effect_entries_inner` WHERE 0;

