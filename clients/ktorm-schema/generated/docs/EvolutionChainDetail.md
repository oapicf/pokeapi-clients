
# Table `EvolutionChainDetail`
(mapped from: EvolutionChainDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**babyTriggerItem** | baby_trigger_item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. |  [foreignkey]
**chain** | chain | long NOT NULL |  | [**EvolutionChainLink**](EvolutionChainLink.md) | The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. |  [readonly] [foreignkey]





