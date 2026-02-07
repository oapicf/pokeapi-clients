package models

type LocationAreaDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	GameIndex int32 `json:"game_index"`

	EncounterMethodRates []LocationAreaDetailEncounterMethodRatesInner `json:"encounter_method_rates"`

	Location LocationSummary `json:"location"`

	Names []LocationAreaName `json:"names"`

	PokemonEncounters []LocationAreaDetailPokemonEncountersInner `json:"pokemon_encounters"`
}
