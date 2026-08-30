--
-- "PokéAPI"
-- Prepared SQL queries for 'NatureDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_detail'
--
SELECT "id", "name", decreased_stat, increased_stat, likes_flavor, hates_flavor, berries, pokeathlon_stat_changes, move_battle_style_preferences, "names" FROM nature_detail WHERE 1=1;

--
-- INSERT template for table 'nature_detail'
--
INSERT INTO nature_detail ("id", "name", decreased_stat, increased_stat, likes_flavor, hates_flavor, berries, pokeathlon_stat_changes, move_battle_style_preferences, "names") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'nature_detail'
--
UPDATE nature_detail SET "id" = ?, "name" = ?, decreased_stat = ?, increased_stat = ?, likes_flavor = ?, hates_flavor = ?, berries = ?, pokeathlon_stat_changes = ?, move_battle_style_preferences = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'nature_detail'
--
DELETE FROM nature_detail WHERE 1=2;

