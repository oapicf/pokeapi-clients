--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaAilmentName' definition.
--


--
-- SELECT template for table `MoveMetaAilmentName`
--
SELECT `name`, `language` FROM `MoveMetaAilmentName` WHERE 1;

--
-- INSERT template for table `MoveMetaAilmentName`
--
INSERT INTO `MoveMetaAilmentName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveMetaAilmentName`
--
UPDATE `MoveMetaAilmentName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaAilmentName`
--
DELETE FROM `MoveMetaAilmentName` WHERE 0;

