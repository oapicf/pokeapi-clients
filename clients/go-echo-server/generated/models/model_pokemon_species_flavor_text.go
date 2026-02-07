package models

type PokemonSpeciesFlavorText struct {

	FlavorText string `json:"flavor_text"`

	Language LanguageSummary `json:"language"`

	Version VersionSummary `json:"version"`
}
