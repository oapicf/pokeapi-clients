--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemPrice' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_price'
--
SELECT purchase_price, sell_price, currency, version_group FROM item_price WHERE 1=1;

--
-- INSERT template for table 'item_price'
--
INSERT INTO item_price (purchase_price, sell_price, currency, version_group) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'item_price'
--
UPDATE item_price SET purchase_price = ?, sell_price = ?, currency = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'item_price'
--
DELETE FROM item_price WHERE 1=2;

