

# GrowthRateDetail

The class is defined in **[GrowthRateDetail.java](../../src/main/java/org/openapitools/model/GrowthRateDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**formula** | `String` | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [`List&lt;GrowthRateDescription&gt;`](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. |  [readonly property]
**levels** | [`List&lt;Experience&gt;`](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. |  [readonly property]
**pokemonSpecies** | [`List&lt;PokemonSpeciesSummary&gt;`](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. |  [readonly property]








