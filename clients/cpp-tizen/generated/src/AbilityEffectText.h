/*
 * AbilityEffectText.h
 *
 * 
 */

#ifndef _AbilityEffectText_H_
#define _AbilityEffectText_H_


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

class AbilityEffectText : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityEffectText();
	AbilityEffectText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityEffectText();

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
	std::string getShortEffect();

	/*! \brief Set 
	 */
	void setShortEffect(std::string  short_effect);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string effect;
	std::string short_effect;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityEffectText_H_ */
