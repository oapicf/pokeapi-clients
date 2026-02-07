/*
 * MoveLearnMethodDetail.h
 *
 * 
 */

#ifndef _MoveLearnMethodDetail_H_
#define _MoveLearnMethodDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveLearnMethodDescription.h"
#include "MoveLearnMethodName.h"
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

class MoveLearnMethodDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveLearnMethodDetail();
	MoveLearnMethodDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveLearnMethodDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<MoveLearnMethodName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveLearnMethodName> names);
	/*! \brief Get 
	 */
	std::list<MoveLearnMethodDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveLearnMethodDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups);

private:
	int id;
	std::string name;
	std::list <MoveLearnMethodName>names;
	std::list <MoveLearnMethodDescription>descriptions;
	std::list <AbilityDetail_pokemon_inner_pokemon>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveLearnMethodDetail_H_ */
