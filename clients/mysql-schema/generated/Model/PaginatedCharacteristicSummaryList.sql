--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedCharacteristicSummaryList' definition.
--


--
-- SELECT template for table `PaginatedCharacteristicSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedCharacteristicSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedCharacteristicSummaryList`
--
INSERT INTO `PaginatedCharacteristicSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedCharacteristicSummaryList`
--
UPDATE `PaginatedCharacteristicSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedCharacteristicSummaryList`
--
DELETE FROM `PaginatedCharacteristicSummaryList` WHERE 0;

