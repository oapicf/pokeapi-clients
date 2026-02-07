# BerryFlavorDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Berries** | [**[]BerryFlavorDetailBerriesInner**](BerryFlavorDetailBerriesInner.md) |  | 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**Names** | [**[]BerryFlavorName**](BerryFlavorName.md) |  | 

## Methods

### NewBerryFlavorDetail

`func NewBerryFlavorDetail(id int32, name string, berries []BerryFlavorDetailBerriesInner, contestType ContestTypeSummary, names []BerryFlavorName, ) *BerryFlavorDetail`

NewBerryFlavorDetail instantiates a new BerryFlavorDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFlavorDetailWithDefaults

`func NewBerryFlavorDetailWithDefaults() *BerryFlavorDetail`

NewBerryFlavorDetailWithDefaults instantiates a new BerryFlavorDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BerryFlavorDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BerryFlavorDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BerryFlavorDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *BerryFlavorDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BerryFlavorDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BerryFlavorDetail) SetName(v string)`

SetName sets Name field to given value.


### GetBerries

`func (o *BerryFlavorDetail) GetBerries() []BerryFlavorDetailBerriesInner`

GetBerries returns the Berries field if non-nil, zero value otherwise.

### GetBerriesOk

`func (o *BerryFlavorDetail) GetBerriesOk() (*[]BerryFlavorDetailBerriesInner, bool)`

GetBerriesOk returns a tuple with the Berries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerries

`func (o *BerryFlavorDetail) SetBerries(v []BerryFlavorDetailBerriesInner)`

SetBerries sets Berries field to given value.


### GetContestType

`func (o *BerryFlavorDetail) GetContestType() ContestTypeSummary`

GetContestType returns the ContestType field if non-nil, zero value otherwise.

### GetContestTypeOk

`func (o *BerryFlavorDetail) GetContestTypeOk() (*ContestTypeSummary, bool)`

GetContestTypeOk returns a tuple with the ContestType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestType

`func (o *BerryFlavorDetail) SetContestType(v ContestTypeSummary)`

SetContestType sets ContestType field to given value.


### GetNames

`func (o *BerryFlavorDetail) GetNames() []BerryFlavorName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *BerryFlavorDetail) GetNamesOk() (*[]BerryFlavorName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *BerryFlavorDetail) SetNames(v []BerryFlavorName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


