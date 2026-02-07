--
-- PokéAPI.
-- Prepared SQL queries for 'StatName' definition.
--


--
-- SELECT template for table `StatName`
--
SELECT `name`, `language` FROM `StatName` WHERE 1;

--
-- INSERT template for table `StatName`
--
INSERT INTO `StatName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `StatName`
--
UPDATE `StatName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `StatName`
--
DELETE FROM `StatName` WHERE 0;

