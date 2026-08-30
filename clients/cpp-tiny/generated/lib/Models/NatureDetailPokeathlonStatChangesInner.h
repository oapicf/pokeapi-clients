
/*
 * NatureDetail_pokeathlon_stat_changes_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NatureDetail_pokeathlon_stat_changes_inner_H_
#define TINY_CPP_CLIENT_NatureDetail_pokeathlon_stat_changes_inner_H_


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

class NatureDetail_pokeathlon_stat_changes_inner{
public:

    /*! \brief Constructor.
	 */
    NatureDetail_pokeathlon_stat_changes_inner();
    NatureDetail_pokeathlon_stat_changes_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NatureDetail_pokeathlon_stat_changes_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getMaxChange();

	/*! \brief Set 
	 */
	void setMaxChange(int max_change);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokeathlonStat();

	/*! \brief Set 
	 */
	void setPokeathlonStat(AbilityDetail_pokemon_inner_pokemon pokeathlon_stat);


    private:
    int max_change{};
    AbilityDetail_pokemon_inner_pokemon pokeathlon_stat;
};
}

#endif /* TINY_CPP_CLIENT_NatureDetail_pokeathlon_stat_changes_inner_H_ */
