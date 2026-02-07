--
-- PokéAPI.
-- Prepared SQL queries for 'ContestEffectEffectText' definition.
--


--
-- SELECT template for table `ContestEffectEffectText`
--
SELECT `effect`, `language` FROM `ContestEffectEffectText` WHERE 1;

--
-- INSERT template for table `ContestEffectEffectText`
--
INSERT INTO `ContestEffectEffectText`(`effect`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ContestEffectEffectText`
--
UPDATE `ContestEffectEffectText` SET `effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ContestEffectEffectText`
--
DELETE FROM `ContestEffectEffectText` WHERE 0;

