# WWW::OpenAPIClient::PokemonColorApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokemonColorApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_color_list**](PokemonColorApi.md#pokemon_color_list) | **GET** /api/v2/pokemon-color/ | 
[**pokemon_color_read**](PokemonColorApi.md#pokemon_color_read) | **GET** /api/v2/pokemon-color/{id}/ | 


# **pokemon_color_list**
> string pokemon_color_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonColorApi;
my $api_instance = WWW::OpenAPIClient::PokemonColorApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokemon_color_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonColorApi->pokemon_color_list: $@\n";
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

# **pokemon_color_read**
> string pokemon_color_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonColorApi;
my $api_instance = WWW::OpenAPIClient::PokemonColorApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokemon_color_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonColorApi->pokemon_color_read: $@\n";
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

