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
*/

/*
* MoveCategoryApiImpl.h
*
* 
*/

#ifndef MOVE_CATEGORY_API_IMPL_H_
#define MOVE_CATEGORY_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <MoveCategoryApi.h>


#include <string>

namespace org::openapitools::server::api
{



class MoveCategoryApiImpl : public org::openapitools::server::api::MoveCategoryApi {
public:
    explicit MoveCategoryApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~MoveCategoryApiImpl() override = default;

    void move_category_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response);
    void move_category_read(const int32_t &id, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
