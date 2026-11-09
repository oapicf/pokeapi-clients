# StatAffectingMoves

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**[]MoveStatChange**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 
**Decrease** | [**[]MoveStatChange**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 

## Methods

### NewStatAffectingMoves

`func NewStatAffectingMoves(increase []MoveStatChange, decrease []MoveStatChange, ) *StatAffectingMoves`

NewStatAffectingMoves instantiates a new StatAffectingMoves object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatAffectingMovesWithDefaults

`func NewStatAffectingMovesWithDefaults() *StatAffectingMoves`

NewStatAffectingMovesWithDefaults instantiates a new StatAffectingMoves object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncrease

`func (o *StatAffectingMoves) GetIncrease() []MoveStatChange`

GetIncrease returns the Increase field if non-nil, zero value otherwise.

### GetIncreaseOk

`func (o *StatAffectingMoves) GetIncreaseOk() (*[]MoveStatChange, bool)`

GetIncreaseOk returns a tuple with the Increase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncrease

`func (o *StatAffectingMoves) SetIncrease(v []MoveStatChange)`

SetIncrease sets Increase field to given value.


### GetDecrease

`func (o *StatAffectingMoves) GetDecrease() []MoveStatChange`

GetDecrease returns the Decrease field if non-nil, zero value otherwise.

### GetDecreaseOk

`func (o *StatAffectingMoves) GetDecreaseOk() (*[]MoveStatChange, bool)`

GetDecreaseOk returns a tuple with the Decrease field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecrease

`func (o *StatAffectingMoves) SetDecrease(v []MoveStatChange)`

SetDecrease sets Decrease field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


