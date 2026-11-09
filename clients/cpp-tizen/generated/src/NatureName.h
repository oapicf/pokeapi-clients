/*
 * NatureName.h
 *
 * 
 */

#ifndef _NatureName_H_
#define _NatureName_H_


#include <string>
#include "LanguageSummary.h"
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

class NatureName : public Object {
public:
	/*! \brief Constructor.
	 */
	NatureName();
	NatureName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NatureName();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The localized name for an API resource in a specific language.
	 */
	std::string getName();

	/*! \brief Set The localized name for an API resource in a specific language.
	 */
	void setName(std::string  name);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string name;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NatureName_H_ */
