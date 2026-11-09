package models

type LanguageDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// Whether or not the games are published in this language.
	Official bool `json:"official,omitempty"`

	// The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
	Iso639 string `json:"iso639"`

	// The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
	Iso3166 string `json:"iso3166"`

	// The name of this resource listed in different languages.
	Names []LanguageName `json:"names"`
}
