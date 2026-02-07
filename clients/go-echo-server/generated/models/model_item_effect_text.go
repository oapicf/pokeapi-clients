package models

type ItemEffectText struct {

	Effect string `json:"effect"`

	ShortEffect string `json:"short_effect"`

	Language LanguageSummary `json:"language"`
}
