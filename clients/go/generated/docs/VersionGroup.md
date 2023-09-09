# VersionGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**Order** | **int32** |  | 
**Generation** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**MoveLearnMethods** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 
**Pokedexes** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 
**Regions** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 
**Versions** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewVersionGroup

`func NewVersionGroup(id int32, name string, order int32, generation NamedAPIResource, moveLearnMethods []NamedAPIResource, pokedexes []NamedAPIResource, regions []NamedAPIResource, versions []NamedAPIResource, ) *VersionGroup`

NewVersionGroup instantiates a new VersionGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionGroupWithDefaults

`func NewVersionGroupWithDefaults() *VersionGroup`

NewVersionGroupWithDefaults instantiates a new VersionGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VersionGroup) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VersionGroup) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VersionGroup) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *VersionGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *VersionGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *VersionGroup) SetName(v string)`

SetName sets Name field to given value.


### GetOrder

`func (o *VersionGroup) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *VersionGroup) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *VersionGroup) SetOrder(v int32)`

SetOrder sets Order field to given value.


### GetGeneration

`func (o *VersionGroup) GetGeneration() NamedAPIResource`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *VersionGroup) GetGenerationOk() (*NamedAPIResource, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *VersionGroup) SetGeneration(v NamedAPIResource)`

SetGeneration sets Generation field to given value.


### GetMoveLearnMethods

`func (o *VersionGroup) GetMoveLearnMethods() []NamedAPIResource`

GetMoveLearnMethods returns the MoveLearnMethods field if non-nil, zero value otherwise.

### GetMoveLearnMethodsOk

`func (o *VersionGroup) GetMoveLearnMethodsOk() (*[]NamedAPIResource, bool)`

GetMoveLearnMethodsOk returns a tuple with the MoveLearnMethods field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveLearnMethods

`func (o *VersionGroup) SetMoveLearnMethods(v []NamedAPIResource)`

SetMoveLearnMethods sets MoveLearnMethods field to given value.


### GetPokedexes

`func (o *VersionGroup) GetPokedexes() []NamedAPIResource`

GetPokedexes returns the Pokedexes field if non-nil, zero value otherwise.

### GetPokedexesOk

`func (o *VersionGroup) GetPokedexesOk() (*[]NamedAPIResource, bool)`

GetPokedexesOk returns a tuple with the Pokedexes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexes

`func (o *VersionGroup) SetPokedexes(v []NamedAPIResource)`

SetPokedexes sets Pokedexes field to given value.


### GetRegions

`func (o *VersionGroup) GetRegions() []NamedAPIResource`

GetRegions returns the Regions field if non-nil, zero value otherwise.

### GetRegionsOk

`func (o *VersionGroup) GetRegionsOk() (*[]NamedAPIResource, bool)`

GetRegionsOk returns a tuple with the Regions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegions

`func (o *VersionGroup) SetRegions(v []NamedAPIResource)`

SetRegions sets Regions field to given value.


### GetVersions

`func (o *VersionGroup) GetVersions() []NamedAPIResource`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *VersionGroup) GetVersionsOk() (*[]NamedAPIResource, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *VersionGroup) SetVersions(v []NamedAPIResource)`

SetVersions sets Versions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


