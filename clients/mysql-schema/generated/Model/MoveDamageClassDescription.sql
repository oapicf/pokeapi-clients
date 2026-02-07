--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDamageClassDescription' definition.
--


--
-- SELECT template for table `MoveDamageClassDescription`
--
SELECT `description`, `language` FROM `MoveDamageClassDescription` WHERE 1;

--
-- INSERT template for table `MoveDamageClassDescription`
--
INSERT INTO `MoveDamageClassDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDamageClassDescription`
--
UPDATE `MoveDamageClassDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveDamageClassDescription`
--
DELETE FROM `MoveDamageClassDescription` WHERE 0;

