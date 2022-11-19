/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * GenderApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_GenderApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_GenderApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"
#include "CppRestOpenAPIClient/ModelBase.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  GenderApi 
{
public:

    explicit GenderApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~GenderApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="limit"> (optional, default to 0)</param>
    /// <param name="offset"> (optional, default to 0)</param>
    pplx::task<utility::string_t> genderList(
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
    pplx::task<utility::string_t> genderRead(
        int32_t id
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_GenderApi_H_ */

