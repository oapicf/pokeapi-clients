
/*
 * PokemonCries.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonCries_H_
#define TINY_CPP_CLIENT_PokemonCries_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonCries{
public:

    /*! \brief Constructor.
	 */
    PokemonCries();
    PokemonCries(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonCries();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The latest depiction of this Pokémon's cry.
	 */
	std::string getLatest();

	/*! \brief Set The latest depiction of this Pokémon's cry.
	 */
	void setLatest(std::string latest);
	/*! \brief Get The legacy depiction of this Pokémon's cry.
	 */
	std::string getLegacy();

	/*! \brief Set The legacy depiction of this Pokémon's cry.
	 */
	void setLegacy(std::string legacy);


    private:
    std::string latest{};
    std::string legacy{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonCries_H_ */
