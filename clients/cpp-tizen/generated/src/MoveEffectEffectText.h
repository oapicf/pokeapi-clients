/*
 * MoveEffectEffectText.h
 *
 * 
 */

#ifndef _MoveEffectEffectText_H_
#define _MoveEffectEffectText_H_


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

class MoveEffectEffectText : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveEffectEffectText();
	MoveEffectEffectText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveEffectEffectText();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The localized effect text for an API resource in a specific language.
	 */
	std::string getEffect();

	/*! \brief Set The localized effect text for an API resource in a specific language.
	 */
	void setEffect(std::string  effect);
	/*! \brief Get The localized effect text in brief.
	 */
	std::string getShortEffect();

	/*! \brief Set The localized effect text in brief.
	 */
	void setShortEffect(std::string  short_effect);
	/*! \brief Get The language this effect is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this effect is in.
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

#endif /* _MoveEffectEffectText_H_ */
