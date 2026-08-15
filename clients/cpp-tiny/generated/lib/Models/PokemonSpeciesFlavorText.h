
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
    std::string flavor_text{};
    LanguageSummary language;
    VersionSummary version;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesFlavorText_H_ */
