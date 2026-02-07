--
-- PokéAPI.
-- Prepared SQL queries for 'MoveTargetDescription' definition.
--


--
-- SELECT template for table `MoveTargetDescription`
--
SELECT `description`, `language` FROM `MoveTargetDescription` WHERE 1;

--
-- INSERT template for table `MoveTargetDescription`
--
INSERT INTO `MoveTargetDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveTargetDescription`
--
UPDATE `MoveTargetDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveTargetDescription`
--
DELETE FROM `MoveTargetDescription` WHERE 0;

