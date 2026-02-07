/*
 * AbilityChangeEffectText.h
 *
 * 
 */

#ifndef _AbilityChangeEffectText_H_
#define _AbilityChangeEffectText_H_


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

class AbilityChangeEffectText : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityChangeEffectText();
	AbilityChangeEffectText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityChangeEffectText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getEffect();

	/*! \brief Set 
	 */
	void setEffect(std::string  effect);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string effect;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityChangeEffectText_H_ */
