
/*
 * PokemonSpeciesGenus.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesGenus_H_
#define TINY_CPP_CLIENT_PokemonSpeciesGenus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpeciesGenus{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesGenus();
    PokemonSpeciesGenus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesGenus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized genus for the referenced Pokémon species
	 */
	std::string getGenus();

	/*! \brief Set The localized genus for the referenced Pokémon species
	 */
	void setGenus(std::string genus);
	/*! \brief Get The language this genus is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this genus is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string genus{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesGenus_H_ */
