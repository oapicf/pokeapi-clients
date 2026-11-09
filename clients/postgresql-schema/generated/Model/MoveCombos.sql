--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveCombos' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_combos'
--
SELECT normal, super FROM move_combos WHERE 1=1;

--
-- INSERT template for table 'move_combos'
--
INSERT INTO move_combos (normal, super) VALUES (?, ?);

--
-- UPDATE template for table 'move_combos'
--
UPDATE move_combos SET normal = ?, super = ? WHERE 1=2;

--
-- DELETE template for table 'move_combos'
--
DELETE FROM move_combos WHERE 1=2;

