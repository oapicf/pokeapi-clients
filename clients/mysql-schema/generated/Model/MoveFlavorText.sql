--
-- PokéAPI.
-- Prepared SQL queries for 'MoveFlavorText' definition.
--


--
-- SELECT template for table `MoveFlavorText`
--
SELECT `flavor_text`, `language`, `version_group` FROM `MoveFlavorText` WHERE 1;

--
-- INSERT template for table `MoveFlavorText`
--
INSERT INTO `MoveFlavorText`(`flavor_text`, `language`, `version_group`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MoveFlavorText`
--
UPDATE `MoveFlavorText` SET `flavor_text` = ?, `language` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `MoveFlavorText`
--
DELETE FROM `MoveFlavorText` WHERE 0;

