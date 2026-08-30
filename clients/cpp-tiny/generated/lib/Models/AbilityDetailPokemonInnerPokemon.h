
/*
 * AbilityDetail_pokemon_inner_pokemon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_pokemon_H_
#define TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_pokemon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityDetail_pokemon_inner_pokemon{
public:

    /*! \brief Constructor.
	 */
    AbilityDetail_pokemon_inner_pokemon();
    AbilityDetail_pokemon_inner_pokemon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityDetail_pokemon_inner_pokemon();


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
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_pokemon_H_ */
