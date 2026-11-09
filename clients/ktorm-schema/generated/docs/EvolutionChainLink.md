
# Table `EvolutionChainLink`
(mapped from: EvolutionChainLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**isBaby** | is_baby | boolean NOT NULL |  | **kotlin.Boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | species | long NOT NULL |  | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. |  [foreignkey]
**evolutionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonEvolution&gt;**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolvesTo** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionChainLink&gt;**](EvolutionChainLink.md) | A List of chain objects. |  [readonly]




# **Table `EvolutionChainLinkPokemonEvolution`**
(mapped from: EvolutionChainLinkPokemonEvolution)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionChainLink | evolutionChainLink | long | | kotlin.Long | Primary Key | *one*
pokemonEvolution | pokemonEvolution | long | | kotlin.Long | Foreign Key | *many*



# **Table `EvolutionChainLinkEvolutionChainLink`**
(mapped from: EvolutionChainLinkEvolutionChainLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionChainLink | evolutionChainLink | long | | kotlin.Long | Primary Key | *one*
evolutionChainLink | evolutionChainLink | long | | kotlin.Long | Foreign Key | *many*



