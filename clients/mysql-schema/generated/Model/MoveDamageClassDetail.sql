--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDamageClassDetail' definition.
--


--
-- SELECT template for table `MoveDamageClassDetail`
--
SELECT `id`, `name`, `descriptions`, `moves`, `names` FROM `MoveDamageClassDetail` WHERE 1;

--
-- INSERT template for table `MoveDamageClassDetail`
--
INSERT INTO `MoveDamageClassDetail`(`id`, `name`, `descriptions`, `moves`, `names`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveDamageClassDetail`
--
UPDATE `MoveDamageClassDetail` SET `id` = ?, `name` = ?, `descriptions` = ?, `moves` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `MoveDamageClassDetail`
--
DELETE FROM `MoveDamageClassDetail` WHERE 0;

