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

// MoveDamageClassApiService is a service that implements the logic for the MoveDamageClassApiServicer
// This service should implement the business logic for every endpoint for the MoveDamageClassApi API.
// Include any external packages or services that will be required by this service.
type MoveDamageClassApiService struct {
}

// NewMoveDamageClassApiService creates a default api service
func NewMoveDamageClassApiService() MoveDamageClassApiServicer {
	return &MoveDamageClassApiService{}
}

// MoveDamageClassList - 
func (s *MoveDamageClassApiService) MoveDamageClassList(ctx context.Context, limit int32, offset int32) (ImplResponse, error) {
	// TODO - update MoveDamageClassList with the required logic for this service method.
	// Add api_move_damage_class_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MoveDamageClassList method not implemented")
}

// MoveDamageClassRead - 
func (s *MoveDamageClassApiService) MoveDamageClassRead(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update MoveDamageClassRead with the required logic for this service method.
	// Add api_move_damage_class_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	//TODO: Uncomment the next line to return response Response(0, string{}) or use other options such as http.Ok ...
	//return Response(0, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MoveDamageClassRead method not implemented")
}
