
/*
 * MoveDetail_contest_combos_normal.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_contest_combos_normal_H_
#define TINY_CPP_CLIENT_MoveDetail_contest_combos_normal_H_


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

class MoveDetail_contest_combos_normal{
public:

    /*! \brief Constructor.
	 */
    MoveDetail_contest_combos_normal();
    MoveDetail_contest_combos_normal(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail_contest_combos_normal();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getUseBefore();

	/*! \brief Set 
	 */
	void setUseBefore(std::list<AbilityDetail_pokemon_inner_pokemon> use_before);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getUseAfter();

	/*! \brief Set 
	 */
	void setUseAfter(std::list<AbilityDetail_pokemon_inner_pokemon> use_after);


    private:
    std::list<AbilityDetail_pokemon_inner_pokemon> use_before;
    std::list<AbilityDetail_pokemon_inner_pokemon> use_after;
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_contest_combos_normal_H_ */
