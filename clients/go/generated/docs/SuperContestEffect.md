# SuperContestEffect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Appeal** | **int32** |  | 
**FlavorTextEntries** | [**[]FlavorText**](FlavorText.md) |  | 
**Moves** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewSuperContestEffect

`func NewSuperContestEffect(id int32, appeal int32, flavorTextEntries []FlavorText, moves []NamedAPIResource, ) *SuperContestEffect`

NewSuperContestEffect instantiates a new SuperContestEffect object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSuperContestEffectWithDefaults

`func NewSuperContestEffectWithDefaults() *SuperContestEffect`

NewSuperContestEffectWithDefaults instantiates a new SuperContestEffect object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *SuperContestEffect) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *SuperContestEffect) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *SuperContestEffect) SetId(v int32)`

SetId sets Id field to given value.


### GetAppeal

`func (o *SuperContestEffect) GetAppeal() int32`

GetAppeal returns the Appeal field if non-nil, zero value otherwise.

### GetAppealOk

`func (o *SuperContestEffect) GetAppealOk() (*int32, bool)`

GetAppealOk returns a tuple with the Appeal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppeal

`func (o *SuperContestEffect) SetAppeal(v int32)`

SetAppeal sets Appeal field to given value.


### GetFlavorTextEntries

`func (o *SuperContestEffect) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *SuperContestEffect) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *SuperContestEffect) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetMoves

`func (o *SuperContestEffect) GetMoves() []NamedAPIResource`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *SuperContestEffect) GetMovesOk() (*[]NamedAPIResource, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *SuperContestEffect) SetMoves(v []NamedAPIResource)`

SetMoves sets Moves field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


