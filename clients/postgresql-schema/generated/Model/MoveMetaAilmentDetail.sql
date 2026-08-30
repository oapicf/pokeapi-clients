--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaAilmentDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_ailment_detail'
--
SELECT "id", "name", moves, "names" FROM move_meta_ailment_detail WHERE 1=1;

--
-- INSERT template for table 'move_meta_ailment_detail'
--
INSERT INTO move_meta_ailment_detail ("id", "name", moves, "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'move_meta_ailment_detail'
--
UPDATE move_meta_ailment_detail SET "id" = ?, "name" = ?, moves = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_ailment_detail'
--
DELETE FROM move_meta_ailment_detail WHERE 1=2;

