/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * PalParkAreaApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_PalParkAreaApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_PalParkAreaApi_H_



#include "ApiClient.h"
#include "ModelBase.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  PalParkAreaApi 
{
public:

    explicit PalParkAreaApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~PalParkAreaApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="limit"> (optional, default to 0)</param>
    /// <param name="offset"> (optional, default to 0)</param>
    pplx::task<utility::string_t> palParkAreaList(
        boost::optional<int32_t> limit,
        boost::optional<int32_t> offset
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="id"></param>
    pplx::task<utility::string_t> palParkAreaRead(
        int32_t id
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_PalParkAreaApi_H_ */

