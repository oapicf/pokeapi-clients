
/*
 * PokemonShapeDetail_awesome_names_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonShapeDetail_awesome_names_inner_H_
#define TINY_CPP_CLIENT_PokemonShapeDetail_awesome_names_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonShapeDetail_awesome_names_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonShapeDetail_awesome_names_inner();
    PokemonShapeDetail_awesome_names_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonShapeDetail_awesome_names_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAwesomeName();

	/*! \brief Set 
	 */
	void setAwesomeName(std::string  awesome_name);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);


    private:
    std::string awesome_name{};
    AbilityDetail_pokemon_inner_pokemon language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonShapeDetail_awesome_names_inner_H_ */
