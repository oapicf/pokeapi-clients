# BerryFlavorBerryMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Potency** | **int32** | How powerful the referenced flavor is for this berry. | 
**Berry** | [**BerrySummary**](BerrySummary.md) | The berry with the referenced flavor. | 

## Methods

### NewBerryFlavorBerryMap

`func NewBerryFlavorBerryMap(potency int32, berry BerrySummary, ) *BerryFlavorBerryMap`

NewBerryFlavorBerryMap instantiates a new BerryFlavorBerryMap object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFlavorBerryMapWithDefaults

`func NewBerryFlavorBerryMapWithDefaults() *BerryFlavorBerryMap`

NewBerryFlavorBerryMapWithDefaults instantiates a new BerryFlavorBerryMap object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPotency

`func (o *BerryFlavorBerryMap) GetPotency() int32`

GetPotency returns the Potency field if non-nil, zero value otherwise.

### GetPotencyOk

`func (o *BerryFlavorBerryMap) GetPotencyOk() (*int32, bool)`

GetPotencyOk returns a tuple with the Potency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPotency

`func (o *BerryFlavorBerryMap) SetPotency(v int32)`

SetPotency sets Potency field to given value.


### GetBerry

`func (o *BerryFlavorBerryMap) GetBerry() BerrySummary`

GetBerry returns the Berry field if non-nil, zero value otherwise.

### GetBerryOk

`func (o *BerryFlavorBerryMap) GetBerryOk() (*BerrySummary, bool)`

GetBerryOk returns a tuple with the Berry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerry

`func (o *BerryFlavorBerryMap) SetBerry(v BerrySummary)`

SetBerry sets Berry field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


