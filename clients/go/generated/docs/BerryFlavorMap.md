# BerryFlavorMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Potency** | **int32** | How powerful the referenced flavor is for this berry | 
**Flavor** | [**BerryFlavor**](BerryFlavor.md) |  | 

## Methods

### NewBerryFlavorMap

`func NewBerryFlavorMap(potency int32, flavor BerryFlavor, ) *BerryFlavorMap`

NewBerryFlavorMap instantiates a new BerryFlavorMap object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFlavorMapWithDefaults

`func NewBerryFlavorMapWithDefaults() *BerryFlavorMap`

NewBerryFlavorMapWithDefaults instantiates a new BerryFlavorMap object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPotency

`func (o *BerryFlavorMap) GetPotency() int32`

GetPotency returns the Potency field if non-nil, zero value otherwise.

### GetPotencyOk

`func (o *BerryFlavorMap) GetPotencyOk() (*int32, bool)`

GetPotencyOk returns a tuple with the Potency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPotency

`func (o *BerryFlavorMap) SetPotency(v int32)`

SetPotency sets Potency field to given value.


### GetFlavor

`func (o *BerryFlavorMap) GetFlavor() BerryFlavor`

GetFlavor returns the Flavor field if non-nil, zero value otherwise.

### GetFlavorOk

`func (o *BerryFlavorMap) GetFlavorOk() (*BerryFlavor, bool)`

GetFlavorOk returns a tuple with the Flavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavor

`func (o *BerryFlavorMap) SetFlavor(v BerryFlavor)`

SetFlavor sets Flavor field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


