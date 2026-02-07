--
-- PokéAPI.
-- Prepared SQL queries for 'MoveLearnMethodDescription' definition.
--


--
-- SELECT template for table `MoveLearnMethodDescription`
--
SELECT `description`, `language` FROM `MoveLearnMethodDescription` WHERE 1;

--
-- INSERT template for table `MoveLearnMethodDescription`
--
INSERT INTO `MoveLearnMethodDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveLearnMethodDescription`
--
UPDATE `MoveLearnMethodDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveLearnMethodDescription`
--
DELETE FROM `MoveLearnMethodDescription` WHERE 0;

