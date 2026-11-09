# VersionGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Order** | Pointer to **NullableInt32** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**MoveLearnMethods** | [**[]MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**Pokedexes** | [**[]PokedexSummary**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**Regions** | [**[]RegionSummary**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**Versions** | [**[]VersionSummary**](VersionSummary.md) | The versions this version group owns. | [readonly] 

## Methods

### NewVersionGroupDetail

`func NewVersionGroupDetail(id int32, name string, generation GenerationSummary, moveLearnMethods []MoveLearnMethodSummary, pokedexes []PokedexSummary, regions []RegionSummary, versions []VersionSummary, ) *VersionGroupDetail`

NewVersionGroupDetail instantiates a new VersionGroupDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionGroupDetailWithDefaults

`func NewVersionGroupDetailWithDefaults() *VersionGroupDetail`

NewVersionGroupDetailWithDefaults instantiates a new VersionGroupDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VersionGroupDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VersionGroupDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VersionGroupDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *VersionGroupDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *VersionGroupDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *VersionGroupDetail) SetName(v string)`

SetName sets Name field to given value.


### GetOrder

`func (o *VersionGroupDetail) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *VersionGroupDetail) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *VersionGroupDetail) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *VersionGroupDetail) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *VersionGroupDetail) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *VersionGroupDetail) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil
### GetGeneration

`func (o *VersionGroupDetail) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *VersionGroupDetail) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *VersionGroupDetail) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetMoveLearnMethods

`func (o *VersionGroupDetail) GetMoveLearnMethods() []MoveLearnMethodSummary`

GetMoveLearnMethods returns the MoveLearnMethods field if non-nil, zero value otherwise.

### GetMoveLearnMethodsOk

`func (o *VersionGroupDetail) GetMoveLearnMethodsOk() (*[]MoveLearnMethodSummary, bool)`

GetMoveLearnMethodsOk returns a tuple with the MoveLearnMethods field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveLearnMethods

`func (o *VersionGroupDetail) SetMoveLearnMethods(v []MoveLearnMethodSummary)`

SetMoveLearnMethods sets MoveLearnMethods field to given value.


### GetPokedexes

`func (o *VersionGroupDetail) GetPokedexes() []PokedexSummary`

GetPokedexes returns the Pokedexes field if non-nil, zero value otherwise.

### GetPokedexesOk

`func (o *VersionGroupDetail) GetPokedexesOk() (*[]PokedexSummary, bool)`

GetPokedexesOk returns a tuple with the Pokedexes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexes

`func (o *VersionGroupDetail) SetPokedexes(v []PokedexSummary)`

SetPokedexes sets Pokedexes field to given value.


### GetRegions

`func (o *VersionGroupDetail) GetRegions() []RegionSummary`

GetRegions returns the Regions field if non-nil, zero value otherwise.

### GetRegionsOk

`func (o *VersionGroupDetail) GetRegionsOk() (*[]RegionSummary, bool)`

GetRegionsOk returns a tuple with the Regions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegions

`func (o *VersionGroupDetail) SetRegions(v []RegionSummary)`

SetRegions sets Regions field to given value.


### GetVersions

`func (o *VersionGroupDetail) GetVersions() []VersionSummary`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *VersionGroupDetail) GetVersionsOk() (*[]VersionSummary, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *VersionGroupDetail) SetVersions(v []VersionSummary)`

SetVersions sets Versions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


