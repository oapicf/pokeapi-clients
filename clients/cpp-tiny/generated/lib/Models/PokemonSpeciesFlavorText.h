
/*
 * PokemonSpeciesFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesFlavorText_H_
#define TINY_CPP_CLIENT_PokemonSpeciesFlavorText_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"
#include "VersionSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpeciesFlavorText{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesFlavorText();
    PokemonSpeciesFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesFlavorText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
	 */
	std::string getFlavorText();

	/*! \brief Set The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
	 */
	void setFlavorText(std::string flavor_text);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary language);
	/*! \brief Get The game version this flavor text is extracted from.
	 */
	VersionSummary getVersion();

	/*! \brief Set The game version this flavor text is extracted from.
	 */
	void setVersion(VersionSummary version);


    private:
    std::string flavor_text{};
    LanguageSummary language;
    VersionSummary version;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesFlavorText_H_ */
