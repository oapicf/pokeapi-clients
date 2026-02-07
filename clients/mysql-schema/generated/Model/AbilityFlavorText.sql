--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityFlavorText' definition.
--


--
-- SELECT template for table `AbilityFlavorText`
--
SELECT `flavor_text`, `language`, `version_group` FROM `AbilityFlavorText` WHERE 1;

--
-- INSERT template for table `AbilityFlavorText`
--
INSERT INTO `AbilityFlavorText`(`flavor_text`, `language`, `version_group`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AbilityFlavorText`
--
UPDATE `AbilityFlavorText` SET `flavor_text` = ?, `language` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `AbilityFlavorText`
--
DELETE FROM `AbilityFlavorText` WHERE 0;

