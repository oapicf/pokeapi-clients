# CharacteristicDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`gene_modulo`** | **`Int64`** | The remainder of the highest stat/IV divided by 5. | [default to nothing]
**`possible_values`** | **`Vector{Int64}`** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] [default to nothing]
**`highest_stat`** | [**`*StatSummary`**](StatSummary.md) | The stat which results in this characteristic. | [default to nothing]
**`descriptions`** | [**`Vector{CharacteristicDescription}`**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


