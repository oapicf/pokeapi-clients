
# Table `EvolutionChainDetail_chain_evolves_to_inner`
(mapped from: EvolutionChainDetailChainEvolvesToInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**evolutionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner&gt;**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.md) |  | 
**isBaby** | is_baby | boolean NOT NULL |  | **kotlin.Boolean** |  | 
**species** | species | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]


# **Table `EvolutionChainDetailChainEvolvesToInnerEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner`**
(mapped from: EvolutionChainDetailChainEvolvesToInnerEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionChainDetailChainEvolvesToInner | evolutionChainDetailChainEvolvesToInner | long | | kotlin.Long | Primary Key | *one*
evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner | evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner | long | | kotlin.Long | Foreign Key | *many*





