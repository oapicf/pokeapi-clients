/*
 * PokemonSpeciesGenus.h
 *
 * 
 */

#ifndef _PokemonSpeciesGenus_H_
#define _PokemonSpeciesGenus_H_


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

class PokemonSpeciesGenus : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesGenus();
	PokemonSpeciesGenus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesGenus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The localized genus for the referenced Pokémon species
	 */
	std::string getGenus();

	/*! \brief Set The localized genus for the referenced Pokémon species
	 */
	void setGenus(std::string  genus);
	/*! \brief Get The language this genus is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this genus is in.
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string genus;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesGenus_H_ */
