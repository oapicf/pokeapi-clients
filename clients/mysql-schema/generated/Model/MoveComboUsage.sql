--
-- PokéAPI.
-- Prepared SQL queries for 'MoveComboUsage' definition.
--


--
-- SELECT template for table `MoveComboUsage`
--
SELECT `use_before`, `use_after` FROM `MoveComboUsage` WHERE 1;

--
-- INSERT template for table `MoveComboUsage`
--
INSERT INTO `MoveComboUsage`(`use_before`, `use_after`) VALUES (?, ?);

--
-- UPDATE template for table `MoveComboUsage`
--
UPDATE `MoveComboUsage` SET `use_before` = ?, `use_after` = ? WHERE 1;

--
-- DELETE template for table `MoveComboUsage`
--
DELETE FROM `MoveComboUsage` WHERE 0;

