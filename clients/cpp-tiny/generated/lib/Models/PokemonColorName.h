
/*
 * PokemonColorName.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonColorName_H_
#define TINY_CPP_CLIENT_PokemonColorName_H_


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

class PokemonColorName{
public:

    /*! \brief Constructor.
	 */
    PokemonColorName();
    PokemonColorName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonColorName();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);


    private:
    std::string name{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonColorName_H_ */
