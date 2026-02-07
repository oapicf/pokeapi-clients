--
-- PokéAPI.
-- Prepared SQL queries for 'LocationName' definition.
--


--
-- SELECT template for table `LocationName`
--
SELECT `name`, `language` FROM `LocationName` WHERE 1;

--
-- INSERT template for table `LocationName`
--
INSERT INTO `LocationName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `LocationName`
--
UPDATE `LocationName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `LocationName`
--
DELETE FROM `LocationName` WHERE 0;

