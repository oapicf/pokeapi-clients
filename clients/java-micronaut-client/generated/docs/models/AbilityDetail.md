

# AbilityDetail

The class is defined in **[AbilityDetail.java](../../src/main/java/org/openapitools/model/AbilityDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**isMainSeries** | `Boolean` | Whether or not this ability originated in the main series of the video games. |  [optional property]
**generation** | [`GenerationSummary`](GenerationSummary.md) | The generation this ability originated in. | 
**names** | [`List&lt;AbilityName&gt;`](AbilityName.md) | The name of this resource listed in different languages. |  [readonly property]
**effectEntries** | [`List&lt;AbilityEffectText&gt;`](AbilityEffectText.md) | The effect of this ability listed in different languages. |  [readonly property]
**effectChanges** | [`List&lt;AbilityChange&gt;`](AbilityChange.md) | The list of previous effects this ability has had across version groups. |  [readonly property]
**flavorTextEntries** | [`List&lt;AbilityFlavorText&gt;`](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. |  [readonly property]
**pokemon** | [`List&lt;AbilityPokemonDetail&gt;`](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. |  [readonly property]











