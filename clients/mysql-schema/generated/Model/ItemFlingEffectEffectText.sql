--
-- PokéAPI.
-- Prepared SQL queries for 'ItemFlingEffectEffectText' definition.
--


--
-- SELECT template for table `ItemFlingEffectEffectText`
--
SELECT `effect`, `language` FROM `ItemFlingEffectEffectText` WHERE 1;

--
-- INSERT template for table `ItemFlingEffectEffectText`
--
INSERT INTO `ItemFlingEffectEffectText`(`effect`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemFlingEffectEffectText`
--
UPDATE `ItemFlingEffectEffectText` SET `effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemFlingEffectEffectText`
--
DELETE FROM `ItemFlingEffectEffectText` WHERE 0;

