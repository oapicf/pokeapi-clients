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

#include "OpenAPIMoveApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIMoveApi::MoveListRequest::ComputePath() const
{
	FString Path(TEXT("/api/v2/move/"));
	TArray<FString> QueryParams;
	if(Limit.IsSet())
	{
		QueryParams.Add(FString(TEXT("limit=")) + ToUrlString(Limit.GetValue()));
	}
	if(Offset.IsSet())
	{
		QueryParams.Add(FString(TEXT("offset=")) + ToUrlString(Offset.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIMoveApi::MoveListRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("text/plain") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIMoveApi::MoveListResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 0:
	default:
		SetResponseString(TEXT("Default response"));
		break;
	}
}

bool OpenAPIMoveApi::MoveListResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIMoveApi::MoveReadRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = {
	{ TEXT("id"), FStringFormatArg(ToUrlString(Id)) } };

	FString Path = FString::Format(TEXT("/api/v2/move/{id}/"), PathParams);

	return Path;
}

void OpenAPIMoveApi::MoveReadRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("text/plain") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIMoveApi::MoveReadResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 0:
	default:
		SetResponseString(TEXT("Default response"));
		break;
	}
}

bool OpenAPIMoveApi::MoveReadResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
