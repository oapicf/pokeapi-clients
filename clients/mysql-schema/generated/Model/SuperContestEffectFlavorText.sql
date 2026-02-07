--
-- PokéAPI.
-- Prepared SQL queries for 'SuperContestEffectFlavorText' definition.
--


--
-- SELECT template for table `SuperContestEffectFlavorText`
--
SELECT `flavor_text`, `language` FROM `SuperContestEffectFlavorText` WHERE 1;

--
-- INSERT template for table `SuperContestEffectFlavorText`
--
INSERT INTO `SuperContestEffectFlavorText`(`flavor_text`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `SuperContestEffectFlavorText`
--
UPDATE `SuperContestEffectFlavorText` SET `flavor_text` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `SuperContestEffectFlavorText`
--
DELETE FROM `SuperContestEffectFlavorText` WHERE 0;

