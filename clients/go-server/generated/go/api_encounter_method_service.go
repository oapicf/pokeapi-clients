/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// EncounterMethodApiService is a service that implements the logic for the EncounterMethodApiServicer
// This service should implement the business logic for every endpoint for the EncounterMethodApi API.
// Include any external packages or services that will be required by this service.
type EncounterMethodApiService struct {
}

// NewEncounterMethodApiService creates a default api service
func NewEncounterMethodApiService() EncounterMethodApiServicer {
	return &EncounterMethodApiService{}
}

// EncounterMethodList - 
func (s *EncounterMethodApiService) EncounterMethodList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update EncounterMethodList with the required logic for this service method.
	// Add api_encounter_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("EncounterMethodList method not implemented")
}

// EncounterMethodRead - 
func (s *EncounterMethodApiService) EncounterMethodRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update EncounterMethodRead with the required logic for this service method.
	// Add api_encounter_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("EncounterMethodRead method not implemented")
}
