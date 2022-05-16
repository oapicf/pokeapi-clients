# WWW::OpenAPIClient::PokemonShapeApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokemonShapeApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_shape_list**](PokemonShapeApi.md#pokemon_shape_list) | **GET** /api/v2/pokemon-shape/ | 
[**pokemon_shape_read**](PokemonShapeApi.md#pokemon_shape_read) | **GET** /api/v2/pokemon-shape/{id}/ | 


# **pokemon_shape_list**
> string pokemon_shape_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonShapeApi;
my $api_instance = WWW::OpenAPIClient::PokemonShapeApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokemon_shape_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonShapeApi->pokemon_shape_list: $@\n";
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

# **pokemon_shape_read**
> string pokemon_shape_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonShapeApi;
my $api_instance = WWW::OpenAPIClient::PokemonShapeApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokemon_shape_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonShapeApi->pokemon_shape_read: $@\n";
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

