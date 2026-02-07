--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaCategoryDetail' definition.
--


--
-- SELECT template for table `MoveMetaCategoryDetail`
--
SELECT `id`, `name`, `descriptions`, `moves` FROM `MoveMetaCategoryDetail` WHERE 1;

--
-- INSERT template for table `MoveMetaCategoryDetail`
--
INSERT INTO `MoveMetaCategoryDetail`(`id`, `name`, `descriptions`, `moves`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MoveMetaCategoryDetail`
--
UPDATE `MoveMetaCategoryDetail` SET `id` = ?, `name` = ?, `descriptions` = ?, `moves` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaCategoryDetail`
--
DELETE FROM `MoveMetaCategoryDetail` WHERE 0;

