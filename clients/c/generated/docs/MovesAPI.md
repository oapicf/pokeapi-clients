# MovesAPI

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MovesAPI_moveAilmentList**](MovesAPI.md#MovesAPI_moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**MovesAPI_moveAilmentRetrieve**](MovesAPI.md#MovesAPI_moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**MovesAPI_moveBattleStyleList**](MovesAPI.md#MovesAPI_moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**MovesAPI_moveBattleStyleRetrieve**](MovesAPI.md#MovesAPI_moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**MovesAPI_moveCategoryList**](MovesAPI.md#MovesAPI_moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**MovesAPI_moveCategoryRetrieve**](MovesAPI.md#MovesAPI_moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**MovesAPI_moveLearnMethodList**](MovesAPI.md#MovesAPI_moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**MovesAPI_moveLearnMethodRetrieve**](MovesAPI.md#MovesAPI_moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**MovesAPI_moveList**](MovesAPI.md#MovesAPI_moveList) | **GET** /api/v2/move/ | List moves
[**MovesAPI_moveRetrieve**](MovesAPI.md#MovesAPI_moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**MovesAPI_moveTargetList**](MovesAPI.md#MovesAPI_moveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**MovesAPI_moveTargetRetrieve**](MovesAPI.md#MovesAPI_moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


# **MovesAPI_moveAilmentList**
```c
// List move meta ailments
//
// Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
//
paginated_move_meta_ailment_summary_list_t* MovesAPI_moveAilmentList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_meta_ailment_summary_list_t](paginated_move_meta_ailment_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveAilmentRetrieve**
```c
// Get move meta ailment
//
// Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
//
move_meta_ailment_detail_t* MovesAPI_moveAilmentRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_meta_ailment_detail_t](move_meta_ailment_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveBattleStyleList**
```c
// List move battle styles
//
// Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
//
paginated_move_battle_style_summary_list_t* MovesAPI_moveBattleStyleList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_battle_style_summary_list_t](paginated_move_battle_style_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveBattleStyleRetrieve**
```c
// Get move battle style
//
// Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
//
move_battle_style_detail_t* MovesAPI_moveBattleStyleRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_battle_style_detail_t](move_battle_style_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveCategoryList**
```c
// List move meta categories
//
// Very general categories that loosely group move effects.
//
paginated_move_meta_category_summary_list_t* MovesAPI_moveCategoryList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_meta_category_summary_list_t](paginated_move_meta_category_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveCategoryRetrieve**
```c
// Get move meta category
//
// Very general categories that loosely group move effects.
//
move_meta_category_detail_t* MovesAPI_moveCategoryRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_meta_category_detail_t](move_meta_category_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveLearnMethodList**
```c
// List move learn methods
//
// Methods by which Pokémon can learn moves.
//
paginated_move_learn_method_summary_list_t* MovesAPI_moveLearnMethodList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_learn_method_summary_list_t](paginated_move_learn_method_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveLearnMethodRetrieve**
```c
// Get move learn method
//
// Methods by which Pokémon can learn moves.
//
move_learn_method_detail_t* MovesAPI_moveLearnMethodRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_learn_method_detail_t](move_learn_method_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveList**
```c
// List moves
//
// Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
//
paginated_move_summary_list_t* MovesAPI_moveList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_summary_list_t](paginated_move_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveRetrieve**
```c
// Get move
//
// Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
//
move_detail_t* MovesAPI_moveRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_detail_t](move_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveTargetList**
```c
// List move targets
//
// Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
//
paginated_move_target_summary_list_t* MovesAPI_moveTargetList(apiClient_t *apiClient, int *limit, int *offset, char *q);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | Number of results to return per page. | [optional] 
**offset** | **int \*** | The initial index from which to return the results. | [optional] 
**q** | **char \*** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[paginated_move_target_summary_list_t](paginated_move_target_summary_list.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MovesAPI_moveTargetRetrieve**
```c
// Get move target
//
// Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
//
move_target_detail_t* MovesAPI_moveTargetRetrieve(apiClient_t *apiClient, char *id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **char \*** | This parameter can be a string or an integer. | 

### Return type

[move_target_detail_t](move_target_detail.md) *


### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

