--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaCategoryDescription' definition.
--


--
-- SELECT template for table `MoveMetaCategoryDescription`
--
SELECT `description`, `language` FROM `MoveMetaCategoryDescription` WHERE 1;

--
-- INSERT template for table `MoveMetaCategoryDescription`
--
INSERT INTO `MoveMetaCategoryDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveMetaCategoryDescription`
--
UPDATE `MoveMetaCategoryDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaCategoryDescription`
--
DELETE FROM `MoveMetaCategoryDescription` WHERE 0;

