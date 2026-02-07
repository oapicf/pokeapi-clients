/*
 * ItemFlavorText.h
 *
 * 
 */

#ifndef _ItemFlavorText_H_
#define _ItemFlavorText_H_


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

class ItemFlavorText : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemFlavorText();
	ItemFlavorText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemFlavorText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string text;
	VersionGroupSummary version_group;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemFlavorText_H_ */
