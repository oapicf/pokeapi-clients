
# Table `PokemonPastAbility`
(mapped from: PokemonPastAbility)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**abilities** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonAbilityPast&gt;**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. |  [foreignkey]


# **Table `PokemonPastAbilityPokemonAbilityPast`**
(mapped from: PokemonPastAbilityPokemonAbilityPast)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonPastAbility | pokemonPastAbility | long | | kotlin.Long | Primary Key | *one*
pokemonAbilityPast | pokemonAbilityPast | long | | kotlin.Long | Foreign Key | *many*




