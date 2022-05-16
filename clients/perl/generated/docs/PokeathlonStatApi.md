# WWW::OpenAPIClient::PokeathlonStatApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokeathlonStatApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlon_stat_list**](PokeathlonStatApi.md#pokeathlon_stat_list) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlon_stat_read**](PokeathlonStatApi.md#pokeathlon_stat_read) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


# **pokeathlon_stat_list**
> string pokeathlon_stat_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokeathlonStatApi;
my $api_instance = WWW::OpenAPIClient::PokeathlonStatApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokeathlon_stat_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokeathlonStatApi->pokeathlon_stat_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokeathlon_stat_read**
> string pokeathlon_stat_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokeathlonStatApi;
my $api_instance = WWW::OpenAPIClient::PokeathlonStatApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokeathlon_stat_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokeathlonStatApi->pokeathlon_stat_read: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

