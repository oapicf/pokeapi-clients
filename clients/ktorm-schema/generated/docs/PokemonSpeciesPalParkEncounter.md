
# Table `PokemonSpeciesPalParkEncounter`
(mapped from: PokemonSpeciesPalParkEncounter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rate** | rate | int NOT NULL |  | **kotlin.Int** | The base rate for encountering the referenced Pokémon in this pal park area. | 
**area** | area | long NOT NULL |  | [**PalParkAreaSummary**](PalParkAreaSummary.md) | The pal park area where this encounter happens. |  [foreignkey]
**baseScore** | base_score | int |  | **kotlin.Int** | The base score given to the player when the referenced Pokémon is caught during a pal park run. |  [optional]





