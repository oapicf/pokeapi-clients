--
-- PokéAPI.
-- Prepared SQL queries for 'ItemAttributeDescription' definition.
--


--
-- SELECT template for table `ItemAttributeDescription`
--
SELECT `description`, `language` FROM `ItemAttributeDescription` WHERE 1;

--
-- INSERT template for table `ItemAttributeDescription`
--
INSERT INTO `ItemAttributeDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemAttributeDescription`
--
UPDATE `ItemAttributeDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributeDescription`
--
DELETE FROM `ItemAttributeDescription` WHERE 0;

