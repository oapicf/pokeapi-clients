--
-- PokéAPI.
-- Prepared SQL queries for 'ContestTypeName' definition.
--


--
-- SELECT template for table `ContestTypeName`
--
SELECT `name`, `color`, `language` FROM `ContestTypeName` WHERE 1;

--
-- INSERT template for table `ContestTypeName`
--
INSERT INTO `ContestTypeName`(`name`, `color`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ContestTypeName`
--
UPDATE `ContestTypeName` SET `name` = ?, `color` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ContestTypeName`
--
DELETE FROM `ContestTypeName` WHERE 0;

