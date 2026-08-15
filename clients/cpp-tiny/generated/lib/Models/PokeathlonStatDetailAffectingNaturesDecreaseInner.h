
/*
 * PokeathlonStatDetail_affecting_natures_decrease_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_decrease_inner_H_
#define TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_decrease_inner_H_


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

class PokeathlonStatDetail_affecting_natures_decrease_inner{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatDetail_affecting_natures_decrease_inner();
    PokeathlonStatDetail_affecting_natures_decrease_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatDetail_affecting_natures_decrease_inner();


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
	void setMaxChange(int  max_change);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getNature();

	/*! \brief Set 
	 */
	void setNature(AbilityDetail_pokemon_inner_pokemon  nature);


    private:
    int max_change{};
    AbilityDetail_pokemon_inner_pokemon nature;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatDetail_affecting_natures_decrease_inner_H_ */
