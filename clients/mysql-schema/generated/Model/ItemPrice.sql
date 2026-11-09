--
-- PokéAPI.
-- Prepared SQL queries for 'ItemPrice' definition.
--


--
-- SELECT template for table `ItemPrice`
--
SELECT `purchase_price`, `sell_price`, `currency`, `version_group` FROM `ItemPrice` WHERE 1;

--
-- INSERT template for table `ItemPrice`
--
INSERT INTO `ItemPrice`(`purchase_price`, `sell_price`, `currency`, `version_group`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ItemPrice`
--
UPDATE `ItemPrice` SET `purchase_price` = ?, `sell_price` = ?, `currency` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `ItemPrice`
--
DELETE FROM `ItemPrice` WHERE 0;

