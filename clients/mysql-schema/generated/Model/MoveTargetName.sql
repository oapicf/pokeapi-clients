--
-- PokéAPI.
-- Prepared SQL queries for 'MoveTargetName' definition.
--


--
-- SELECT template for table `MoveTargetName`
--
SELECT `name`, `language` FROM `MoveTargetName` WHERE 1;

--
-- INSERT template for table `MoveTargetName`
--
INSERT INTO `MoveTargetName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveTargetName`
--
UPDATE `MoveTargetName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveTargetName`
--
DELETE FROM `MoveTargetName` WHERE 0;

