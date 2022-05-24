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

// VersionApiService is a service that implements the logic for the VersionApiServicer
// This service should implement the business logic for every endpoint for the VersionApi API.
// Include any external packages or services that will be required by this service.
type VersionApiService struct {
}

// NewVersionApiService creates a default api service
func NewVersionApiService() VersionApiServicer {
	return &VersionApiService{}
}

// VersionList - 
func (s *VersionApiService) VersionList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update VersionList with the required logic for this service method.
	// Add api_version_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("VersionList method not implemented")
}

// VersionRead - 
func (s *VersionApiService) VersionRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update VersionRead with the required logic for this service method.
	// Add api_version_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("VersionRead method not implemented")
}
