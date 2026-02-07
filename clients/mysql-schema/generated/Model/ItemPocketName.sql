--
-- PokéAPI.
-- Prepared SQL queries for 'ItemPocketName' definition.
--


--
-- SELECT template for table `ItemPocketName`
--
SELECT `name`, `language` FROM `ItemPocketName` WHERE 1;

--
-- INSERT template for table `ItemPocketName`
--
INSERT INTO `ItemPocketName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemPocketName`
--
UPDATE `ItemPocketName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemPocketName`
--
DELETE FROM `ItemPocketName` WHERE 0;

