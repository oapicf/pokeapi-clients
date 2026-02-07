
# Table `LocationAreaDetail_encounter_method_rates_inner`
(mapped from: LocationAreaDetailEncounterMethodRatesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**encounterMethod** | encounter_method | long NOT NULL |  | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  |  [foreignkey]
**versionDetails** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner&gt;**](LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.md) |  | 



# **Table `LocationAreaDetailEncounterMethodRatesInnerLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner`**
(mapped from: LocationAreaDetailEncounterMethodRatesInnerLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationAreaDetailEncounterMethodRatesInner | locationAreaDetailEncounterMethodRatesInner | long | | kotlin.Long | Primary Key | *one*
locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner | locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner | long | | kotlin.Long | Foreign Key | *many*



