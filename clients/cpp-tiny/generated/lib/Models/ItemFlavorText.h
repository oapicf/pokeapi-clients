
/*
 * ItemFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemFlavorText_H_
#define TINY_CPP_CLIENT_ItemFlavorText_H_


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

class ItemFlavorText{
public:

    /*! \brief Constructor.
	 */
    ItemFlavorText();
    ItemFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemFlavorText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized flavor text for an API resource in a specific language.
	 */
	std::string getText();

	/*! \brief Set The localized flavor text for an API resource in a specific language.
	 */
	void setText(std::string text);
	/*! \brief Get The version group which uses this flavor text.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group which uses this flavor text.
	 */
	void setVersionGroup(VersionGroupSummary version_group);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string text{};
    VersionGroupSummary version_group;
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_ItemFlavorText_H_ */
