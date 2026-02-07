# BerryFirmnessDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Berries** | [**[]BerrySummary**](BerrySummary.md) |  | 
**Names** | [**[]BerryFirmnessName**](BerryFirmnessName.md) |  | 

## Methods

### NewBerryFirmnessDetail

`func NewBerryFirmnessDetail(id int32, name string, berries []BerrySummary, names []BerryFirmnessName, ) *BerryFirmnessDetail`

NewBerryFirmnessDetail instantiates a new BerryFirmnessDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFirmnessDetailWithDefaults

`func NewBerryFirmnessDetailWithDefaults() *BerryFirmnessDetail`

NewBerryFirmnessDetailWithDefaults instantiates a new BerryFirmnessDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BerryFirmnessDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BerryFirmnessDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BerryFirmnessDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *BerryFirmnessDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BerryFirmnessDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BerryFirmnessDetail) SetName(v string)`

SetName sets Name field to given value.


### GetBerries

`func (o *BerryFirmnessDetail) GetBerries() []BerrySummary`

GetBerries returns the Berries field if non-nil, zero value otherwise.

### GetBerriesOk

`func (o *BerryFirmnessDetail) GetBerriesOk() (*[]BerrySummary, bool)`

GetBerriesOk returns a tuple with the Berries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerries

`func (o *BerryFirmnessDetail) SetBerries(v []BerrySummary)`

SetBerries sets Berries field to given value.


### GetNames

`func (o *BerryFirmnessDetail) GetNames() []BerryFirmnessName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *BerryFirmnessDetail) GetNamesOk() (*[]BerryFirmnessName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *BerryFirmnessDetail) SetNames(v []BerryFirmnessName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


