
/*
 * MoveDetail_effect_changes_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_effect_changes_inner_H_
#define TINY_CPP_CLIENT_MoveDetail_effect_changes_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveDetail_effect_changes_inner_effect_entries_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDetail_effect_changes_inner{
public:

    /*! \brief Constructor.
	 */
    MoveDetail_effect_changes_inner();
    MoveDetail_effect_changes_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail_effect_changes_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<MoveDetail_effect_changes_inner_effect_entries_inner> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group);


    private:
    std::list<MoveDetail_effect_changes_inner_effect_entries_inner> effect_entries;
    AbilityDetail_pokemon_inner_pokemon version_group;
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_effect_changes_inner_H_ */
