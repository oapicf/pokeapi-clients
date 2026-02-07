/*
 * ContestEffectFlavorText.h
 *
 * 
 */

#ifndef _ContestEffectFlavorText_H_
#define _ContestEffectFlavorText_H_


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

class ContestEffectFlavorText : public Object {
public:
	/*! \brief Constructor.
	 */
	ContestEffectFlavorText();
	ContestEffectFlavorText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContestEffectFlavorText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getFlavorText();

	/*! \brief Set 
	 */
	void setFlavorText(std::string  flavor_text);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string flavor_text;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ContestEffectFlavorText_H_ */
