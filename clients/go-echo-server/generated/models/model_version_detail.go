package models

// VersionDetail - Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
type VersionDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []VersionName `json:"names"`

	// The version group this version belongs to.
	VersionGroup VersionGroupSummary `json:"version_group"`
}
