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

	/*! \brief Get The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
	 */
	std::string getFlavorText();

	/*! \brief Set The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
	 */
	void setFlavorText(std::string  flavor_text);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary  language);
	/*! \brief Get The game version this flavor text is extracted from.
	 */
	VersionSummary getVersion();

	/*! \brief Set The game version this flavor text is extracted from.
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
