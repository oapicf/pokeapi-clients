package models

type AbilityChangeEffectText struct {

	// The localized effect text for an API resource in a specific language.
	Effect string `json:"effect"`

	// The language this effect is in.
	Language LanguageSummary `json:"language"`
}
