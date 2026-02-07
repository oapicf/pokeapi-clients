--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaName' definition.
--


--
-- SELECT template for table `LocationAreaName`
--
SELECT `name`, `language` FROM `LocationAreaName` WHERE 1;

--
-- INSERT template for table `LocationAreaName`
--
INSERT INTO `LocationAreaName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaName`
--
UPDATE `LocationAreaName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaName`
--
DELETE FROM `LocationAreaName` WHERE 0;

