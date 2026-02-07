--
-- PokéAPI.
-- Prepared SQL queries for 'ContestEffectDetail' definition.
--


--
-- SELECT template for table `ContestEffectDetail`
--
SELECT `id`, `appeal`, `jam`, `effect_entries`, `flavor_text_entries` FROM `ContestEffectDetail` WHERE 1;

--
-- INSERT template for table `ContestEffectDetail`
--
INSERT INTO `ContestEffectDetail`(`id`, `appeal`, `jam`, `effect_entries`, `flavor_text_entries`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ContestEffectDetail`
--
UPDATE `ContestEffectDetail` SET `id` = ?, `appeal` = ?, `jam` = ?, `effect_entries` = ?, `flavor_text_entries` = ? WHERE 1;

--
-- DELETE template for table `ContestEffectDetail`
--
DELETE FROM `ContestEffectDetail` WHERE 0;

