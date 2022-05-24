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

// ItemAttributeApiController binds http requests to an api service and writes the service results to the http response
type ItemAttributeApiController struct {
	service ItemAttributeApiServicer
	errorHandler ErrorHandler
}

// ItemAttributeApiOption for how the controller is set up.
type ItemAttributeApiOption func(*ItemAttributeApiController)

// WithItemAttributeApiErrorHandler inject ErrorHandler into controller
func WithItemAttributeApiErrorHandler(h ErrorHandler) ItemAttributeApiOption {
	return func(c *ItemAttributeApiController) {
		c.errorHandler = h
	}
}

// NewItemAttributeApiController creates a default api controller
func NewItemAttributeApiController(s ItemAttributeApiServicer, opts ...ItemAttributeApiOption) Router {
	controller := &ItemAttributeApiController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all of the api route for the ItemAttributeApiController
func (c *ItemAttributeApiController) Routes() Routes {
	return Routes{ 
		{
			"ItemAttributeList",
			strings.ToUpper("Get"),
			"/api/v2/item-attribute/",
			c.ItemAttributeList,
		},
		{
			"ItemAttributeRead",
			strings.ToUpper("Get"),
			"/api/v2/item-attribute/{id}/",
			c.ItemAttributeRead,
		},
	}
}

// ItemAttributeList - 
func (c *ItemAttributeApiController) ItemAttributeList(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.ItemAttributeList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}

// ItemAttributeRead - 
func (c *ItemAttributeApiController) ItemAttributeRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseInt32Parameter(params["id"], true)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}

	result, err := c.service.ItemAttributeRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)

}
