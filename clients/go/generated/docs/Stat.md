# Stat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**GameIndex** | **int32** |  | 
**IsBattleOnly** | Pointer to **bool** |  | [optional] 
**AffectingMoves** | Pointer to [**MoveStatAffectSets**](MoveStatAffectSets.md) |  | [optional] 
**AffectingNatures** | Pointer to [**NatureStatAffectSets**](NatureStatAffectSets.md) |  | [optional] 

## Methods

### NewStat

`func NewStat(id int32, name string, gameIndex int32, ) *Stat`

NewStat instantiates a new Stat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatWithDefaults

`func NewStatWithDefaults() *Stat`

NewStatWithDefaults instantiates a new Stat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Stat) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Stat) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Stat) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Stat) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Stat) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Stat) SetName(v string)`

SetName sets Name field to given value.


### GetGameIndex

`func (o *Stat) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *Stat) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *Stat) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.


### GetIsBattleOnly

`func (o *Stat) GetIsBattleOnly() bool`

GetIsBattleOnly returns the IsBattleOnly field if non-nil, zero value otherwise.

### GetIsBattleOnlyOk

`func (o *Stat) GetIsBattleOnlyOk() (*bool, bool)`

GetIsBattleOnlyOk returns a tuple with the IsBattleOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBattleOnly

`func (o *Stat) SetIsBattleOnly(v bool)`

SetIsBattleOnly sets IsBattleOnly field to given value.

### HasIsBattleOnly

`func (o *Stat) HasIsBattleOnly() bool`

HasIsBattleOnly returns a boolean if a field has been set.

### GetAffectingMoves

`func (o *Stat) GetAffectingMoves() MoveStatAffectSets`

GetAffectingMoves returns the AffectingMoves field if non-nil, zero value otherwise.

### GetAffectingMovesOk

`func (o *Stat) GetAffectingMovesOk() (*MoveStatAffectSets, bool)`

GetAffectingMovesOk returns a tuple with the AffectingMoves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingMoves

`func (o *Stat) SetAffectingMoves(v MoveStatAffectSets)`

SetAffectingMoves sets AffectingMoves field to given value.

### HasAffectingMoves

`func (o *Stat) HasAffectingMoves() bool`

HasAffectingMoves returns a boolean if a field has been set.

### GetAffectingNatures

`func (o *Stat) GetAffectingNatures() NatureStatAffectSets`

GetAffectingNatures returns the AffectingNatures field if non-nil, zero value otherwise.

### GetAffectingNaturesOk

`func (o *Stat) GetAffectingNaturesOk() (*NatureStatAffectSets, bool)`

GetAffectingNaturesOk returns a tuple with the AffectingNatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingNatures

`func (o *Stat) SetAffectingNatures(v NatureStatAffectSets)`

SetAffectingNatures sets AffectingNatures field to given value.

### HasAffectingNatures

`func (o *Stat) HasAffectingNatures() bool`

HasAffectingNatures returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


