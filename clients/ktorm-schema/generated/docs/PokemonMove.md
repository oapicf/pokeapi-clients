
# Table `PokemonMove`
(mapped from: PokemonMove)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**move** | move | long NOT NULL |  | [**MoveSummary**](MoveSummary.md) | The move the Pokémon can learn. |  [foreignkey]
**versionGroupDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonMoveVersionGroup&gt;**](PokemonMoveVersionGroup.md) | The details of the version in which the Pokémon can learn the move. | 



# **Table `PokemonMovePokemonMoveVersionGroup`**
(mapped from: PokemonMovePokemonMoveVersionGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokemonMove | pokemonMove | long | | kotlin.Long | Primary Key | *one*
pokemonMoveVersionGroup | pokemonMoveVersionGroup | long | | kotlin.Long | Foreign Key | *many*



