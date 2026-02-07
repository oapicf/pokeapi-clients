--
-- PokéAPI.
-- Prepared SQL queries for 'LocationDetail' definition.
--


--
-- SELECT template for table `LocationDetail`
--
SELECT `id`, `name`, `region`, `names`, `game_indices`, `areas` FROM `LocationDetail` WHERE 1;

--
-- INSERT template for table `LocationDetail`
--
INSERT INTO `LocationDetail`(`id`, `name`, `region`, `names`, `game_indices`, `areas`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocationDetail`
--
UPDATE `LocationDetail` SET `id` = ?, `name` = ?, `region` = ?, `names` = ?, `game_indices` = ?, `areas` = ? WHERE 1;

--
-- DELETE template for table `LocationDetail`
--
DELETE FROM `LocationDetail` WHERE 0;

