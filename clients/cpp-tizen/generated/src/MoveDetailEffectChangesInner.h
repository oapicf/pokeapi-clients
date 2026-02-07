/*
 * MoveDetail_effect_changes_inner.h
 *
 * 
 */

#ifndef _MoveDetail_effect_changes_inner_H_
#define _MoveDetail_effect_changes_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveDetail_effect_changes_inner_effect_entries_inner.h"
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

class MoveDetail_effect_changes_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail_effect_changes_inner();
	MoveDetail_effect_changes_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail_effect_changes_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <MoveDetail_effect_changes_inner_effect_entries_inner>effect_entries;
	AbilityDetail_pokemon_inner_pokemon version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_effect_changes_inner_H_ */
