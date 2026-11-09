
# Table `PokemonAbilityPast`
(mapped from: PokemonAbilityPast)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**slot** | slot | int NOT NULL |  | **kotlin.Int** | The slot this ability occupies in this Pokémon species. | 
**ability** | ability | long NOT NULL |  | [**AbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. |  [foreignkey]
**isHidden** | is_hidden | boolean |  | **kotlin.Boolean** | Whether or not this is a hidden ability. |  [optional]





