# WWW::OpenAPIClient::ContestEffectApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ContestEffectApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contest_effect_list**](ContestEffectApi.md#contest_effect_list) | **GET** /api/v2/contest-effect/ | 
[**contest_effect_read**](ContestEffectApi.md#contest_effect_read) | **GET** /api/v2/contest-effect/{id}/ | 


# **contest_effect_list**
> string contest_effect_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestEffectApi;
my $api_instance = WWW::OpenAPIClient::ContestEffectApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->contest_effect_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestEffectApi->contest_effect_list: $@\n";
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

# **contest_effect_read**
> string contest_effect_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestEffectApi;
my $api_instance = WWW::OpenAPIClient::ContestEffectApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->contest_effect_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestEffectApi->contest_effect_read: $@\n";
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

