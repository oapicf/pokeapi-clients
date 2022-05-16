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

// MoveLearnMethodApiService is a service that implements the logic for the MoveLearnMethodApiServicer
// This service should implement the business logic for every endpoint for the MoveLearnMethodApi API.
// Include any external packages or services that will be required by this service.
type MoveLearnMethodApiService struct {
}

// NewMoveLearnMethodApiService creates a default api service
func NewMoveLearnMethodApiService() MoveLearnMethodApiServicer {
	return &MoveLearnMethodApiService{}
}

// MoveLearnMethodList - 
func (s *MoveLearnMethodApiService) MoveLearnMethodList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update MoveLearnMethodList with the required logic for this service method.
	// Add api_move_learn_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MoveLearnMethodList method not implemented")
}

// MoveLearnMethodRead - 
func (s *MoveLearnMethodApiService) MoveLearnMethodRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update MoveLearnMethodRead with the required logic for this service method.
	// Add api_move_learn_method_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MoveLearnMethodRead method not implemented")
}
