package models

type MachineDetail struct {

	Id int32 `json:"id"`

	Item ItemSummary `json:"item"`

	VersionGroup VersionGroupSummary `json:"version_group"`

	Move MoveSummary `json:"move"`
}
