/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// LanguageApiService is a service that implements the logic for the LanguageApiServicer
// This service should implement the business logic for every endpoint for the LanguageApi API.
// Include any external packages or services that will be required by this service.
type LanguageApiService struct {
}

// NewLanguageApiService creates a default api service
func NewLanguageApiService() LanguageApiServicer {
	return &LanguageApiService{}
}

// LanguageList - 
func (s *LanguageApiService) LanguageList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update LanguageList with the required logic for this service method.
	// Add api_language_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LanguageList method not implemented")
}

// LanguageRead - 
func (s *LanguageApiService) LanguageRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update LanguageRead with the required logic for this service method.
	// Add api_language_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LanguageRead method not implemented")
}
