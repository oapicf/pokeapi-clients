# BerryFlavor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this berry flavor resource | 
**Name** | **string** | The name for this berry flavor resource | 
**Berries** | Pointer to [**[]BerryFlavorMap**](BerryFlavorMap.md) | A list of the berries with this flavor | [optional] 

## Methods

### NewBerryFlavor

`func NewBerryFlavor(id int32, name string, ) *BerryFlavor`

NewBerryFlavor instantiates a new BerryFlavor object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFlavorWithDefaults

`func NewBerryFlavorWithDefaults() *BerryFlavor`

NewBerryFlavorWithDefaults instantiates a new BerryFlavor object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BerryFlavor) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BerryFlavor) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BerryFlavor) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *BerryFlavor) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BerryFlavor) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BerryFlavor) SetName(v string)`

SetName sets Name field to given value.


### GetBerries

`func (o *BerryFlavor) GetBerries() []BerryFlavorMap`

GetBerries returns the Berries field if non-nil, zero value otherwise.

### GetBerriesOk

`func (o *BerryFlavor) GetBerriesOk() (*[]BerryFlavorMap, bool)`

GetBerriesOk returns a tuple with the Berries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerries

`func (o *BerryFlavor) SetBerries(v []BerryFlavorMap)`

SetBerries sets Berries field to given value.

### HasBerries

`func (o *BerryFlavor) HasBerries() bool`

HasBerries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


