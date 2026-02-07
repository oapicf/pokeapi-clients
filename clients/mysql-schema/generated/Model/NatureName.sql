--
-- PokéAPI.
-- Prepared SQL queries for 'NatureName' definition.
--


--
-- SELECT template for table `NatureName`
--
SELECT `name`, `language` FROM `NatureName` WHERE 1;

--
-- INSERT template for table `NatureName`
--
INSERT INTO `NatureName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `NatureName`
--
UPDATE `NatureName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `NatureName`
--
DELETE FROM `NatureName` WHERE 0;

