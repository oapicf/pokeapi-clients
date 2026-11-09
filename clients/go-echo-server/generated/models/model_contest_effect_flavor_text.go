package models

type ContestEffectFlavorText struct {

	// The localized flavor text for an API resource in a specific language.
	FlavorText string `json:"flavor_text"`

	// The language this name is in.
	Language LanguageSummary `json:"language"`
}
