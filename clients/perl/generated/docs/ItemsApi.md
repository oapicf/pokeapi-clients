# WWW::OpenAPIClient::ItemsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ItemsApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_attribute_list**](ItemsApi.md#item_attribute_list) | **GET** /api/v2/item-attribute/ | List item attributes
[**item_attribute_retrieve**](ItemsApi.md#item_attribute_retrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**item_category_list**](ItemsApi.md#item_category_list) | **GET** /api/v2/item-category/ | List item categories
[**item_category_retrieve**](ItemsApi.md#item_category_retrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**item_fling_effect_list**](ItemsApi.md#item_fling_effect_list) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**item_fling_effect_retrieve**](ItemsApi.md#item_fling_effect_retrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**item_list**](ItemsApi.md#item_list) | **GET** /api/v2/item/ | List items
[**item_pocket_list**](ItemsApi.md#item_pocket_list) | **GET** /api/v2/item-pocket/ | List item pockets
[**item_pocket_retrieve**](ItemsApi.md#item_pocket_retrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**item_retrieve**](ItemsApi.md#item_retrieve) | **GET** /api/v2/item/{id}/ | Get item


# **item_attribute_list**
> PaginatedItemAttributeSummaryList item_attribute_list(limit => $limit, offset => $offset, q => $q)

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_attribute_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_attribute_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_attribute_retrieve**
> ItemAttributeDetail item_attribute_retrieve(id => $id)

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_attribute_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_attribute_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_category_list**
> PaginatedItemCategorySummaryList item_category_list(limit => $limit, offset => $offset, q => $q)

List item categories

Item categories determine where items will be placed in the players bag.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_category_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_category_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_category_retrieve**
> ItemCategoryDetail item_category_retrieve(id => $id)

Get item category

Item categories determine where items will be placed in the players bag.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_category_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_category_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_fling_effect_list**
> PaginatedItemFlingEffectSummaryList item_fling_effect_list(limit => $limit, offset => $offset, q => $q)

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_fling_effect_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_fling_effect_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_fling_effect_retrieve**
> ItemFlingEffectDetail item_fling_effect_retrieve(id => $id)

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_fling_effect_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_fling_effect_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_list**
> PaginatedItemSummaryList item_list(limit => $limit, offset => $offset, q => $q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_pocket_list**
> PaginatedItemPocketSummaryList item_pocket_list(limit => $limit, offset => $offset, q => $q)

List item pockets

Pockets within the players bag used for storing items by category.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_pocket_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_pocket_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_pocket_retrieve**
> ItemPocketDetail item_pocket_retrieve(id => $id)

Get item pocket

Pockets within the players bag used for storing items by category.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_pocket_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_pocket_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ItemPocketDetail**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_retrieve**
> ItemDetail item_retrieve(id => $id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemsApi;
my $api_instance = WWW::OpenAPIClient::ItemsApi->new(

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
    my $result = $api_instance->item_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemsApi->item_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ItemDetail**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

