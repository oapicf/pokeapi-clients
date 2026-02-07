# WWW::OpenAPIClient::LocationApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LocationApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**location_area_list**](LocationApi.md#location_area_list) | **GET** /api/v2/location-area/ | List location areas
[**location_area_retrieve**](LocationApi.md#location_area_retrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**location_list**](LocationApi.md#location_list) | **GET** /api/v2/location/ | List locations
[**location_retrieve**](LocationApi.md#location_retrieve) | **GET** /api/v2/location/{id}/ | Get location
[**pal_park_area_list**](LocationApi.md#pal_park_area_list) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**pal_park_area_retrieve**](LocationApi.md#pal_park_area_retrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**region_list**](LocationApi.md#region_list) | **GET** /api/v2/region/ | List regions
[**region_retrieve**](LocationApi.md#region_retrieve) | **GET** /api/v2/region/{id}/ | Get region


# **location_area_list**
> PaginatedLocationAreaSummaryList location_area_list(limit => $limit, offset => $offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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

eval {
    my $result = $api_instance->location_area_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_area_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_area_retrieve**
> LocationAreaDetail location_area_retrieve(id => $id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

    # Configure HTTP basic authorization: basicAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
    # Configure API key authorization: cookieAuth
    api_key => {'sessionid' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'sessionid' => 'Bearer'},
);

my $id = 56; # int | A unique integer value identifying this location area.

eval {
    my $result = $api_instance->location_area_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_area_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| A unique integer value identifying this location area. | 

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_list**
> PaginatedLocationSummaryList location_list(limit => $limit, offset => $offset, q => $q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->location_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **location_retrieve**
> LocationDetail location_retrieve(id => $id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->location_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pal_park_area_list**
> PaginatedPalParkAreaSummaryList pal_park_area_list(limit => $limit, offset => $offset, q => $q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->pal_park_area_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->pal_park_area_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pal_park_area_retrieve**
> PalParkAreaDetail pal_park_area_retrieve(id => $id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->pal_park_area_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->pal_park_area_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **region_list**
> PaginatedRegionSummaryList region_list(limit => $limit, offset => $offset, q => $q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->region_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->region_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **region_retrieve**
> RegionDetail region_retrieve(id => $id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(

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
    my $result = $api_instance->region_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->region_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

