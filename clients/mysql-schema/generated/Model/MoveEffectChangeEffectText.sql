--
-- PokéAPI.
-- Prepared SQL queries for 'MoveEffectChangeEffectText' definition.
--


--
-- SELECT template for table `MoveEffectChangeEffectText`
--
SELECT `effect`, `language` FROM `MoveEffectChangeEffectText` WHERE 1;

--
-- INSERT template for table `MoveEffectChangeEffectText`
--
INSERT INTO `MoveEffectChangeEffectText`(`effect`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveEffectChangeEffectText`
--
UPDATE `MoveEffectChangeEffectText` SET `effect` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveEffectChangeEffectText`
--
DELETE FROM `MoveEffectChangeEffectText` WHERE 0;

