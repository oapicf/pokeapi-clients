--
-- PokéAPI.
-- Prepared SQL queries for 'CurrencyDetail' definition.
--


--
-- SELECT template for table `CurrencyDetail`
--
SELECT `id`, `name`, `names` FROM `CurrencyDetail` WHERE 1;

--
-- INSERT template for table `CurrencyDetail`
--
INSERT INTO `CurrencyDetail`(`id`, `name`, `names`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CurrencyDetail`
--
UPDATE `CurrencyDetail` SET `id` = ?, `name` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `CurrencyDetail`
--
DELETE FROM `CurrencyDetail` WHERE 0;

