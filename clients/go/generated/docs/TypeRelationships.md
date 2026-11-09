# TypeRelationships

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NoDamageTo** | [**[]TypeSummary**](TypeSummary.md) | A list of types this type has no effect on. | 
**HalfDamageTo** | [**[]TypeSummary**](TypeSummary.md) | A list of types this type is not very effect against. | 
**DoubleDamageTo** | [**[]TypeSummary**](TypeSummary.md) | A list of types this type is very effect against. | 
**NoDamageFrom** | [**[]TypeSummary**](TypeSummary.md) | A list of types that have no effect on this type. | 
**HalfDamageFrom** | [**[]TypeSummary**](TypeSummary.md) | A list of types that are not very effective against this type. | 
**DoubleDamageFrom** | [**[]TypeSummary**](TypeSummary.md) | A list of types that are very effective against this type. | 

## Methods

### NewTypeRelationships

`func NewTypeRelationships(noDamageTo []TypeSummary, halfDamageTo []TypeSummary, doubleDamageTo []TypeSummary, noDamageFrom []TypeSummary, halfDamageFrom []TypeSummary, doubleDamageFrom []TypeSummary, ) *TypeRelationships`

NewTypeRelationships instantiates a new TypeRelationships object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypeRelationshipsWithDefaults

`func NewTypeRelationshipsWithDefaults() *TypeRelationships`

NewTypeRelationshipsWithDefaults instantiates a new TypeRelationships object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNoDamageTo

`func (o *TypeRelationships) GetNoDamageTo() []TypeSummary`

GetNoDamageTo returns the NoDamageTo field if non-nil, zero value otherwise.

### GetNoDamageToOk

`func (o *TypeRelationships) GetNoDamageToOk() (*[]TypeSummary, bool)`

GetNoDamageToOk returns a tuple with the NoDamageTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoDamageTo

`func (o *TypeRelationships) SetNoDamageTo(v []TypeSummary)`

SetNoDamageTo sets NoDamageTo field to given value.


### GetHalfDamageTo

`func (o *TypeRelationships) GetHalfDamageTo() []TypeSummary`

GetHalfDamageTo returns the HalfDamageTo field if non-nil, zero value otherwise.

### GetHalfDamageToOk

`func (o *TypeRelationships) GetHalfDamageToOk() (*[]TypeSummary, bool)`

GetHalfDamageToOk returns a tuple with the HalfDamageTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHalfDamageTo

`func (o *TypeRelationships) SetHalfDamageTo(v []TypeSummary)`

SetHalfDamageTo sets HalfDamageTo field to given value.


### GetDoubleDamageTo

`func (o *TypeRelationships) GetDoubleDamageTo() []TypeSummary`

GetDoubleDamageTo returns the DoubleDamageTo field if non-nil, zero value otherwise.

### GetDoubleDamageToOk

`func (o *TypeRelationships) GetDoubleDamageToOk() (*[]TypeSummary, bool)`

GetDoubleDamageToOk returns a tuple with the DoubleDamageTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDoubleDamageTo

`func (o *TypeRelationships) SetDoubleDamageTo(v []TypeSummary)`

SetDoubleDamageTo sets DoubleDamageTo field to given value.


### GetNoDamageFrom

`func (o *TypeRelationships) GetNoDamageFrom() []TypeSummary`

GetNoDamageFrom returns the NoDamageFrom field if non-nil, zero value otherwise.

### GetNoDamageFromOk

`func (o *TypeRelationships) GetNoDamageFromOk() (*[]TypeSummary, bool)`

GetNoDamageFromOk returns a tuple with the NoDamageFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoDamageFrom

`func (o *TypeRelationships) SetNoDamageFrom(v []TypeSummary)`

SetNoDamageFrom sets NoDamageFrom field to given value.


### GetHalfDamageFrom

`func (o *TypeRelationships) GetHalfDamageFrom() []TypeSummary`

GetHalfDamageFrom returns the HalfDamageFrom field if non-nil, zero value otherwise.

### GetHalfDamageFromOk

`func (o *TypeRelationships) GetHalfDamageFromOk() (*[]TypeSummary, bool)`

GetHalfDamageFromOk returns a tuple with the HalfDamageFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHalfDamageFrom

`func (o *TypeRelationships) SetHalfDamageFrom(v []TypeSummary)`

SetHalfDamageFrom sets HalfDamageFrom field to given value.


### GetDoubleDamageFrom

`func (o *TypeRelationships) GetDoubleDamageFrom() []TypeSummary`

GetDoubleDamageFrom returns the DoubleDamageFrom field if non-nil, zero value otherwise.

### GetDoubleDamageFromOk

`func (o *TypeRelationships) GetDoubleDamageFromOk() (*[]TypeSummary, bool)`

GetDoubleDamageFromOk returns a tuple with the DoubleDamageFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDoubleDamageFrom

`func (o *TypeRelationships) SetDoubleDamageFrom(v []TypeSummary)`

SetDoubleDamageFrom sets DoubleDamageFrom field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


