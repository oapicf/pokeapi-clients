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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// VersionAPIController binds http requests to an api service and writes the service results to the http response
type VersionAPIController struct {
	service VersionAPIServicer
	errorHandler ErrorHandler
}

// VersionAPIOption for how the controller is set up.
type VersionAPIOption func(*VersionAPIController)

// WithVersionAPIErrorHandler inject ErrorHandler into controller
func WithVersionAPIErrorHandler(h ErrorHandler) VersionAPIOption {
	return func(c *VersionAPIController) {
		c.errorHandler = h
	}
}

// NewVersionAPIController creates a default api controller
func NewVersionAPIController(s VersionAPIServicer, opts ...VersionAPIOption) Router {
	controller := &VersionAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the VersionAPIController
func (c *VersionAPIController) Routes() Routes {
	return Routes{
		"VersionList": Route{
			strings.ToUpper("Get"),
			"/api/v2/version/",
			c.VersionList,
		},
		"VersionRead": Route{
			strings.ToUpper("Get"),
			"/api/v2/version/{id}/",
			c.VersionRead,
		},
	}
}

// VersionList -
func (c *VersionAPIController) VersionList(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
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
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	result, err := c.service.VersionList(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// VersionRead -
func (c *VersionAPIController) VersionRead(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int32](
		params["id"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.VersionRead(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
