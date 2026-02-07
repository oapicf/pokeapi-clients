
# Table `EvolutionChainDetail_chain`
(mapped from: EvolutionChainDetailChain)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**evolutionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**evolvesTo** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionChainDetailChainEvolvesToInner&gt;**](EvolutionChainDetailChainEvolvesToInner.md) |  | 
**isBaby** | is_baby | boolean NOT NULL |  | **kotlin.Boolean** |  | 
**species** | species | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]


# **Table `EvolutionChainDetailChainEvolutionDetails`**
(mapped from: EvolutionChainDetailChainEvolutionDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionChainDetailChain | evolutionChainDetailChain | long | | kotlin.Long | Primary Key | *one*
evolutionDetails | evolutionDetails | blob | | kotlin.Any | Foreign Key | *many*



# **Table `EvolutionChainDetailChainEvolutionChainDetailChainEvolvesToInner`**
(mapped from: EvolutionChainDetailChainEvolutionChainDetailChainEvolvesToInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionChainDetailChain | evolutionChainDetailChain | long | | kotlin.Long | Primary Key | *one*
evolutionChainDetailChainEvolvesToInner | evolutionChainDetailChainEvolvesToInner | long | | kotlin.Long | Foreign Key | *many*





