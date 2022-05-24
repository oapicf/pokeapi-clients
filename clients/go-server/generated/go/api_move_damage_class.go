/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// MoveDamageClassApiController binds http requests to an api service and writes the service results to the http response
type MoveDamageClassApiController struct {
	service MoveDamageClassApiServicer
	errorHandler ErrorHandler
}

// MoveDamageClassApiOption for how the controller is set up.
type MoveDamageClassApiOption func(*MoveDamageClassApiController)

// WithMoveDamageClassApiErrorHandler inject ErrorHandler into controller
func WithMoveDamageClassApiErrorHandler(h ErrorHandler) MoveDamageClassApiOption {
	return func(c *MoveDamageClassApiController) {
		c.errorHandler = h
	}
}

// NewMoveDamageClassApiController creates a default api controller
func NewMoveDamageClassApiController(s MoveDamageClassApiServicer, opts ...MoveDamageClassApiOption) Router {
	controller := &MoveDamageClassApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the MoveDamageClassApiController
func (c *MoveDamageClassApiController) Routes() Routes {
	return Routes{ 
		{
			"MoveDamageClassList",
			strings.ToUpper("Get"),
			"/api/v2/move-damage-class/",
			c.MoveDamageClassList,
		},
		{
			"MoveDamageClassRead",
			strings.ToUpper("Get"),
			"/api/v2/move-damage-class/{id}/",
			c.MoveDamageClassRead,
		},
	}
}

// MoveDamageClassList - 
func (c *MoveDamageClassApiController) MoveDamageClassList(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	limitParam, err := parseInt32Parameter(query.Get("limit"), false)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	offsetParam, err := parseInt32Parameter(query.Get("offset"), false)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.MoveDamageClassList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// MoveDamageClassRead - 
func (c *MoveDamageClassApiController) MoveDamageClassRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.MoveDamageClassRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
