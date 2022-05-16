# OAIItemFlingEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemFlingEffectList**](OAIItemFlingEffectApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | 
[**itemFlingEffectRead**](OAIItemFlingEffectApi.md#itemflingeffectread) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **itemFlingEffectList**
```objc
-(NSURLSessionTask*) itemFlingEffectListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* limit = @56; //  (optional)
NSNumber* offset = @56; //  (optional)

OAIItemFlingEffectApi*apiInstance = [[OAIItemFlingEffectApi alloc] init];

[apiInstance itemFlingEffectListWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemFlingEffectApi->itemFlingEffectList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***|  | [optional] 
 **offset** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **itemFlingEffectRead**
```objc
-(NSURLSessionTask*) itemFlingEffectReadWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* _id = @56; // 

OAIItemFlingEffectApi*apiInstance = [[OAIItemFlingEffectApi alloc] init];

[apiInstance itemFlingEffectReadWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIItemFlingEffectApi->itemFlingEffectRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

