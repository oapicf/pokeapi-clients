# Location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Region** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) |  | [optional] 
**GameIndices** | Pointer to [**[]GenerationGameIndex**](GenerationGameIndex.md) |  | [optional] 
**Areas** | Pointer to [**[]NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewLocation

`func NewLocation() *Location`

NewLocation instantiates a new Location object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationWithDefaults

`func NewLocationWithDefaults() *Location`

NewLocationWithDefaults instantiates a new Location object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Location) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Location) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Location) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Location) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Location) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Location) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Location) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Location) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRegion

`func (o *Location) GetRegion() NamedAPIResource`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *Location) GetRegionOk() (*NamedAPIResource, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *Location) SetRegion(v NamedAPIResource)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *Location) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetNames

`func (o *Location) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Location) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Location) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *Location) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetGameIndices

`func (o *Location) GetGameIndices() []GenerationGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *Location) GetGameIndicesOk() (*[]GenerationGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *Location) SetGameIndices(v []GenerationGameIndex)`

SetGameIndices sets GameIndices field to given value.

### HasGameIndices

`func (o *Location) HasGameIndices() bool`

HasGameIndices returns a boolean if a field has been set.

### GetAreas

`func (o *Location) GetAreas() []NamedAPIResource`

GetAreas returns the Areas field if non-nil, zero value otherwise.

### GetAreasOk

`func (o *Location) GetAreasOk() (*[]NamedAPIResource, bool)`

GetAreasOk returns a tuple with the Areas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreas

`func (o *Location) SetAreas(v []NamedAPIResource)`

SetAreas sets Areas field to given value.

### HasAreas

`func (o *Location) HasAreas() bool`

HasAreas returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


