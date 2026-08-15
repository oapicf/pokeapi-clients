
/*
 * PokemonDetail_sprites.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_sprites_H_
#define TINY_CPP_CLIENT_PokemonDetail_sprites_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_sprites{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_sprites();
    PokemonDetail_sprites(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_sprites();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getFrontDefault();

	/*! \brief Set 
	 */
	void setFrontDefault(std::string  front_default);


    private:
    std::string front_default{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_sprites_H_ */
