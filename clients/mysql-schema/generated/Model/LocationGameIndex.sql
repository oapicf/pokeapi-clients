--
-- PokéAPI.
-- Prepared SQL queries for 'LocationGameIndex' definition.
--


--
-- SELECT template for table `LocationGameIndex`
--
SELECT `game_index`, `generation` FROM `LocationGameIndex` WHERE 1;

--
-- INSERT template for table `LocationGameIndex`
--
INSERT INTO `LocationGameIndex`(`game_index`, `generation`) VALUES (?, ?);

--
-- UPDATE template for table `LocationGameIndex`
--
UPDATE `LocationGameIndex` SET `game_index` = ?, `generation` = ? WHERE 1;

--
-- DELETE template for table `LocationGameIndex`
--
DELETE FROM `LocationGameIndex` WHERE 0;

