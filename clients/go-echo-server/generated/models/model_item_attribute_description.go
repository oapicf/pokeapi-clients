package models

type ItemAttributeDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}
