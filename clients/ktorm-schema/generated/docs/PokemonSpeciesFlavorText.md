
# Table `PokemonSpeciesFlavorText`
(mapped from: PokemonSpeciesFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**flavorText** | flavor_text | text NOT NULL |  | **kotlin.String** | The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more.  | 
**language** | language | long NOT NULL |  | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  [foreignkey]
**version** | version | long NOT NULL |  | [**VersionSummary**](VersionSummary.md) | The game version this flavor text is extracted from. |  [foreignkey]





