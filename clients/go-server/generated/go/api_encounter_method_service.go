/*
 *
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// EncounterMethodAPIService is a service that implements the logic for the EncounterMethodAPIServicer
// This service should implement the business logic for every endpoint for the EncounterMethodAPI API.
// Include any external packages or services that will be required by this service.
type EncounterMethodAPIService struct {
}

// NewEncounterMethodAPIService creates a default api service
func NewEncounterMethodAPIService() EncounterMethodAPIServicer {
	return &EncounterMethodAPIService{}
}

// EncounterMethodList -
func (s *EncounterMethodAPIService) EncounterMethodList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update EncounterMethodList with the required logic for this service method.
	// Add api_encounter_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("EncounterMethodList method not implemented")
}

// EncounterMethodRead -
func (s *EncounterMethodAPIService) EncounterMethodRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update EncounterMethodRead with the required logic for this service method.
	// Add api_encounter_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("EncounterMethodRead method not implemented")
}
