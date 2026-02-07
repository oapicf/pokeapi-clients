package models

type PokemonFormDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Order *int32 `json:"order,omitempty"`

	FormOrder *int32 `json:"form_order,omitempty"`

	IsDefault bool `json:"is_default,omitempty"`

	IsBattleOnly bool `json:"is_battle_only,omitempty"`

	IsMega bool `json:"is_mega,omitempty"`

	FormName string `json:"form_name"`

	Pokemon PokemonSummary `json:"pokemon"`

	Sprites PokemonFormDetailSprites `json:"sprites"`

	VersionGroup VersionGroupSummary `json:"version_group"`

	FormNames []PokemonFormDetailFormNamesInner `json:"form_names"`

	Names []PokemonFormDetailFormNamesInner `json:"names"`

	Types []PokemonDetailTypesInner `json:"types"`
}
