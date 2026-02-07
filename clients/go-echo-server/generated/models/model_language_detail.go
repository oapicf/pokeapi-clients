package models

type LanguageDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Official bool `json:"official,omitempty"`

	Iso639 string `json:"iso639"`

	Iso3166 string `json:"iso3166"`

	Names []LanguageName `json:"names"`
}
