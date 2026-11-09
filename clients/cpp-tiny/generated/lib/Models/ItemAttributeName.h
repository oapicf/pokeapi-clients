
/*
 * ItemAttributeName.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemAttributeName_H_
#define TINY_CPP_CLIENT_ItemAttributeName_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemAttributeName{
public:

    /*! \brief Constructor.
	 */
    ItemAttributeName();
    ItemAttributeName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemAttributeName();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized name for an API resource in a specific language.
	 */
	std::string getName();

	/*! \brief Set The localized name for an API resource in a specific language.
	 */
	void setName(std::string name);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string name{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_ItemAttributeName_H_ */
