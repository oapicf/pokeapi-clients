
/*
 * PokemonDetail_cries.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_cries_H_
#define TINY_CPP_CLIENT_PokemonDetail_cries_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_cries{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_cries();
    PokemonDetail_cries(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_cries();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getLatest();

	/*! \brief Set 
	 */
	void setLatest(std::string  latest);
	/*! \brief Get 
	 */
	std::string getLegacy();

	/*! \brief Set 
	 */
	void setLegacy(std::string  legacy);


    private:
    std::string latest{};
    std::string legacy{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_cries_H_ */
