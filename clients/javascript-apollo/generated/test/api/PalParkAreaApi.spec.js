/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
  instance = new OpenapiJsClient.PalParkAreaApi();
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

describe('PalParkAreaApi', function() {
    describe('palParkAreaList', function() {
      it('should call palParkAreaList successfully', function(done) {
        //uncomment below and update the code to test palParkAreaList
        //instance.palParkAreaList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('palParkAreaRead', function() {
      it('should call palParkAreaRead successfully', function(done) {
        //uncomment below and update the code to test palParkAreaRead
        //instance.palParkAreaRead(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
});