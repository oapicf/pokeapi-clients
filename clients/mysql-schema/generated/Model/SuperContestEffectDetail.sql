--
-- PokéAPI.
-- Prepared SQL queries for 'SuperContestEffectDetail' definition.
--


--
-- SELECT template for table `SuperContestEffectDetail`
--
SELECT `id`, `appeal`, `flavor_text_entries`, `moves` FROM `SuperContestEffectDetail` WHERE 1;

--
-- INSERT template for table `SuperContestEffectDetail`
--
INSERT INTO `SuperContestEffectDetail`(`id`, `appeal`, `flavor_text_entries`, `moves`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SuperContestEffectDetail`
--
UPDATE `SuperContestEffectDetail` SET `id` = ?, `appeal` = ?, `flavor_text_entries` = ?, `moves` = ? WHERE 1;

--
-- DELETE template for table `SuperContestEffectDetail`
--
DELETE FROM `SuperContestEffectDetail` WHERE 0;

