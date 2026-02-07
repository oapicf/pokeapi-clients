--
-- PokéAPI.
-- Prepared SQL queries for 'ContestEffectFlavorText' definition.
--


--
-- SELECT template for table `ContestEffectFlavorText`
--
SELECT `flavor_text`, `language` FROM `ContestEffectFlavorText` WHERE 1;

--
-- INSERT template for table `ContestEffectFlavorText`
--
INSERT INTO `ContestEffectFlavorText`(`flavor_text`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ContestEffectFlavorText`
--
UPDATE `ContestEffectFlavorText` SET `flavor_text` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ContestEffectFlavorText`
--
DELETE FROM `ContestEffectFlavorText` WHERE 0;

