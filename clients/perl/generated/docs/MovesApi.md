# WWW::OpenAPIClient::MovesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MovesApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_ailment_list**](MovesApi.md#move_ailment_list) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**move_ailment_retrieve**](MovesApi.md#move_ailment_retrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**move_battle_style_list**](MovesApi.md#move_battle_style_list) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**move_battle_style_retrieve**](MovesApi.md#move_battle_style_retrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**move_category_list**](MovesApi.md#move_category_list) | **GET** /api/v2/move-category/ | List move meta categories
[**move_category_retrieve**](MovesApi.md#move_category_retrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**move_learn_method_list**](MovesApi.md#move_learn_method_list) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**move_learn_method_retrieve**](MovesApi.md#move_learn_method_retrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**move_list**](MovesApi.md#move_list) | **GET** /api/v2/move/ | List moves
[**move_retrieve**](MovesApi.md#move_retrieve) | **GET** /api/v2/move/{id}/ | Get move
[**move_target_list**](MovesApi.md#move_target_list) | **GET** /api/v2/move-target/ | List move targets
[**move_target_retrieve**](MovesApi.md#move_target_retrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


# **move_ailment_list**
> PaginatedMoveMetaAilmentSummaryList move_ailment_list(limit => $limit, offset => $offset, q => $q)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_ailment_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_ailment_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_ailment_retrieve**
> MoveMetaAilmentDetail move_ailment_retrieve(id => $id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_ailment_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_ailment_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_battle_style_list**
> PaginatedMoveBattleStyleSummaryList move_battle_style_list(limit => $limit, offset => $offset, q => $q)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_battle_style_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_battle_style_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_battle_style_retrieve**
> MoveBattleStyleDetail move_battle_style_retrieve(id => $id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_battle_style_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_battle_style_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_category_list**
> PaginatedMoveMetaCategorySummaryList move_category_list(limit => $limit, offset => $offset, q => $q)

List move meta categories

Very general categories that loosely group move effects.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_category_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_category_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_category_retrieve**
> MoveMetaCategoryDetail move_category_retrieve(id => $id)

Get move meta category

Very general categories that loosely group move effects.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_category_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_category_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_learn_method_list**
> PaginatedMoveLearnMethodSummaryList move_learn_method_list(limit => $limit, offset => $offset, q => $q)

List move learn methods

Methods by which Pokémon can learn moves.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_learn_method_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_learn_method_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_learn_method_retrieve**
> MoveLearnMethodDetail move_learn_method_retrieve(id => $id)

Get move learn method

Methods by which Pokémon can learn moves.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_learn_method_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_learn_method_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_list**
> PaginatedMoveSummaryList move_list(limit => $limit, offset => $offset, q => $q)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_retrieve**
> MoveDetail move_retrieve(id => $id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_target_list**
> PaginatedMoveTargetSummaryList move_target_list(limit => $limit, offset => $offset, q => $q)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $limit = 56; # int | Number of results to return per page.
my $offset = 56; # int | The initial index from which to return the results.
my $q = "q_example"; # string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 

eval {
    my $result = $api_instance->move_target_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_target_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_target_retrieve**
> MoveTargetDetail move_target_retrieve(id => $id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MovesApi;
my $api_instance = WWW::OpenAPIClient::MovesApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = "id_example"; # string | This parameter can be a string or an integer.

eval {
    my $result = $api_instance->move_target_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MovesApi->move_target_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

