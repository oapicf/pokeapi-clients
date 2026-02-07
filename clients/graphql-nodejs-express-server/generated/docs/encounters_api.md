# encounters_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionList**](encounters_api.md#EncounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**EncounterConditionRetrieve**](encounters_api.md#EncounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**EncounterConditionValueList**](encounters_api.md#EncounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**EncounterConditionValueRetrieve**](encounters_api.md#EncounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**EncounterMethodList**](encounters_api.md#EncounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**EncounterMethodRetrieve**](encounters_api.md#EncounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**PokemonEncountersRetrieve**](encounters_api.md#PokemonEncountersRetrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter


<a name="EncounterConditionList"></a>
# **EncounterConditionList**
> PaginatedEncounterConditionSummaryList EncounterConditionList(limit, offset, q)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.
<a name="EncounterConditionRetrieve"></a>
# **EncounterConditionRetrieve**
> EncounterConditionDetail EncounterConditionRetrieve(Id_)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.
<a name="EncounterConditionValueList"></a>
# **EncounterConditionValueList**
> PaginatedEncounterConditionValueSummaryList EncounterConditionValueList(limit, offset, q)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
<a name="EncounterConditionValueRetrieve"></a>
# **EncounterConditionValueRetrieve**
> EncounterConditionValueDetail EncounterConditionValueRetrieve(Id_)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
<a name="EncounterMethodList"></a>
# **EncounterMethodList**
> PaginatedEncounterMethodSummaryList EncounterMethodList(limit, offset, q)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
<a name="EncounterMethodRetrieve"></a>
# **EncounterMethodRetrieve**
> EncounterMethodDetail EncounterMethodRetrieve(Id_)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
<a name="PokemonEncountersRetrieve"></a>
# **PokemonEncountersRetrieve**
> PokemonEncountersRetrieve200ResponseInner PokemonEncountersRetrieve(pokemonId)

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.
