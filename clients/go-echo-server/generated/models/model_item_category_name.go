package models

type ItemCategoryName struct {

	// The localized name for an API resource in a specific language.
	Name string `json:"name"`

	// The language this name is in.
	Language LanguageSummary `json:"language"`
}
