
# Table `PokemonFormTriggerCondition`
(mapped from: PokemonFormTriggerCondition)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**trigger** | trigger | text NOT NULL |  | **kotlin.String** | The trigger for this form change. | 
**name** | name | text |  | **kotlin.String** | The name of the required item, ability, or move. Only present for a resource-based trigger. |  [optional]
**url** | url | text |  | [**java.net.URI**](java.net.URI.md) | The URL of the required item, ability, or move. Only present for a resource-based trigger. |  [optional]
**baseForm** | base_form | long |  | [**PokemonFormSummary**](PokemonFormSummary.md) | The required base form. Only present when the trigger specifies one. |  [optional] [foreignkey]






