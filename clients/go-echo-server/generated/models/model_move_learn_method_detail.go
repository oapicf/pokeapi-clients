package models

type MoveLearnMethodDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []MoveLearnMethodName `json:"names"`

	// The description of this resource listed in different languages.
	Descriptions []MoveLearnMethodDescription `json:"descriptions"`

	// A list of version groups where moves can be learned through this method.
	VersionGroups []VersionGroupSummary `json:"version_groups"`
}
