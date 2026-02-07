
# Table `EvolutionChainDetail`
(mapped from: EvolutionChainDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**babyTriggerItem** | baby_trigger_item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) |  |  [foreignkey]
**chain** | chain | long NOT NULL |  | [**EvolutionChainDetailChain**](EvolutionChainDetailChain.md) |  |  [foreignkey]





