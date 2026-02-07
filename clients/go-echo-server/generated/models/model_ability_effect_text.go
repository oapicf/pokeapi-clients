package models

type AbilityEffectText struct {

	Effect string `json:"effect"`

	ShortEffect string `json:"short_effect"`

	Language LanguageSummary `json:"language"`
}
