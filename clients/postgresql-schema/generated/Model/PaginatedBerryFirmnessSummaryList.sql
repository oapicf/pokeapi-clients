--
-- "PokéAPI"
-- Prepared SQL queries for 'PaginatedBerryFirmnessSummaryList' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'paginated_berry_firmness_summary_list'
--
SELECT "count", "next", previous, results FROM paginated_berry_firmness_summary_list WHERE 1=1;

--
-- INSERT template for table 'paginated_berry_firmness_summary_list'
--
INSERT INTO paginated_berry_firmness_summary_list ("count", "next", previous, results) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'paginated_berry_firmness_summary_list'
--
UPDATE paginated_berry_firmness_summary_list SET "count" = ?, "next" = ?, previous = ?, results = ? WHERE 1=2;

--
-- DELETE template for table 'paginated_berry_firmness_summary_list'
--
DELETE FROM paginated_berry_firmness_summary_list WHERE 1=2;

