package models

type MoveDamageClassDescription struct {

	// The localized description for an API resource in a specific language.
	Description string `json:"description,omitempty"`

	// The language this name is in.
	Language LanguageSummary `json:"language"`
}
