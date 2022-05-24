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

// MoveCategoryApiController binds http requests to an api service and writes the service results to the http response
type MoveCategoryApiController struct {
	service MoveCategoryApiServicer
	errorHandler ErrorHandler
}

// MoveCategoryApiOption for how the controller is set up.
type MoveCategoryApiOption func(*MoveCategoryApiController)

// WithMoveCategoryApiErrorHandler inject ErrorHandler into controller
func WithMoveCategoryApiErrorHandler(h ErrorHandler) MoveCategoryApiOption {
	return func(c *MoveCategoryApiController) {
		c.errorHandler = h
	}
}

// NewMoveCategoryApiController creates a default api controller
func NewMoveCategoryApiController(s MoveCategoryApiServicer, opts ...MoveCategoryApiOption) Router {
	controller := &MoveCategoryApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the MoveCategoryApiController
func (c *MoveCategoryApiController) Routes() Routes {
	return Routes{ 
		{
			"MoveCategoryList",
			strings.ToUpper("Get"),
			"/api/v2/move-category/",
			c.MoveCategoryList,
		},
		{
			"MoveCategoryRead",
			strings.ToUpper("Get"),
			"/api/v2/move-category/{id}/",
			c.MoveCategoryRead,
		},
	}
}

// MoveCategoryList - 
func (c *MoveCategoryApiController) MoveCategoryList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.MoveCategoryList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// MoveCategoryRead - 
func (c *MoveCategoryApiController) MoveCategoryRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.MoveCategoryRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
