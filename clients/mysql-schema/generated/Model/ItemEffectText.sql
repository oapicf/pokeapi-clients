--
-- PokéAPI.
-- Prepared SQL queries for 'ItemEffectText' definition.
--


--
-- SELECT template for table `ItemEffectText`
--
SELECT `effect`, `short_effect`, `language` FROM `ItemEffectText` WHERE 1;

--
-- INSERT template for table `ItemEffectText`
--
INSERT INTO `ItemEffectText`(`effect`, `short_effect`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemEffectText`
--
UPDATE `ItemEffectText` SET `effect` = ?, `short_effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemEffectText`
--
DELETE FROM `ItemEffectText` WHERE 0;

