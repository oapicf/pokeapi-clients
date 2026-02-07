package models

type PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner struct {

	EncounterDetails []PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner `json:"encounter_details"`

	MaxChance float32 `json:"max_chance"`

	Version PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion `json:"version"`
}
