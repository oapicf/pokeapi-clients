--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_machines_inner' definition.
--


--
-- SELECT template for table `MoveDetail_machines_inner`
--
SELECT `machine`, `version_group` FROM `MoveDetail_machines_inner` WHERE 1;

--
-- INSERT template for table `MoveDetail_machines_inner`
--
INSERT INTO `MoveDetail_machines_inner`(`machine`, `version_group`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_machines_inner`
--
UPDATE `MoveDetail_machines_inner` SET `machine` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_machines_inner`
--
DELETE FROM `MoveDetail_machines_inner` WHERE 0;

