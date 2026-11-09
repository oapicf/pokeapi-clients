package models

type PokemonFormDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	Order *int32 `json:"order,omitempty"`

	// The order in which forms should be sorted within a species' forms.
	FormOrder *int32 `json:"form_order,omitempty"`

	// True for exactly one form used as the default for each Pokémon.
	IsDefault bool `json:"is_default,omitempty"`

	// Whether or not this form can only happen during battle.
	IsBattleOnly bool `json:"is_battle_only,omitempty"`

	// Whether or not this form requires mega evolution.
	IsMega bool `json:"is_mega,omitempty"`

	// The name of this form.
	FormName string `json:"form_name"`

	// The Pokémon that can take on this form.
	Pokemon PokemonSummary `json:"pokemon"`

	// A set of sprites used to depict this Pokémon form in the game.
	Sprites PokemonFormSprites `json:"sprites"`

	// The version group this Pokémon form was introduced in.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
	FormNames []PokemonFormName `json:"form_names"`

	// The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
	Names []PokemonFormName `json:"names"`

	// A list of details showing types this Pokémon form has.
	Types []PokemonFormType `json:"types"`

	// The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
	TriggerConditions []PokemonFormTriggerCondition `json:"trigger_conditions"`

	// The flavor text of this form listed in different languages and versions.
	FlavorTextEntries []PokemonFormFlavorText `json:"flavor_text_entries"`
}
