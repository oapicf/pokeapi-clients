/*
 * GenerationDetail.h
 *
 * 
 */

#ifndef _GenerationDetail_H_
#define _GenerationDetail_H_


#include <string>
#include "AbilitySummary.h"
#include "GenerationName.h"
#include "MoveSummary.h"
#include "PokemonSpeciesSummary.h"
#include "RegionSummary.h"
#include "TypeSummary.h"
#include "VersionGroupSummary.h"
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

class GenerationDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerationDetail();
	GenerationDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerationDetail();

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
	std::list<AbilitySummary> getAbilities();

	/*! \brief Set 
	 */
	void setAbilities(std::list <AbilitySummary> abilities);
	/*! \brief Get 
	 */
	RegionSummary getMainRegion();

	/*! \brief Set 
	 */
	void setMainRegion(RegionSummary  main_region);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get 
	 */
	std::list<GenerationName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <GenerationName> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);
	/*! \brief Get 
	 */
	std::list<TypeSummary> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list <TypeSummary> types);
	/*! \brief Get 
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list <VersionGroupSummary> version_groups);

private:
	int id;
	std::string name;
	std::list <AbilitySummary>abilities;
	RegionSummary main_region;
	std::list <MoveSummary>moves;
	std::list <GenerationName>names;
	std::list <PokemonSpeciesSummary>pokemon_species;
	std::list <TypeSummary>types;
	std::list <VersionGroupSummary>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerationDetail_H_ */
