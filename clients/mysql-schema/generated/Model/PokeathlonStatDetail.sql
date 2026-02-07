--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatDetail' definition.
--


--
-- SELECT template for table `PokeathlonStatDetail`
--
SELECT `id`, `name`, `affecting_natures`, `names` FROM `PokeathlonStatDetail` WHERE 1;

--
-- INSERT template for table `PokeathlonStatDetail`
--
INSERT INTO `PokeathlonStatDetail`(`id`, `name`, `affecting_natures`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokeathlonStatDetail`
--
UPDATE `PokeathlonStatDetail` SET `id` = ?, `name` = ?, `affecting_natures` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatDetail`
--
DELETE FROM `PokeathlonStatDetail` WHERE 0;

