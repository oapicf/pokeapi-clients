--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaAilmentDetail' definition.
--


--
-- SELECT template for table `MoveMetaAilmentDetail`
--
SELECT `id`, `name`, `moves`, `names` FROM `MoveMetaAilmentDetail` WHERE 1;

--
-- INSERT template for table `MoveMetaAilmentDetail`
--
INSERT INTO `MoveMetaAilmentDetail`(`id`, `name`, `moves`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MoveMetaAilmentDetail`
--
UPDATE `MoveMetaAilmentDetail` SET `id` = ?, `name` = ?, `moves` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaAilmentDetail`
--
DELETE FROM `MoveMetaAilmentDetail` WHERE 0;

