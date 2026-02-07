package models

type LocationAreaDetailEncounterMethodRatesInner struct {

	EncounterMethod AbilityDetailPokemonInnerPokemon `json:"encounter_method"`

	VersionDetails []LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner `json:"version_details"`
}
