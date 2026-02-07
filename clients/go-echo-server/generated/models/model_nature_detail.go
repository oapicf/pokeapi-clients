package models

type NatureDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	DecreasedStat StatSummary `json:"decreased_stat"`

	IncreasedStat StatSummary `json:"increased_stat"`

	LikesFlavor BerryFlavorSummary `json:"likes_flavor"`

	HatesFlavor BerryFlavorSummary `json:"hates_flavor"`

	Berries []BerrySummary `json:"berries"`

	PokeathlonStatChanges []NatureDetailPokeathlonStatChangesInner `json:"pokeathlon_stat_changes"`

	MoveBattleStylePreferences []NatureBattleStylePreference `json:"move_battle_style_preferences"`

	Names []NatureName `json:"names"`
}
