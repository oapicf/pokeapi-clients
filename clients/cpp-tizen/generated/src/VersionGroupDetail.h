/*
 * VersionGroupDetail.h
 *
 * 
 */

#ifndef _VersionGroupDetail_H_
#define _VersionGroupDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "GenerationSummary.h"
#include "VersionSummary.h"
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

class VersionGroupDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionGroupDetail();
	VersionGroupDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionGroupDetail();

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
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int  order);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoveLearnMethods();

	/*! \brief Set 
	 */
	void setMoveLearnMethods(std::list <AbilityDetail_pokemon_inner_pokemon> move_learn_methods);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getPokedexes();

	/*! \brief Set 
	 */
	void setPokedexes(std::list <AbilityDetail_pokemon_inner_pokemon> pokedexes);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getRegions();

	/*! \brief Set 
	 */
	void setRegions(std::list <AbilityDetail_pokemon_inner_pokemon> regions);
	/*! \brief Get 
	 */
	std::list<VersionSummary> getVersions();

	/*! \brief Set 
	 */
	void setVersions(std::list <VersionSummary> versions);

private:
	int id;
	std::string name;
	int order;
	GenerationSummary generation;
	std::list <AbilityDetail_pokemon_inner_pokemon>move_learn_methods;
	std::list <AbilityDetail_pokemon_inner_pokemon>pokedexes;
	std::list <AbilityDetail_pokemon_inner_pokemon>regions;
	std::list <VersionSummary>versions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionGroupDetail_H_ */
