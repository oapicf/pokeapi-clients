package models

type AbilityDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// Whether or not this ability originated in the main series of the video games.
	IsMainSeries bool `json:"is_main_series,omitempty"`

	// The generation this ability originated in.
	Generation GenerationSummary `json:"generation"`

	// The name of this resource listed in different languages.
	Names []AbilityName `json:"names"`

	// The effect of this ability listed in different languages.
	EffectEntries []AbilityEffectText `json:"effect_entries"`

	// The list of previous effects this ability has had across version groups.
	EffectChanges []AbilityChange `json:"effect_changes"`

	// The flavor text of this ability listed in different languages.
	FlavorTextEntries []AbilityFlavorText `json:"flavor_text_entries"`

	// A list of Pokémon that could potentially have this ability.
	Pokemon []AbilityPokemonDetail `json:"pokemon"`
}
