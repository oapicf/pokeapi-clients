
/*
 * StatDetail_affecting_moves_increase_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatDetail_affecting_moves_increase_inner_H_
#define TINY_CPP_CLIENT_StatDetail_affecting_moves_increase_inner_H_


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

class StatDetail_affecting_moves_increase_inner{
public:

    /*! \brief Constructor.
	 */
    StatDetail_affecting_moves_increase_inner();
    StatDetail_affecting_moves_increase_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatDetail_affecting_moves_increase_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getChange();

	/*! \brief Set 
	 */
	void setChange(int  change);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMove();

	/*! \brief Set 
	 */
	void setMove(AbilityDetail_pokemon_inner_pokemon  move);


    private:
    int change{};
    AbilityDetail_pokemon_inner_pokemon move;
};
}

#endif /* TINY_CPP_CLIENT_StatDetail_affecting_moves_increase_inner_H_ */
