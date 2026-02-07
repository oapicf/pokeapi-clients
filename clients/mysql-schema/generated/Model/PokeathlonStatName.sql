--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatName' definition.
--


--
-- SELECT template for table `PokeathlonStatName`
--
SELECT `name`, `language` FROM `PokeathlonStatName` WHERE 1;

--
-- INSERT template for table `PokeathlonStatName`
--
INSERT INTO `PokeathlonStatName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatName`
--
UPDATE `PokeathlonStatName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatName`
--
DELETE FROM `PokeathlonStatName` WHERE 0;

