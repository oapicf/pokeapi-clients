/*
 * PokemonSpeciesFlavorText.h
 *
 * 
 */

#ifndef _PokemonSpeciesFlavorText_H_
#define _PokemonSpeciesFlavorText_H_


#include <string>
#include "LanguageSummary.h"
#include "VersionSummary.h"
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

class PokemonSpeciesFlavorText : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesFlavorText();
	PokemonSpeciesFlavorText(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesFlavorText();

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
	/*! \brief Get 
	 */
	VersionSummary getVersion();

	/*! \brief Set 
	 */
	void setVersion(VersionSummary  version);

private:
	std::string flavor_text;
	LanguageSummary language;
	VersionSummary version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesFlavorText_H_ */
