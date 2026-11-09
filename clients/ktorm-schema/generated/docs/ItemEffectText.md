
# Table `ItemEffectText`
(mapped from: ItemEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**effect** | effect | text NOT NULL |  | **kotlin.String** | The localized effect text for an API resource in a specific language. | 
**shortEffect** | short_effect | text NOT NULL |  | **kotlin.String** | The localized effect text in brief. | 
**language** | language | long NOT NULL |  | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. |  [foreignkey]





