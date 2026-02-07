--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityChangeEffectText' definition.
--


--
-- SELECT template for table `AbilityChangeEffectText`
--
SELECT `effect`, `language` FROM `AbilityChangeEffectText` WHERE 1;

--
-- INSERT template for table `AbilityChangeEffectText`
--
INSERT INTO `AbilityChangeEffectText`(`effect`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `AbilityChangeEffectText`
--
UPDATE `AbilityChangeEffectText` SET `effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AbilityChangeEffectText`
--
DELETE FROM `AbilityChangeEffectText` WHERE 0;

