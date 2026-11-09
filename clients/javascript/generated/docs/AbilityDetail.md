# PokeapiClient.AbilityDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**isMainSeries** | **Boolean** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [**[AbilityName]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effectEntries** | [**[AbilityEffectText]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effectChanges** | [**[AbilityChange]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavorTextEntries** | [**[AbilityFlavorText]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**[AbilityPokemonDetail]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 


