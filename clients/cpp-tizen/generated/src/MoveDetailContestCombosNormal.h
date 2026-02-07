/*
 * MoveDetail_contest_combos_normal.h
 *
 * 
 */

#ifndef _MoveDetail_contest_combos_normal_H_
#define _MoveDetail_contest_combos_normal_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDetail_contest_combos_normal : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail_contest_combos_normal();
	MoveDetail_contest_combos_normal(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail_contest_combos_normal();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getUseBefore();

	/*! \brief Set 
	 */
	void setUseBefore(std::list <AbilityDetail_pokemon_inner_pokemon> use_before);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getUseAfter();

	/*! \brief Set 
	 */
	void setUseAfter(std::list <AbilityDetail_pokemon_inner_pokemon> use_after);

private:
	std::list <AbilityDetail_pokemon_inner_pokemon>use_before;
	std::list <AbilityDetail_pokemon_inner_pokemon>use_after;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_contest_combos_normal_H_ */
