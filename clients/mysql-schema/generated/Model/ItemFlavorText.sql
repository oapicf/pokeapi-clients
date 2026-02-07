--
-- PokéAPI.
-- Prepared SQL queries for 'ItemFlavorText' definition.
--


--
-- SELECT template for table `ItemFlavorText`
--
SELECT `text`, `version_group`, `language` FROM `ItemFlavorText` WHERE 1;

--
-- INSERT template for table `ItemFlavorText`
--
INSERT INTO `ItemFlavorText`(`text`, `version_group`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemFlavorText`
--
UPDATE `ItemFlavorText` SET `text` = ?, `version_group` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemFlavorText`
--
DELETE FROM `ItemFlavorText` WHERE 0;

