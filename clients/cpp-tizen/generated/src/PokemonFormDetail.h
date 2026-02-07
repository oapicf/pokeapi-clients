/*
 * PokemonFormDetail.h
 *
 * 
 */

#ifndef _PokemonFormDetail_H_
#define _PokemonFormDetail_H_


#include <string>
#include "PokemonDetail_types_inner.h"
#include "PokemonFormDetail_form_names_inner.h"
#include "PokemonFormDetail_sprites.h"
#include "PokemonSummary.h"
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

class PokemonFormDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormDetail();
	PokemonFormDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormDetail();

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
	int getFormOrder();

	/*! \brief Set 
	 */
	void setFormOrder(int  form_order);
	/*! \brief Get 
	 */
	bool getIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get 
	 */
	bool getIsBattleOnly();

	/*! \brief Set 
	 */
	void setIsBattleOnly(bool  is_battle_only);
	/*! \brief Get 
	 */
	bool getIsMega();

	/*! \brief Set 
	 */
	void setIsMega(bool  is_mega);
	/*! \brief Get 
	 */
	std::string getFormName();

	/*! \brief Set 
	 */
	void setFormName(std::string  form_name);
	/*! \brief Get 
	 */
	PokemonSummary getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(PokemonSummary  pokemon);
	/*! \brief Get 
	 */
	PokemonFormDetail_sprites getSprites();

	/*! \brief Set 
	 */
	void setSprites(PokemonFormDetail_sprites  sprites);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get 
	 */
	std::list<PokemonFormDetail_form_names_inner> getFormNames();

	/*! \brief Set 
	 */
	void setFormNames(std::list <PokemonFormDetail_form_names_inner> form_names);
	/*! \brief Get 
	 */
	std::list<PokemonFormDetail_form_names_inner> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokemonFormDetail_form_names_inner> names);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_types_inner> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list <PokemonDetail_types_inner> types);

private:
	int id;
	std::string name;
	int order;
	int form_order;
	bool is_default;
	bool is_battle_only;
	bool is_mega;
	std::string form_name;
	PokemonSummary pokemon;
	PokemonFormDetail_sprites sprites;
	VersionGroupSummary version_group;
	std::list <PokemonFormDetail_form_names_inner>form_names;
	std::list <PokemonFormDetail_form_names_inner>names;
	std::list <PokemonDetail_types_inner>types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormDetail_H_ */
