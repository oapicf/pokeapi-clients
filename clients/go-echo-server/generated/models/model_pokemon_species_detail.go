package models

type PokemonSpeciesDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
	Order *int32 `json:"order,omitempty"`

	// The chance of this Pokémon being female, in eighths; or -1 for genderless.
	GenderRate *int32 `json:"gender_rate,omitempty"`

	// The base capture rate; up to 255. The higher the number, the easier the catch.
	CaptureRate *int32 `json:"capture_rate,omitempty"`

	// The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
	BaseHappiness *int32 `json:"base_happiness,omitempty"`

	// Whether or not this is a baby Pokémon.
	IsBaby bool `json:"is_baby,omitempty"`

	// Whether or not this is a legendary Pokémon.
	IsLegendary bool `json:"is_legendary,omitempty"`

	// Whether or not this is a mythical Pokémon.
	IsMythical bool `json:"is_mythical,omitempty"`

	// Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
	HatchCounter *int32 `json:"hatch_counter,omitempty"`

	// Whether or not this Pokémon has visual gender differences.
	HasGenderDifferences bool `json:"has_gender_differences,omitempty"`

	// Whether or not this Pokémon has multiple forms and can switch between them.
	FormsSwitchable bool `json:"forms_switchable,omitempty"`

	// The rate at which this Pokémon species gains levels.
	GrowthRate GrowthRateSummary `json:"growth_rate"`

	// A list of Pokedexes and the indexes reserved within them for this Pokémon species.
	PokedexNumbers []PokemonDexEntry `json:"pokedex_numbers"`

	// A list of egg groups this Pokémon species is a member of.
	EggGroups []EggGroupSummary `json:"egg_groups"`

	// The color of this Pokémon for Pokédex search.
	Color PokemonColorSummary `json:"color"`

	// The shape of this Pokémon for Pokédex search.
	Shape PokemonShapeSummary `json:"shape"`

	// The Pokémon species that evolves into this Pokemon_species.
	EvolvesFromSpecies *PokemonSpeciesSummary `json:"evolves_from_species"`

	// The evolution chain this Pokémon species is a member of.
	EvolutionChain EvolutionChainSummary `json:"evolution_chain"`

	// The habitat this Pokémon species can be encountered in.
	Habitat *PokemonHabitatSummary `json:"habitat"`

	// The generation this Pokémon species was introduced in.
	Generation GenerationSummary `json:"generation"`

	// The name of this resource listed in different languages.
	Names []PokemonSpeciesName `json:"names"`

	// A list of encounters that can be had with this Pokémon species in pal park.
	PalParkEncounters []PokemonSpeciesPalParkEncounter `json:"pal_park_encounters"`

	// Descriptions of different forms Pokémon take on within the Pokémon species.
	FormDescriptions []PokemonSpeciesDescription `json:"form_descriptions"`

	// A list of flavor text entries for this Pokémon species.
	FlavorTextEntries []PokemonSpeciesFlavorText `json:"flavor_text_entries"`

	// The genus of this Pokémon species listed in multiple languages.
	Genera []PokemonSpeciesGenus `json:"genera"`

	// A list of the Pokémon that exist within this Pokémon species.
	Varieties []PokemonSpeciesVariety `json:"varieties"`
}
