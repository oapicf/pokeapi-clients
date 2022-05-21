# WWW::OpenAPIClient::PokemonSpeciesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PokemonSpeciesApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokemon_species_list**](PokemonSpeciesApi.md#pokemon_species_list) | **GET** /api/v2/pokemon-species/ | 
[**pokemon_species_read**](PokemonSpeciesApi.md#pokemon_species_read) | **GET** /api/v2/pokemon-species/{id}/ | 


# **pokemon_species_list**
> string pokemon_species_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonSpeciesApi;
my $api_instance = WWW::OpenAPIClient::PokemonSpeciesApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pokemon_species_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonSpeciesApi->pokemon_species_list: $@\n";
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

# **pokemon_species_read**
> string pokemon_species_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PokemonSpeciesApi;
my $api_instance = WWW::OpenAPIClient::PokemonSpeciesApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pokemon_species_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PokemonSpeciesApi->pokemon_species_read: $@\n";
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

