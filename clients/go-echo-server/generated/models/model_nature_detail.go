package models

type NatureDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The stat decreased by 10% in Pokémon with this nature.
	DecreasedStat *StatSummary `json:"decreased_stat"`

	// The stat increased by 10% in Pokémon with this nature.
	IncreasedStat *StatSummary `json:"increased_stat"`

	// The flavor liked by Pokémon with this nature.
	LikesFlavor *BerryFlavorSummary `json:"likes_flavor"`

	// The flavor hated by Pokémon with this nature.
	HatesFlavor *BerryFlavorSummary `json:"hates_flavor"`

	// A list of Pokéathlon stats this nature effects and how much it effects them.
	PokeathlonStatChanges []NaturePokeathlonStat `json:"pokeathlon_stat_changes"`

	// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	MoveBattleStylePreferences []NatureBattleStylePreference `json:"move_battle_style_preferences"`

	// The name of this resource listed in different languages.
	Names []NatureName `json:"names"`
}
