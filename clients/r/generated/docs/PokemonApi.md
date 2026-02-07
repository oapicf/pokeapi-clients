# PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AbilityList**](PokemonApi.md#AbilityList) | **GET** /api/v2/ability/ | 
[**AbilityRetrieve**](PokemonApi.md#AbilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**CharacteristicList**](PokemonApi.md#CharacteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**CharacteristicRetrieve**](PokemonApi.md#CharacteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**EggGroupList**](PokemonApi.md#EggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**EggGroupRetrieve**](PokemonApi.md#EggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**GenderList**](PokemonApi.md#GenderList) | **GET** /api/v2/gender/ | List genders
[**GenderRetrieve**](PokemonApi.md#GenderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**GrowthRateList**](PokemonApi.md#GrowthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**GrowthRateRetrieve**](PokemonApi.md#GrowthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**MoveDamageClassList**](PokemonApi.md#MoveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**MoveDamageClassRetrieve**](PokemonApi.md#MoveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**NatureList**](PokemonApi.md#NatureList) | **GET** /api/v2/nature/ | List natures
[**NatureRetrieve**](PokemonApi.md#NatureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**PokeathlonStatList**](PokemonApi.md#PokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**PokeathlonStatRetrieve**](PokemonApi.md#PokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**PokemonColorList**](PokemonApi.md#PokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**PokemonColorRetrieve**](PokemonApi.md#PokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**PokemonFormList**](PokemonApi.md#PokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**PokemonFormRetrieve**](PokemonApi.md#PokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**PokemonHabitatList**](PokemonApi.md#PokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**PokemonHabitatRetrieve**](PokemonApi.md#PokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**PokemonList**](PokemonApi.md#PokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**PokemonRetrieve**](PokemonApi.md#PokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**PokemonShapeList**](PokemonApi.md#PokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**PokemonShapeRetrieve**](PokemonApi.md#PokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**PokemonSpeciesList**](PokemonApi.md#PokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**PokemonSpeciesRetrieve**](PokemonApi.md#PokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**StatList**](PokemonApi.md#StatList) | **GET** /api/v2/stat/ | List stats
[**StatRetrieve**](PokemonApi.md#StatRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**TypeList**](PokemonApi.md#TypeList) | **GET** /api/v2/type/ | List types
[**TypeRetrieve**](PokemonApi.md#TypeRetrieve) | **GET** /api/v2/type/{id}/ | Get types


# **AbilityList**
> PaginatedAbilitySummaryList AbilityList(limit = var.limit, offset = var.offset, q = var.q)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```R
library(openapi)

# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AbilityList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$AbilityList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **AbilityRetrieve**
> AbilityDetail AbilityRetrieve(id)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```R
library(openapi)

# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AbilityRetrieve(var_iddata_file = "result.txt")
result <- api_instance$AbilityRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**AbilityDetail**](AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **CharacteristicList**
> PaginatedCharacteristicSummaryList CharacteristicList(limit = var.limit, offset = var.offset, q = var.q)

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```R
library(openapi)

# List charecterictics
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CharacteristicList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$CharacteristicList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **CharacteristicRetrieve**
> CharacteristicDetail CharacteristicRetrieve(id)

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```R
library(openapi)

# Get characteristic
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CharacteristicRetrieve(var_iddata_file = "result.txt")
result <- api_instance$CharacteristicRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**CharacteristicDetail**](CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EggGroupList**
> PaginatedEggGroupSummaryList EggGroupList(limit = var.limit, offset = var.offset, q = var.q)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```R
library(openapi)

# List egg groups
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EggGroupList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$EggGroupList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EggGroupRetrieve**
> EggGroupDetail EggGroupRetrieve(id)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```R
library(openapi)

# Get egg group
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EggGroupRetrieve(var_iddata_file = "result.txt")
result <- api_instance$EggGroupRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**EggGroupDetail**](EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **GenderList**
> PaginatedGenderSummaryList GenderList(limit = var.limit, offset = var.offset, q = var.q)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```R
library(openapi)

# List genders
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenderList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$GenderList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **GenderRetrieve**
> GenderDetail GenderRetrieve(id)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```R
library(openapi)

# Get gender
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenderRetrieve(var_iddata_file = "result.txt")
result <- api_instance$GenderRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**GenderDetail**](GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **GrowthRateList**
> PaginatedGrowthRateSummaryList GrowthRateList(limit = var.limit, offset = var.offset, q = var.q)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```R
library(openapi)

# List growth rates
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GrowthRateList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$GrowthRateList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **GrowthRateRetrieve**
> GrowthRateDetail GrowthRateRetrieve(id)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```R
library(openapi)

# Get growth rate
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GrowthRateRetrieve(var_iddata_file = "result.txt")
result <- api_instance$GrowthRateRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**GrowthRateDetail**](GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **MoveDamageClassList**
> PaginatedMoveDamageClassSummaryList MoveDamageClassList(limit = var.limit, offset = var.offset, q = var.q)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```R
library(openapi)

# List move damage classes
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MoveDamageClassList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$MoveDamageClassList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **MoveDamageClassRetrieve**
> MoveDamageClassDetail MoveDamageClassRetrieve(id)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```R
library(openapi)

# Get move damage class
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MoveDamageClassRetrieve(var_iddata_file = "result.txt")
result <- api_instance$MoveDamageClassRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**MoveDamageClassDetail**](MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **NatureList**
> PaginatedNatureSummaryList NatureList(limit = var.limit, offset = var.offset, q = var.q)

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```R
library(openapi)

# List natures
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$NatureList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$NatureList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **NatureRetrieve**
> NatureDetail NatureRetrieve(id)

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```R
library(openapi)

# Get nature
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$NatureRetrieve(var_iddata_file = "result.txt")
result <- api_instance$NatureRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**NatureDetail**](NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokeathlonStatList**
> PaginatedPokeathlonStatSummaryList PokeathlonStatList(limit = var.limit, offset = var.offset, q = var.q)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```R
library(openapi)

# List pokeathlon stats
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokeathlonStatList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokeathlonStatList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokeathlonStatRetrieve**
> PokeathlonStatDetail PokeathlonStatRetrieve(id)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```R
library(openapi)

# Get pokeathlon stat
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokeathlonStatRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokeathlonStatRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokeathlonStatDetail**](PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonColorList**
> PaginatedPokemonColorSummaryList PokemonColorList(limit = var.limit, offset = var.offset, q = var.q)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```R
library(openapi)

# List pokemon colors
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonColorList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonColorList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonColorRetrieve**
> PokemonColorDetail PokemonColorRetrieve(id)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```R
library(openapi)

# Get pokemon color
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonColorRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonColorRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonColorDetail**](PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonFormList**
> PaginatedPokemonFormSummaryList PokemonFormList(limit = var.limit, offset = var.offset, q = var.q)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example
```R
library(openapi)

# List pokemon forms
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonFormList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonFormList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonFormRetrieve**
> PokemonFormDetail PokemonFormRetrieve(id)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example
```R
library(openapi)

# Get pokemon form
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonFormRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonFormRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonFormDetail**](PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonHabitatList**
> PaginatedPokemonHabitatSummaryList PokemonHabitatList(limit = var.limit, offset = var.offset, q = var.q)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```R
library(openapi)

# List pokemom habitas
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonHabitatList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonHabitatList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonHabitatRetrieve**
> PokemonHabitatDetail PokemonHabitatRetrieve(id)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```R
library(openapi)

# Get pokemom habita
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonHabitatRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonHabitatRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonHabitatDetail**](PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonList**
> PaginatedPokemonSummaryList PokemonList(limit = var.limit, offset = var.offset, q = var.q)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```R
library(openapi)

# List pokemon
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonRetrieve**
> PokemonDetail PokemonRetrieve(id)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```R
library(openapi)

# Get pokemon
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonDetail**](PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonShapeList**
> PaginatedPokemonShapeSummaryList PokemonShapeList(limit = var.limit, offset = var.offset, q = var.q)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Example
```R
library(openapi)

# List pokemon shapes
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonShapeList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonShapeList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonShapeRetrieve**
> PokemonShapeDetail PokemonShapeRetrieve(id)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Example
```R
library(openapi)

# Get pokemon shape
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonShapeRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonShapeRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonShapeDetail**](PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList PokemonSpeciesList(limit = var.limit, offset = var.offset, q = var.q)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```R
library(openapi)

# List pokemon species
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonSpeciesList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PokemonSpeciesList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PokemonSpeciesRetrieve**
> PokemonSpeciesDetail PokemonSpeciesRetrieve(id)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```R
library(openapi)

# Get pokemon species
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PokemonSpeciesRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PokemonSpeciesRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **StatList**
> PaginatedStatSummaryList StatList(limit = var.limit, offset = var.offset, q = var.q)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```R
library(openapi)

# List stats
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$StatList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$StatList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **StatRetrieve**
> StatDetail StatRetrieve(id)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```R
library(openapi)

# Get stat
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$StatRetrieve(var_iddata_file = "result.txt")
result <- api_instance$StatRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**StatDetail**](StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **TypeList**
> PaginatedTypeSummaryList TypeList(limit = var.limit, offset = var.offset, q = var.q)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```R
library(openapi)

# List types
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TypeList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$TypeList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **TypeRetrieve**
> TypeDetail TypeRetrieve(id)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```R
library(openapi)

# Get types
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- PokemonApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TypeRetrieve(var_iddata_file = "result.txt")
result <- api_instance$TypeRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**TypeDetail**](TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

