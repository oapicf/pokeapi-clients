# WWW::OpenAPIClient::ContestsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ContestsApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contest_effect_list**](ContestsApi.md#contest_effect_list) | **GET** /api/v2/contest-effect/ | List contest effects
[**contest_effect_retrieve**](ContestsApi.md#contest_effect_retrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**contest_type_list**](ContestsApi.md#contest_type_list) | **GET** /api/v2/contest-type/ | List contest types
[**contest_type_retrieve**](ContestsApi.md#contest_type_retrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**super_contest_effect_list**](ContestsApi.md#super_contest_effect_list) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**super_contest_effect_retrieve**](ContestsApi.md#super_contest_effect_retrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


# **contest_effect_list**
> PaginatedContestEffectSummaryList contest_effect_list(limit => $limit, offset => $offset, q => $q)

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->contest_effect_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->contest_effect_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_effect_retrieve**
> ContestEffectDetail contest_effect_retrieve(id => $id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->contest_effect_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->contest_effect_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ContestEffectDetail**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_list**
> PaginatedContestTypeSummaryList contest_type_list(limit => $limit, offset => $offset, q => $q)

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->contest_type_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->contest_type_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contest_type_retrieve**
> ContestTypeDetail contest_type_retrieve(id => $id)

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->contest_type_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->contest_type_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**ContestTypeDetail**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_list**
> PaginatedSuperContestEffectSummaryList super_contest_effect_list(limit => $limit, offset => $offset, q => $q)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->super_contest_effect_list(limit => $limit, offset => $offset, q => $q);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->super_contest_effect_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Number of results to return per page. | [optional] 
 **offset** | **int**| The initial index from which to return the results. | [optional] 
 **q** | **string**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **super_contest_effect_retrieve**
> SuperContestEffectDetail super_contest_effect_retrieve(id => $id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestsApi;
my $api_instance = WWW::OpenAPIClient::ContestsApi->new(

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
    my $result = $api_instance->super_contest_effect_retrieve(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestsApi->super_contest_effect_retrieve: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| This parameter can be a string or an integer. | 

### Return type

[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

