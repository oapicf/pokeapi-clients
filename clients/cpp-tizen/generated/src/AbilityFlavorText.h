/*
 * AbilityFlavorText.h
 *
 * 
 */

#ifndef _AbilityFlavorText_H_
#define _AbilityFlavorText_H_


#include <string>
#include "LanguageSummary.h"
#include "VersionGroupSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityFlavorText : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityFlavorText();
	AbilityFlavorText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityFlavorText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The localized name for an API resource in a specific language.
	 */
	std::string getFlavorText();

	/*! \brief Set The localized name for an API resource in a specific language.
	 */
	void setFlavorText(std::string  flavor_text);
	/*! \brief Get The language this text resource is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this text resource is in.
	 */
	void setLanguage(LanguageSummary  language);
	/*! \brief Get The version group that uses this flavor text.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group that uses this flavor text.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	std::string flavor_text;
	LanguageSummary language;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityFlavorText_H_ */
