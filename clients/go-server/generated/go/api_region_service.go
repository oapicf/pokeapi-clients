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

// RegionAPIService is a service that implements the logic for the RegionAPIServicer
// This service should implement the business logic for every endpoint for the RegionAPI API.
// Include any external packages or services that will be required by this service.
type RegionAPIService struct {
}

// NewRegionAPIService creates a default api service
func NewRegionAPIService() RegionAPIServicer {
	return &RegionAPIService{}
}

// RegionList -
func (s *RegionAPIService) RegionList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update RegionList with the required logic for this service method.
	// Add api_region_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RegionList method not implemented")
}

// RegionRead -
func (s *RegionAPIService) RegionRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update RegionRead with the required logic for this service method.
	// Add api_region_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	// return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RegionRead method not implemented")
}
