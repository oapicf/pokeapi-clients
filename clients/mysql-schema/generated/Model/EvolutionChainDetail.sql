--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionChainDetail' definition.
--


--
-- SELECT template for table `EvolutionChainDetail`
--
SELECT `id`, `baby_trigger_item`, `chain` FROM `EvolutionChainDetail` WHERE 1;

--
-- INSERT template for table `EvolutionChainDetail`
--
INSERT INTO `EvolutionChainDetail`(`id`, `baby_trigger_item`, `chain`) VALUES (?, ?, ?);

--
-- UPDATE template for table `EvolutionChainDetail`
--
UPDATE `EvolutionChainDetail` SET `id` = ?, `baby_trigger_item` = ?, `chain` = ? WHERE 1;

--
-- DELETE template for table `EvolutionChainDetail`
--
DELETE FROM `EvolutionChainDetail` WHERE 0;

