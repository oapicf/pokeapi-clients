--
-- PokéAPI.
-- Prepared SQL queries for 'CurrencyName' definition.
--


--
-- SELECT template for table `CurrencyName`
--
SELECT `name`, `language` FROM `CurrencyName` WHERE 1;

--
-- INSERT template for table `CurrencyName`
--
INSERT INTO `CurrencyName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `CurrencyName`
--
UPDATE `CurrencyName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CurrencyName`
--
DELETE FROM `CurrencyName` WHERE 0;

