--
-- PokéAPI.
-- Prepared SQL queries for 'CurrencySummary' definition.
--


--
-- SELECT template for table `CurrencySummary`
--
SELECT `name`, `url` FROM `CurrencySummary` WHERE 1;

--
-- INSERT template for table `CurrencySummary`
--
INSERT INTO `CurrencySummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `CurrencySummary`
--
UPDATE `CurrencySummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `CurrencySummary`
--
DELETE FROM `CurrencySummary` WHERE 0;

