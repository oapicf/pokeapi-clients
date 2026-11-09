--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaStatChange' definition.
--


--
-- SELECT template for table `MoveMetaStatChange`
--
SELECT `change`, `stat` FROM `MoveMetaStatChange` WHERE 1;

--
-- INSERT template for table `MoveMetaStatChange`
--
INSERT INTO `MoveMetaStatChange`(`change`, `stat`) VALUES (?, ?);

--
-- UPDATE template for table `MoveMetaStatChange`
--
UPDATE `MoveMetaStatChange` SET `change` = ?, `stat` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaStatChange`
--
DELETE FROM `MoveMetaStatChange` WHERE 0;

