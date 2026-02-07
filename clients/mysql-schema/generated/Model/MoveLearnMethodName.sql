--
-- PokéAPI.
-- Prepared SQL queries for 'MoveLearnMethodName' definition.
--


--
-- SELECT template for table `MoveLearnMethodName`
--
SELECT `name`, `language` FROM `MoveLearnMethodName` WHERE 1;

--
-- INSERT template for table `MoveLearnMethodName`
--
INSERT INTO `MoveLearnMethodName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveLearnMethodName`
--
UPDATE `MoveLearnMethodName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveLearnMethodName`
--
DELETE FROM `MoveLearnMethodName` WHERE 0;

