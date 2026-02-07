package models

type GrowthRateDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}
