package models

type PokemonSpeciesDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Order *int32 `json:"order,omitempty"`

	GenderRate *int32 `json:"gender_rate,omitempty"`

	CaptureRate *int32 `json:"capture_rate,omitempty"`

	BaseHappiness *int32 `json:"base_happiness,omitempty"`

	IsBaby bool `json:"is_baby,omitempty"`

	IsLegendary bool `json:"is_legendary,omitempty"`

	IsMythical bool `json:"is_mythical,omitempty"`

	HatchCounter *int32 `json:"hatch_counter,omitempty"`

	HasGenderDifferences bool `json:"has_gender_differences,omitempty"`

	FormsSwitchable bool `json:"forms_switchable,omitempty"`

	GrowthRate GrowthRateSummary `json:"growth_rate"`

	PokedexNumbers []PokemonDexEntry `json:"pokedex_numbers"`

	EggGroups []AbilityDetailPokemonInnerPokemon `json:"egg_groups"`

	Color PokemonColorSummary `json:"color"`

	Shape PokemonShapeSummary `json:"shape"`

	EvolvesFromSpecies PokemonSpeciesSummary `json:"evolves_from_species"`

	EvolutionChain EvolutionChainSummary `json:"evolution_chain"`

	Habitat PokemonHabitatSummary `json:"habitat"`

	Generation GenerationSummary `json:"generation"`

	Names []PokemonFormDetailFormNamesInner `json:"names"`

	PalParkEncounters []PokemonSpeciesDetailPalParkEncountersInner `json:"pal_park_encounters"`

	FormDescriptions []PokemonSpeciesDescription `json:"form_descriptions"`

	FlavorTextEntries []PokemonSpeciesFlavorText `json:"flavor_text_entries"`

	Genera []PokemonSpeciesDetailGeneraInner `json:"genera"`

	Varieties []PokemonSpeciesDetailVarietiesInner `json:"varieties"`
}
