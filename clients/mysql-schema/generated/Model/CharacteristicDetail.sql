--
-- PokéAPI.
-- Prepared SQL queries for 'CharacteristicDetail' definition.
--


--
-- SELECT template for table `CharacteristicDetail`
--
SELECT `id`, `gene_modulo`, `possible_values`, `highest_stat`, `descriptions` FROM `CharacteristicDetail` WHERE 1;

--
-- INSERT template for table `CharacteristicDetail`
--
INSERT INTO `CharacteristicDetail`(`id`, `gene_modulo`, `possible_values`, `highest_stat`, `descriptions`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CharacteristicDetail`
--
UPDATE `CharacteristicDetail` SET `id` = ?, `gene_modulo` = ?, `possible_values` = ?, `highest_stat` = ?, `descriptions` = ? WHERE 1;

--
-- DELETE template for table `CharacteristicDetail`
--
DELETE FROM `CharacteristicDetail` WHERE 0;

