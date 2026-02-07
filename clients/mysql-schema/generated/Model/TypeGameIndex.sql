--
-- PokéAPI.
-- Prepared SQL queries for 'TypeGameIndex' definition.
--


--
-- SELECT template for table `TypeGameIndex`
--
SELECT `game_index`, `generation` FROM `TypeGameIndex` WHERE 1;

--
-- INSERT template for table `TypeGameIndex`
--
INSERT INTO `TypeGameIndex`(`game_index`, `generation`) VALUES (?, ?);

--
-- UPDATE template for table `TypeGameIndex`
--
UPDATE `TypeGameIndex` SET `game_index` = ?, `generation` = ? WHERE 1;

--
-- DELETE template for table `TypeGameIndex`
--
DELETE FROM `TypeGameIndex` WHERE 0;

