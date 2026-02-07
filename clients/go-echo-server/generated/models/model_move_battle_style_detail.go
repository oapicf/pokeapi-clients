package models

type MoveBattleStyleDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []MoveBattleStyleName `json:"names"`
}
