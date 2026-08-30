
/*
 * PokemonSpeciesDescription.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesDescription_H_
#define TINY_CPP_CLIENT_PokemonSpeciesDescription_H_


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

class PokemonSpeciesDescription{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesDescription();
    PokemonSpeciesDescription(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesDescription();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string description{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesDescription_H_ */
