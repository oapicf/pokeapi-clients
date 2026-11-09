

# AbilityDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The identifier for this resource. |  [readonly] |
|**name** | **String** | The name for this resource. |  |
|**isMainSeries** | **Boolean** | Whether or not this ability originated in the main series of the video games. |  [optional] |
|**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. |  |
|**names** | [**List&lt;AbilityName&gt;**](AbilityName.md) | The name of this resource listed in different languages. |  [readonly] |
|**effectEntries** | [**List&lt;AbilityEffectText&gt;**](AbilityEffectText.md) | The effect of this ability listed in different languages. |  [readonly] |
|**effectChanges** | [**List&lt;AbilityChange&gt;**](AbilityChange.md) | The list of previous effects this ability has had across version groups. |  [readonly] |
|**flavorTextEntries** | [**List&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. |  [readonly] |
|**pokemon** | [**List&lt;AbilityPokemonDetail&gt;**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. |  [readonly] |



