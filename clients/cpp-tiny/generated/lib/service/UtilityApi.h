#ifndef TINY_CPP_CLIENT_UtilityApi_H_
#define TINY_CPP_CLIENT_UtilityApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "LanguageDetail.h"
#include "PaginatedLanguageSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class UtilityApi : public Service {
public:
    UtilityApi() = default;

    virtual ~UtilityApi();

    /**
    * List languages.
    *
    * Languages for translations of API resource information.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedLanguageSummaryList
        >
    languageList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get language.
    *
    * Languages for translations of API resource information.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                LanguageDetail
        >
    languageRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_UtilityApi_H_ */