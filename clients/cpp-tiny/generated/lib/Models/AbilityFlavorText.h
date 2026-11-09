
/*
 * AbilityFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityFlavorText_H_
#define TINY_CPP_CLIENT_AbilityFlavorText_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityFlavorText{
public:

    /*! \brief Constructor.
	 */
    AbilityFlavorText();
    AbilityFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityFlavorText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized name for an API resource in a specific language.
	 */
	std::string getFlavorText();

	/*! \brief Set The localized name for an API resource in a specific language.
	 */
	void setFlavorText(std::string flavor_text);
	/*! \brief Get The language this text resource is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this text resource is in.
	 */
	void setLanguage(LanguageSummary language);
	/*! \brief Get The version group that uses this flavor text.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group that uses this flavor text.
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    std::string flavor_text{};
    LanguageSummary language;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_AbilityFlavorText_H_ */
