# LocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Region** | [**RegionSummary**](RegionSummary.md) |  | 
**Names** | [**[]LocationName**](LocationName.md) |  | 
**GameIndices** | [**[]LocationGameIndex**](LocationGameIndex.md) |  | 
**Areas** | [**[]LocationAreaSummary**](LocationAreaSummary.md) |  | 

## Methods

### NewLocationDetail

`func NewLocationDetail(id int32, name string, region RegionSummary, names []LocationName, gameIndices []LocationGameIndex, areas []LocationAreaSummary, ) *LocationDetail`

NewLocationDetail instantiates a new LocationDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationDetailWithDefaults

`func NewLocationDetailWithDefaults() *LocationDetail`

NewLocationDetailWithDefaults instantiates a new LocationDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LocationDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LocationDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LocationDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *LocationDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocationDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocationDetail) SetName(v string)`

SetName sets Name field to given value.


### GetRegion

`func (o *LocationDetail) GetRegion() RegionSummary`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *LocationDetail) GetRegionOk() (*RegionSummary, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *LocationDetail) SetRegion(v RegionSummary)`

SetRegion sets Region field to given value.


### GetNames

`func (o *LocationDetail) GetNames() []LocationName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *LocationDetail) GetNamesOk() (*[]LocationName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *LocationDetail) SetNames(v []LocationName)`

SetNames sets Names field to given value.


### GetGameIndices

`func (o *LocationDetail) GetGameIndices() []LocationGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *LocationDetail) GetGameIndicesOk() (*[]LocationGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *LocationDetail) SetGameIndices(v []LocationGameIndex)`

SetGameIndices sets GameIndices field to given value.


### GetAreas

`func (o *LocationDetail) GetAreas() []LocationAreaSummary`

GetAreas returns the Areas field if non-nil, zero value otherwise.

### GetAreasOk

`func (o *LocationDetail) GetAreasOk() (*[]LocationAreaSummary, bool)`

GetAreasOk returns a tuple with the Areas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreas

`func (o *LocationDetail) SetAreas(v []LocationAreaSummary)`

SetAreas sets Areas field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


