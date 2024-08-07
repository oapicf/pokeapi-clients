// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * 
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// LanguageAPIService is a service that implements the logic for the LanguageAPIServicer
// This service should implement the business logic for every endpoint for the LanguageAPI API.
// Include any external packages or services that will be required by this service.
type LanguageAPIService struct {
}

// NewLanguageAPIService creates a default api service
func NewLanguageAPIService() *LanguageAPIService {
	return &LanguageAPIService{}
}

// LanguageList - 
func (s *LanguageAPIService) LanguageList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update LanguageList with the required logic for this service method.
	// Add api_language_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LanguageList method not implemented")
}

// LanguageRead - 
func (s *LanguageAPIService) LanguageRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update LanguageRead with the required logic for this service method.
	// Add api_language_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("LanguageRead method not implemented")
}
