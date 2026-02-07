--
-- PokéAPI.
-- Prepared SQL queries for 'MachineDetail' definition.
--


--
-- SELECT template for table `MachineDetail`
--
SELECT `id`, `item`, `version_group`, `move` FROM `MachineDetail` WHERE 1;

--
-- INSERT template for table `MachineDetail`
--
INSERT INTO `MachineDetail`(`id`, `item`, `version_group`, `move`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MachineDetail`
--
UPDATE `MachineDetail` SET `id` = ?, `item` = ?, `version_group` = ?, `move` = ? WHERE 1;

--
-- DELETE template for table `MachineDetail`
--
DELETE FROM `MachineDetail` WHERE 0;

