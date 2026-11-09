
# Table `TypePastRelationships`
(mapped from: TypePastRelationships)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced type had the listed damage relations |  [foreignkey]
**damageRelations** | damage_relations | long NOT NULL |  | [**TypeRelationships**](TypeRelationships.md) | The damage relations the referenced type had up to and including the listed generation |  [foreignkey]




