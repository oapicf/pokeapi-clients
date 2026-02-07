--
-- PokéAPI.
-- Prepared SQL queries for 'ItemGameIndex' definition.
--


--
-- SELECT template for table `ItemGameIndex`
--
SELECT `game_index`, `generation` FROM `ItemGameIndex` WHERE 1;

--
-- INSERT template for table `ItemGameIndex`
--
INSERT INTO `ItemGameIndex`(`game_index`, `generation`) VALUES (?, ?);

--
-- UPDATE template for table `ItemGameIndex`
--
UPDATE `ItemGameIndex` SET `game_index` = ?, `generation` = ? WHERE 1;

--
-- DELETE template for table `ItemGameIndex`
--
DELETE FROM `ItemGameIndex` WHERE 0;

