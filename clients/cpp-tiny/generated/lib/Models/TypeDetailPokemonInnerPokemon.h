
/*
 * TypeDetail_pokemon_inner_pokemon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_pokemon_inner_pokemon_H_
#define TINY_CPP_CLIENT_TypeDetail_pokemon_inner_pokemon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_pokemon_inner_pokemon{
public:

    /*! \brief Constructor.
	 */
    TypeDetail_pokemon_inner_pokemon();
    TypeDetail_pokemon_inner_pokemon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail_pokemon_inner_pokemon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the pokemon
	 */
	std::string getName();

	/*! \brief Set The name of the pokemon
	 */
	void setName(std::string name);
	/*! \brief Get The URL to get more information about the pokemon
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the pokemon
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_pokemon_inner_pokemon_H_ */
