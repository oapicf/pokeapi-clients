
/*
 * StatDetail_affecting_natures.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatDetail_affecting_natures_H_
#define TINY_CPP_CLIENT_StatDetail_affecting_natures_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatDetail_affecting_natures{
public:

    /*! \brief Constructor.
	 */
    StatDetail_affecting_natures();
    StatDetail_affecting_natures(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatDetail_affecting_natures();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getIncrease();

	/*! \brief Set 
	 */
	void setIncrease(std::list<AbilityDetail_pokemon_inner_pokemon> increase);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getDecrease();

	/*! \brief Set 
	 */
	void setDecrease(std::list<AbilityDetail_pokemon_inner_pokemon> decrease);


    private:
    std::list<AbilityDetail_pokemon_inner_pokemon> increase;
    std::list<AbilityDetail_pokemon_inner_pokemon> decrease;
};
}

#endif /* TINY_CPP_CLIENT_StatDetail_affecting_natures_H_ */
