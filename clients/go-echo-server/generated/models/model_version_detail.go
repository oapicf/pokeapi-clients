package models

// VersionDetail - Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
type VersionDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []VersionName `json:"names"`

	VersionGroup VersionGroupSummary `json:"version_group"`
}
