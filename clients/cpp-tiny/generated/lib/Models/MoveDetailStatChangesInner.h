
/*
 * MoveDetail_stat_changes_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_stat_changes_inner_H_
#define TINY_CPP_CLIENT_MoveDetail_stat_changes_inner_H_


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

class MoveDetail_stat_changes_inner{
public:

    /*! \brief Constructor.
	 */
    MoveDetail_stat_changes_inner();
    MoveDetail_stat_changes_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail_stat_changes_inner();


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
	AbilityDetail_pokemon_inner_pokemon getStat();

	/*! \brief Set 
	 */
	void setStat(AbilityDetail_pokemon_inner_pokemon  stat);


    private:
    int change{};
    AbilityDetail_pokemon_inner_pokemon stat;
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_stat_changes_inner_H_ */
