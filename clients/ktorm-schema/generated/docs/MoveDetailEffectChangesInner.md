
# Table `MoveDetail_effect_changes_inner`
(mapped from: MoveDetailEffectChangesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDetailEffectChangesInnerEffectEntriesInner&gt;**](MoveDetailEffectChangesInnerEffectEntriesInner.md) |  | 
**versionGroup** | version_group | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]


# **Table `MoveDetailEffectChangesInnerMoveDetailEffectChangesInnerEffectEntriesInner`**
(mapped from: MoveDetailEffectChangesInnerMoveDetailEffectChangesInnerEffectEntriesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetailEffectChangesInner | moveDetailEffectChangesInner | long | | kotlin.Long | Primary Key | *one*
moveDetailEffectChangesInnerEffectEntriesInner | moveDetailEffectChangesInnerEffectEntriesInner | long | | kotlin.Long | Foreign Key | *many*




