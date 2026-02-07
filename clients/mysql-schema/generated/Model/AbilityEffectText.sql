--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityEffectText' definition.
--


--
-- SELECT template for table `AbilityEffectText`
--
SELECT `effect`, `short_effect`, `language` FROM `AbilityEffectText` WHERE 1;

--
-- INSERT template for table `AbilityEffectText`
--
INSERT INTO `AbilityEffectText`(`effect`, `short_effect`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AbilityEffectText`
--
UPDATE `AbilityEffectText` SET `effect` = ?, `short_effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AbilityEffectText`
--
DELETE FROM `AbilityEffectText` WHERE 0;

