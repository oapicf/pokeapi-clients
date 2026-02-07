--
-- PokéAPI.
-- Prepared SQL queries for 'ItemDetail_machines_inner' definition.
--


--
-- SELECT template for table `ItemDetail_machines_inner`
--
SELECT `machine`, `version_group` FROM `ItemDetail_machines_inner` WHERE 1;

--
-- INSERT template for table `ItemDetail_machines_inner`
--
INSERT INTO `ItemDetail_machines_inner`(`machine`, `version_group`) VALUES (?, ?);

--
-- UPDATE template for table `ItemDetail_machines_inner`
--
UPDATE `ItemDetail_machines_inner` SET `machine` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `ItemDetail_machines_inner`
--
DELETE FROM `ItemDetail_machines_inner` WHERE 0;

