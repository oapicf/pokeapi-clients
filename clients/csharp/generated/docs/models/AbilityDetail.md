# Org.OpenAPITools.Model.AbilityDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**Names** | [**List&lt;AbilityName&gt;**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**EffectEntries** | [**List&lt;AbilityEffectText&gt;**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**EffectChanges** | [**List&lt;AbilityChange&gt;**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**FlavorTextEntries** | [**List&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**Pokemon** | [**List&lt;AbilityPokemonDetail&gt;**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 
**IsMainSeries** | **bool** | Whether or not this ability originated in the main series of the video games. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

