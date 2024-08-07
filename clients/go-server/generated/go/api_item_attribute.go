// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * 
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 20220523
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ItemAttributeAPIController binds http requests to an api service and writes the service results to the http response
type ItemAttributeAPIController struct {
	service ItemAttributeAPIServicer
	errorHandler ErrorHandler
}

// ItemAttributeAPIOption for how the controller is set up.
type ItemAttributeAPIOption func(*ItemAttributeAPIController)

// WithItemAttributeAPIErrorHandler inject ErrorHandler into controller
func WithItemAttributeAPIErrorHandler(h ErrorHandler) ItemAttributeAPIOption {
	return func(c *ItemAttributeAPIController) {
		c.errorHandler = h
	}
}

// NewItemAttributeAPIController creates a default api controller
func NewItemAttributeAPIController(s ItemAttributeAPIServicer, opts ...ItemAttributeAPIOption) *ItemAttributeAPIController {
	controller := &ItemAttributeAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ItemAttributeAPIController
func (c *ItemAttributeAPIController) Routes() Routes {
	return Routes{
		"ItemAttributeList": Route{
			strings.ToUpper("Get"),
			"/api/v2/item-attribute/",
			c.ItemAttributeList,
		},
		"ItemAttributeRead": Route{
			strings.ToUpper("Get"),
			"/api/v2/item-attribute/{id}/",
			c.ItemAttributeRead,
		},
	}
}

// ItemAttributeList - 
func (c *ItemAttributeAPIController) ItemAttributeList(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "limit", Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "offset", Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	result, err := c.service.ItemAttributeList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// ItemAttributeRead - 
func (c *ItemAttributeAPIController) ItemAttributeRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int32](
		params["id"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "id", Err: err}, nil)
		return
	}
	result, err := c.service.ItemAttributeRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
