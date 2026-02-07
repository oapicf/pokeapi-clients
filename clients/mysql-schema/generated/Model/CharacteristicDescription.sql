--
-- PokéAPI.
-- Prepared SQL queries for 'CharacteristicDescription' definition.
--


--
-- SELECT template for table `CharacteristicDescription`
--
SELECT `description`, `language` FROM `CharacteristicDescription` WHERE 1;

--
-- INSERT template for table `CharacteristicDescription`
--
INSERT INTO `CharacteristicDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `CharacteristicDescription`
--
UPDATE `CharacteristicDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CharacteristicDescription`
--
DELETE FROM `CharacteristicDescription` WHERE 0;

