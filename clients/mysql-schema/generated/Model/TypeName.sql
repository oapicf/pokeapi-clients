--
-- PokéAPI.
-- Prepared SQL queries for 'TypeName' definition.
--


--
-- SELECT template for table `TypeName`
--
SELECT `name`, `language` FROM `TypeName` WHERE 1;

--
-- INSERT template for table `TypeName`
--
INSERT INTO `TypeName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `TypeName`
--
UPDATE `TypeName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `TypeName`
--
DELETE FROM `TypeName` WHERE 0;

