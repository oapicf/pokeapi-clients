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
 * LanguageApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_LanguageApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_LanguageApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"
#include "CppRestOpenAPIClient/ModelBase.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  LanguageApi 
{
public:

    explicit LanguageApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~LanguageApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="limit"> (optional, default to 0)</param>
    /// <param name="offset"> (optional, default to 0)</param>
    pplx::task<utility::string_t> languageList(
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
    pplx::task<utility::string_t> languageRead(
        int32_t id
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_LanguageApi_H_ */

