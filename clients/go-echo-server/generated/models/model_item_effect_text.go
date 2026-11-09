package models

type ItemEffectText struct {

	// The localized effect text for an API resource in a specific language.
	Effect string `json:"effect"`

	// The localized effect text in brief.
	ShortEffect string `json:"short_effect"`

	// The language this effect is in.
	Language LanguageSummary `json:"language"`
}
