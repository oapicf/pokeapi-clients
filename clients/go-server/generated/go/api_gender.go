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

// GenderApiController binds http requests to an api service and writes the service results to the http response
type GenderApiController struct {
	service GenderApiServicer
	errorHandler ErrorHandler
}

// GenderApiOption for how the controller is set up.
type GenderApiOption func(*GenderApiController)

// WithGenderApiErrorHandler inject ErrorHandler into controller
func WithGenderApiErrorHandler(h ErrorHandler) GenderApiOption {
	return func(c *GenderApiController) {
		c.errorHandler = h
	}
}

// NewGenderApiController creates a default api controller
func NewGenderApiController(s GenderApiServicer, opts ...GenderApiOption) Router {
	controller := &GenderApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the GenderApiController
func (c *GenderApiController) Routes() Routes {
	return Routes{ 
		{
			"GenderList",
			strings.ToUpper("Get"),
			"/api/v2/gender/",
			c.GenderList,
		},
		{
			"GenderRead",
			strings.ToUpper("Get"),
			"/api/v2/gender/{id}/",
			c.GenderRead,
		},
	}
}

// GenderList - 
func (c *GenderApiController) GenderList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.GenderList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// GenderRead - 
func (c *GenderApiController) GenderRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.GenderRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
