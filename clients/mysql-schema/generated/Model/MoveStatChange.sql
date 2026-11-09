--
-- PokéAPI.
-- Prepared SQL queries for 'MoveStatChange' definition.
--


--
-- SELECT template for table `MoveStatChange`
--
SELECT `change`, `move` FROM `MoveStatChange` WHERE 1;

--
-- INSERT template for table `MoveStatChange`
--
INSERT INTO `MoveStatChange`(`change`, `move`) VALUES (?, ?);

--
-- UPDATE template for table `MoveStatChange`
--
UPDATE `MoveStatChange` SET `change` = ?, `move` = ? WHERE 1;

--
-- DELETE template for table `MoveStatChange`
--
DELETE FROM `MoveStatChange` WHERE 0;

