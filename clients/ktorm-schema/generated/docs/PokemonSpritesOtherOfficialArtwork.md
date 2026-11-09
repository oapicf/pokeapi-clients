
# Table `PokemonSpritesOtherOfficialArtwork`
(mapped from: PokemonSpritesOtherOfficialArtwork)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**frontDefault** | front_default | text NOT NULL |  | **kotlin.String** | The URL of the default front official artwork, or null if unavailable. | 
**frontShiny** | front_shiny | text NOT NULL |  | **kotlin.String** | The URL of the shiny front official artwork, or null if unavailable. | 
**versions** | versions | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;&gt;** | Additional official artwork grouped by version. Available keys vary by resource. |  [optional]





