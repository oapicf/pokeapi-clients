
/*
 * PokemonFormDetail_form_names_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonFormDetail_form_names_inner_H_
#define TINY_CPP_CLIENT_PokemonFormDetail_form_names_inner_H_


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

class PokemonFormDetail_form_names_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonFormDetail_form_names_inner();
    PokemonFormDetail_form_names_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonFormDetail_form_names_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    AbilityDetail_pokemon_inner_pokemon language;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonFormDetail_form_names_inner_H_ */
