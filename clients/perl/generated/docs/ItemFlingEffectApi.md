# WWW::OpenAPIClient::ItemFlingEffectApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ItemFlingEffectApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_fling_effect_list**](ItemFlingEffectApi.md#item_fling_effect_list) | **GET** /api/v2/item-fling-effect/ | 
[**item_fling_effect_read**](ItemFlingEffectApi.md#item_fling_effect_read) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **item_fling_effect_list**
> string item_fling_effect_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemFlingEffectApi;
my $api_instance = WWW::OpenAPIClient::ItemFlingEffectApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->item_fling_effect_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemFlingEffectApi->item_fling_effect_list: $@\n";
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

# **item_fling_effect_read**
> string item_fling_effect_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemFlingEffectApi;
my $api_instance = WWW::OpenAPIClient::ItemFlingEffectApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->item_fling_effect_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemFlingEffectApi->item_fling_effect_read: $@\n";
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

