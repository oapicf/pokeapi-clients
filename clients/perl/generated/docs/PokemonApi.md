# WWW::OpenAPIClient::PokemonApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokemonApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_list**](PokemonApi.md#pokemon_list) | **GET** /api/v2/pokemon/ | 
[**pokemon_read**](PokemonApi.md#pokemon_read) | **GET** /api/v2/pokemon/{id}/ | 


# **pokemon_list**
> string pokemon_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonApi;
my $api_instance = WWW::OpenAPIClient::PokemonApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokemon_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonApi->pokemon_list: $@\n";
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

# **pokemon_read**
> string pokemon_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonApi;
my $api_instance = WWW::OpenAPIClient::PokemonApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokemon_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonApi->pokemon_read: $@\n";
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

