# WWW::OpenAPIClient::MoveDamageClassApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MoveDamageClassApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_damage_class_list**](MoveDamageClassApi.md#move_damage_class_list) | **GET** /api/v2/move-damage-class/ | 
[**move_damage_class_read**](MoveDamageClassApi.md#move_damage_class_read) | **GET** /api/v2/move-damage-class/{id}/ | 


# **move_damage_class_list**
> string move_damage_class_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveDamageClassApi;
my $api_instance = WWW::OpenAPIClient::MoveDamageClassApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->move_damage_class_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveDamageClassApi->move_damage_class_list: $@\n";
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

# **move_damage_class_read**
> string move_damage_class_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveDamageClassApi;
my $api_instance = WWW::OpenAPIClient::MoveDamageClassApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->move_damage_class_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveDamageClassApi->move_damage_class_read: $@\n";
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

