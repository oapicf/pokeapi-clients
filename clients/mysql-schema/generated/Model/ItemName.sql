--
-- PokéAPI.
-- Prepared SQL queries for 'ItemName' definition.
--


--
-- SELECT template for table `ItemName`
--
SELECT `name`, `language` FROM `ItemName` WHERE 1;

--
-- INSERT template for table `ItemName`
--
INSERT INTO `ItemName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemName`
--
UPDATE `ItemName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemName`
--
DELETE FROM `ItemName` WHERE 0;

