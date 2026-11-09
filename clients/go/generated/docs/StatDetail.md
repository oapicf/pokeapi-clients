# StatDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**GameIndex** | **int32** | ID the games use for this stat. | 
**IsBattleOnly** | Pointer to **bool** | Whether this stat only exists within a battle. | [optional] 
**AffectingMoves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**AffectingNatures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**AffectingItems** | [**[]ItemSummary**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**Characteristics** | [**[]CharacteristicSummary**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**MoveDamageClass** | [**NullableMoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**Names** | [**[]StatName**](StatName.md) | The name of this resource listed in different languages. | [readonly] 

## Methods

### NewStatDetail

`func NewStatDetail(id int32, name string, gameIndex int32, affectingMoves StatAffectingMoves, affectingNatures StatAffectingNatures, affectingItems []ItemSummary, characteristics []CharacteristicSummary, moveDamageClass NullableMoveDamageClassSummary, names []StatName, ) *StatDetail`

NewStatDetail instantiates a new StatDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatDetailWithDefaults

`func NewStatDetailWithDefaults() *StatDetail`

NewStatDetailWithDefaults instantiates a new StatDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *StatDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *StatDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *StatDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *StatDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *StatDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *StatDetail) SetName(v string)`

SetName sets Name field to given value.


### GetGameIndex

`func (o *StatDetail) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *StatDetail) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *StatDetail) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.


### GetIsBattleOnly

`func (o *StatDetail) GetIsBattleOnly() bool`

GetIsBattleOnly returns the IsBattleOnly field if non-nil, zero value otherwise.

### GetIsBattleOnlyOk

`func (o *StatDetail) GetIsBattleOnlyOk() (*bool, bool)`

GetIsBattleOnlyOk returns a tuple with the IsBattleOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBattleOnly

`func (o *StatDetail) SetIsBattleOnly(v bool)`

SetIsBattleOnly sets IsBattleOnly field to given value.

### HasIsBattleOnly

`func (o *StatDetail) HasIsBattleOnly() bool`

HasIsBattleOnly returns a boolean if a field has been set.

### GetAffectingMoves

`func (o *StatDetail) GetAffectingMoves() StatAffectingMoves`

GetAffectingMoves returns the AffectingMoves field if non-nil, zero value otherwise.

### GetAffectingMovesOk

`func (o *StatDetail) GetAffectingMovesOk() (*StatAffectingMoves, bool)`

GetAffectingMovesOk returns a tuple with the AffectingMoves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingMoves

`func (o *StatDetail) SetAffectingMoves(v StatAffectingMoves)`

SetAffectingMoves sets AffectingMoves field to given value.


### GetAffectingNatures

`func (o *StatDetail) GetAffectingNatures() StatAffectingNatures`

GetAffectingNatures returns the AffectingNatures field if non-nil, zero value otherwise.

### GetAffectingNaturesOk

`func (o *StatDetail) GetAffectingNaturesOk() (*StatAffectingNatures, bool)`

GetAffectingNaturesOk returns a tuple with the AffectingNatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingNatures

`func (o *StatDetail) SetAffectingNatures(v StatAffectingNatures)`

SetAffectingNatures sets AffectingNatures field to given value.


### GetAffectingItems

`func (o *StatDetail) GetAffectingItems() []ItemSummary`

GetAffectingItems returns the AffectingItems field if non-nil, zero value otherwise.

### GetAffectingItemsOk

`func (o *StatDetail) GetAffectingItemsOk() (*[]ItemSummary, bool)`

GetAffectingItemsOk returns a tuple with the AffectingItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingItems

`func (o *StatDetail) SetAffectingItems(v []ItemSummary)`

SetAffectingItems sets AffectingItems field to given value.


### GetCharacteristics

`func (o *StatDetail) GetCharacteristics() []CharacteristicSummary`

GetCharacteristics returns the Characteristics field if non-nil, zero value otherwise.

### GetCharacteristicsOk

`func (o *StatDetail) GetCharacteristicsOk() (*[]CharacteristicSummary, bool)`

GetCharacteristicsOk returns a tuple with the Characteristics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharacteristics

`func (o *StatDetail) SetCharacteristics(v []CharacteristicSummary)`

SetCharacteristics sets Characteristics field to given value.


### GetMoveDamageClass

`func (o *StatDetail) GetMoveDamageClass() MoveDamageClassSummary`

GetMoveDamageClass returns the MoveDamageClass field if non-nil, zero value otherwise.

### GetMoveDamageClassOk

`func (o *StatDetail) GetMoveDamageClassOk() (*MoveDamageClassSummary, bool)`

GetMoveDamageClassOk returns a tuple with the MoveDamageClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveDamageClass

`func (o *StatDetail) SetMoveDamageClass(v MoveDamageClassSummary)`

SetMoveDamageClass sets MoveDamageClass field to given value.


### SetMoveDamageClassNil

`func (o *StatDetail) SetMoveDamageClassNil(b bool)`

 SetMoveDamageClassNil sets the value for MoveDamageClass to be an explicit nil

### UnsetMoveDamageClass
`func (o *StatDetail) UnsetMoveDamageClass()`

UnsetMoveDamageClass ensures that no value is present for MoveDamageClass, not even an explicit nil
### GetNames

`func (o *StatDetail) GetNames() []StatName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *StatDetail) GetNamesOk() (*[]StatName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *StatDetail) SetNames(v []StatName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


