--
-- PokéAPI.
-- Prepared SQL queries for 'ContestTypeDetail' definition.
--


--
-- SELECT template for table `ContestTypeDetail`
--
SELECT `id`, `name`, `berry_flavor`, `names` FROM `ContestTypeDetail` WHERE 1;

--
-- INSERT template for table `ContestTypeDetail`
--
INSERT INTO `ContestTypeDetail`(`id`, `name`, `berry_flavor`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ContestTypeDetail`
--
UPDATE `ContestTypeDetail` SET `id` = ?, `name` = ?, `berry_flavor` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `ContestTypeDetail`
--
DELETE FROM `ContestTypeDetail` WHERE 0;

