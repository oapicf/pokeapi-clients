/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

// CommonJS-like environments that support module.exports, like Node.
factory(require('expect.js'), require(process.cwd()+'/src/index'));

'use strict';

var instance;

beforeEach(function() {
  instance = new OpenapiJsClient.GenerationApi();
});

var getProperty = function(object, getter, property) {
  // Use getter method if present; otherwise, get the property directly.
  if (typeof object[getter] === 'function')
    return object[getter]();
  else
    return object[property];
}

var setProperty = function(object, setter, property, value) {
  // Use setter method if present; otherwise, set the property directly.
  if (typeof object[setter] === 'function')
    object[setter](value);
  else
    object[property] = value;
}

describe('GenerationApi', function() {
    describe('generationList', function() {
      it('should call generationList successfully', function(done) {
        //uncomment below and update the code to test generationList
        //instance.generationList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('generationRead', function() {
      it('should call generationRead successfully', function(done) {
        //uncomment below and update the code to test generationRead
        //instance.generationRead(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
});