
# Table `PokemonSprites`
(mapped from: PokemonSprites)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**frontDefault** | front_default | text NOT NULL |  | **kotlin.String** | The default depiction of this Pokémon from the front in battle. | 
**frontShiny** | front_shiny | text NOT NULL |  | **kotlin.String** | The shiny depiction of this Pokémon from the front in battle. | 
**frontFemale** | front_female | text NOT NULL |  | **kotlin.String** | The female depiction of this Pokémon from the front in battle. | 
**frontShinyFemale** | front_shiny_female | text NOT NULL |  | **kotlin.String** | The shiny female depiction of this Pokémon from the front in battle. | 
**backDefault** | back_default | text NOT NULL |  | **kotlin.String** | The default depiction of this Pokémon from the back in battle. | 
**backShiny** | back_shiny | text NOT NULL |  | **kotlin.String** | The shiny depiction of this Pokémon from the back in battle. | 
**backFemale** | back_female | text NOT NULL |  | **kotlin.String** | The female depiction of this Pokémon from the back in battle. | 
**backShinyFemale** | back_shiny_female | text NOT NULL |  | **kotlin.String** | The shiny female depiction of this Pokémon from the back in battle. | 
**other** | other | long |  | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. |  [optional] [foreignkey]
**versions** | versions | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;&gt;** | Sprites grouped by generation and game. Available keys vary by resource. |  [optional]












