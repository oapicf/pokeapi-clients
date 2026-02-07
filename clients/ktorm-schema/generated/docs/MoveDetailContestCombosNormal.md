
# Table `MoveDetail_contest_combos_normal`
(mapped from: MoveDetailContestCombosNormal)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**useBefore** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**useAfter** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 


# **Table `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetailContestCombosNormal | moveDetailContestCombosNormal | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetailContestCombosNormal | moveDetailContestCombosNormal | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



