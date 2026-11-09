--
-- PokéAPI.
-- Prepared SQL queries for 'MoveEffectEffectText' definition.
--


--
-- SELECT template for table `MoveEffectEffectText`
--
SELECT `effect`, `short_effect`, `language` FROM `MoveEffectEffectText` WHERE 1;

--
-- INSERT template for table `MoveEffectEffectText`
--
INSERT INTO `MoveEffectEffectText`(`effect`, `short_effect`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MoveEffectEffectText`
--
UPDATE `MoveEffectEffectText` SET `effect` = ?, `short_effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveEffectEffectText`
--
DELETE FROM `MoveEffectEffectText` WHERE 0;

