
# Table `AbilityPokemonDetail`
(mapped from: AbilityPokemonDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**slot** | slot | int NOT NULL |  | **kotlin.Int** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | 
**pokemon** | pokemon | long NOT NULL |  | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. |  [foreignkey]
**isHidden** | is_hidden | boolean |  | **kotlin.Boolean** | Whether or not this a hidden ability for the referenced Pokémon. |  [optional]





