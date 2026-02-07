--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityName' definition.
--


--
-- SELECT template for table `AbilityName`
--
SELECT `name`, `language` FROM `AbilityName` WHERE 1;

--
-- INSERT template for table `AbilityName`
--
INSERT INTO `AbilityName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `AbilityName`
--
UPDATE `AbilityName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AbilityName`
--
DELETE FROM `AbilityName` WHERE 0;

