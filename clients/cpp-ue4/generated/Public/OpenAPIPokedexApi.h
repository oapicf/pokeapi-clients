/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIPokedexApi
{
public:
	OpenAPIPokedexApi();
	~OpenAPIPokedexApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class PokedexListRequest;
	class PokedexListResponse;
	class PokedexReadRequest;
	class PokedexReadResponse;

    DECLARE_DELEGATE_OneParam(FPokedexListDelegate, const PokedexListResponse&);
    DECLARE_DELEGATE_OneParam(FPokedexReadDelegate, const PokedexReadResponse&);

    FHttpRequestPtr PokedexList(const PokedexListRequest& Request, const FPokedexListDelegate& Delegate = FPokedexListDelegate()) const;
    FHttpRequestPtr PokedexRead(const PokedexReadRequest& Request, const FPokedexReadDelegate& Delegate = FPokedexReadDelegate()) const;

private:
    void OnPokedexListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokedexListDelegate Delegate) const;
    void OnPokedexReadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokedexReadDelegate Delegate) const;

	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
