# CHARACTERISTIC_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**gene_modulo** | **INTEGER_32** | The remainder of the highest stat/IV divided by 5. | [default to null]
**possible_values** | **LIST [INTEGER_32]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] [default to null]
**highest_stat** | [**STAT_SUMMARY**](StatSummary.md) | The stat which results in this characteristic. | [default to null]
**descriptions** | [**LIST [CHARACTERISTIC_DESCRIPTION]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


