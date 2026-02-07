--
-- PokéAPI.
-- Prepared SQL queries for 'GenerationName' definition.
--


--
-- SELECT template for table `GenerationName`
--
SELECT `name`, `language` FROM `GenerationName` WHERE 1;

--
-- INSERT template for table `GenerationName`
--
INSERT INTO `GenerationName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `GenerationName`
--
UPDATE `GenerationName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `GenerationName`
--
DELETE FROM `GenerationName` WHERE 0;

