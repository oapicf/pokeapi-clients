# PalParkEncounterArea

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | Pointer to **int32** | The base score given to the player when the referenced Pokemon is caught during a pal park run. | [optional] 
**Rate** | Pointer to **int32** | The base rate for encountering the referenced Pokemon in this pal park area. | [optional] 
**Area** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewPalParkEncounterArea

`func NewPalParkEncounterArea() *PalParkEncounterArea`

NewPalParkEncounterArea instantiates a new PalParkEncounterArea object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPalParkEncounterAreaWithDefaults

`func NewPalParkEncounterAreaWithDefaults() *PalParkEncounterArea`

NewPalParkEncounterAreaWithDefaults instantiates a new PalParkEncounterArea object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseScore

`func (o *PalParkEncounterArea) GetBaseScore() int32`

GetBaseScore returns the BaseScore field if non-nil, zero value otherwise.

### GetBaseScoreOk

`func (o *PalParkEncounterArea) GetBaseScoreOk() (*int32, bool)`

GetBaseScoreOk returns a tuple with the BaseScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseScore

`func (o *PalParkEncounterArea) SetBaseScore(v int32)`

SetBaseScore sets BaseScore field to given value.

### HasBaseScore

`func (o *PalParkEncounterArea) HasBaseScore() bool`

HasBaseScore returns a boolean if a field has been set.

### GetRate

`func (o *PalParkEncounterArea) GetRate() int32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *PalParkEncounterArea) GetRateOk() (*int32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *PalParkEncounterArea) SetRate(v int32)`

SetRate sets Rate field to given value.

### HasRate

`func (o *PalParkEncounterArea) HasRate() bool`

HasRate returns a boolean if a field has been set.

### GetArea

`func (o *PalParkEncounterArea) GetArea() NamedAPIResource`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *PalParkEncounterArea) GetAreaOk() (*NamedAPIResource, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *PalParkEncounterArea) SetArea(v NamedAPIResource)`

SetArea sets Area field to given value.

### HasArea

`func (o *PalParkEncounterArea) HasArea() bool`

HasArea returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


