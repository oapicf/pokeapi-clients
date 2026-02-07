# SuperContestEffectDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Appeal** | **int32** |  | 
**FlavorTextEntries** | [**[]SuperContestEffectFlavorText**](SuperContestEffectFlavorText.md) |  | 
**Moves** | [**[]MoveSummary**](MoveSummary.md) |  | 

## Methods

### NewSuperContestEffectDetail

`func NewSuperContestEffectDetail(id int32, appeal int32, flavorTextEntries []SuperContestEffectFlavorText, moves []MoveSummary, ) *SuperContestEffectDetail`

NewSuperContestEffectDetail instantiates a new SuperContestEffectDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSuperContestEffectDetailWithDefaults

`func NewSuperContestEffectDetailWithDefaults() *SuperContestEffectDetail`

NewSuperContestEffectDetailWithDefaults instantiates a new SuperContestEffectDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *SuperContestEffectDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *SuperContestEffectDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *SuperContestEffectDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetAppeal

`func (o *SuperContestEffectDetail) GetAppeal() int32`

GetAppeal returns the Appeal field if non-nil, zero value otherwise.

### GetAppealOk

`func (o *SuperContestEffectDetail) GetAppealOk() (*int32, bool)`

GetAppealOk returns a tuple with the Appeal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppeal

`func (o *SuperContestEffectDetail) SetAppeal(v int32)`

SetAppeal sets Appeal field to given value.


### GetFlavorTextEntries

`func (o *SuperContestEffectDetail) GetFlavorTextEntries() []SuperContestEffectFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *SuperContestEffectDetail) GetFlavorTextEntriesOk() (*[]SuperContestEffectFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *SuperContestEffectDetail) SetFlavorTextEntries(v []SuperContestEffectFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetMoves

`func (o *SuperContestEffectDetail) GetMoves() []MoveSummary`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *SuperContestEffectDetail) GetMovesOk() (*[]MoveSummary, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *SuperContestEffectDetail) SetMoves(v []MoveSummary)`

SetMoves sets Moves field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


