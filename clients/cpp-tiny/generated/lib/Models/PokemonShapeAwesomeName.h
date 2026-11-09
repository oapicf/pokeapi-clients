
/*
 * PokemonShapeAwesomeName.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonShapeAwesomeName_H_
#define TINY_CPP_CLIENT_PokemonShapeAwesomeName_H_


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

class PokemonShapeAwesomeName{
public:

    /*! \brief Constructor.
	 */
    PokemonShapeAwesomeName();
    PokemonShapeAwesomeName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonShapeAwesomeName();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized \"scientific\" name for an API resource in a specific language.
	 */
	std::string getAwesomeName();

	/*! \brief Set The localized \"scientific\" name for an API resource in a specific language.
	 */
	void setAwesomeName(std::string awesome_name);
	/*! \brief Get The language this \"scientific\" name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this \"scientific\" name is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string awesome_name{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonShapeAwesomeName_H_ */
