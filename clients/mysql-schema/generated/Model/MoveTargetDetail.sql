--
-- PokéAPI.
-- Prepared SQL queries for 'MoveTargetDetail' definition.
--


--
-- SELECT template for table `MoveTargetDetail`
--
SELECT `id`, `name`, `descriptions`, `moves`, `names` FROM `MoveTargetDetail` WHERE 1;

--
-- INSERT template for table `MoveTargetDetail`
--
INSERT INTO `MoveTargetDetail`(`id`, `name`, `descriptions`, `moves`, `names`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveTargetDetail`
--
UPDATE `MoveTargetDetail` SET `id` = ?, `name` = ?, `descriptions` = ?, `moves` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `MoveTargetDetail`
--
DELETE FROM `MoveTargetDetail` WHERE 0;

