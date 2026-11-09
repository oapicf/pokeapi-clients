/*
 * PokemonFormDetail.h
 *
 * 
 */

#ifndef _PokemonFormDetail_H_
#define _PokemonFormDetail_H_


#include <string>
#include "PokemonFormFlavorText.h"
#include "PokemonFormName.h"
#include "PokemonFormSprites.h"
#include "PokemonFormTriggerCondition.h"
#include "PokemonFormType.h"
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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	 */
	int getOrder();

	/*! \brief Set The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
	 */
	void setOrder(int  order);
	/*! \brief Get The order in which forms should be sorted within a species' forms.
	 */
	int getFormOrder();

	/*! \brief Set The order in which forms should be sorted within a species' forms.
	 */
	void setFormOrder(int  form_order);
	/*! \brief Get True for exactly one form used as the default for each Pokémon.
	 */
	bool getIsDefault();

	/*! \brief Set True for exactly one form used as the default for each Pokémon.
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get Whether or not this form can only happen during battle.
	 */
	bool getIsBattleOnly();

	/*! \brief Set Whether or not this form can only happen during battle.
	 */
	void setIsBattleOnly(bool  is_battle_only);
	/*! \brief Get Whether or not this form requires mega evolution.
	 */
	bool getIsMega();

	/*! \brief Set Whether or not this form requires mega evolution.
	 */
	void setIsMega(bool  is_mega);
	/*! \brief Get The name of this form.
	 */
	std::string getFormName();

	/*! \brief Set The name of this form.
	 */
	void setFormName(std::string  form_name);
	/*! \brief Get The Pokémon that can take on this form.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon that can take on this form.
	 */
	void setPokemon(PokemonSummary  pokemon);
	/*! \brief Get A set of sprites used to depict this Pokémon form in the game.
	 */
	PokemonFormSprites getSprites();

	/*! \brief Set A set of sprites used to depict this Pokémon form in the game.
	 */
	void setSprites(PokemonFormSprites  sprites);
	/*! \brief Get The version group this Pokémon form was introduced in.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group this Pokémon form was introduced in.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
	 */
	std::list<PokemonFormName> getFormNames();

	/*! \brief Set The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
	 */
	void setFormNames(std::list <PokemonFormName> form_names);
	/*! \brief Get The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
	 */
	std::list<PokemonFormName> getNames();

	/*! \brief Set The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
	 */
	void setNames(std::list <PokemonFormName> names);
	/*! \brief Get A list of details showing types this Pokémon form has.
	 */
	std::list<PokemonFormType> getTypes();

	/*! \brief Set A list of details showing types this Pokémon form has.
	 */
	void setTypes(std::list <PokemonFormType> types);
	/*! \brief Get The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
	 */
	std::list<PokemonFormTriggerCondition> getTriggerConditions();

	/*! \brief Set The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
	 */
	void setTriggerConditions(std::list <PokemonFormTriggerCondition> trigger_conditions);
	/*! \brief Get The flavor text of this form listed in different languages and versions.
	 */
	std::list<PokemonFormFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this form listed in different languages and versions.
	 */
	void setFlavorTextEntries(std::list <PokemonFormFlavorText> flavor_text_entries);

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
	PokemonFormSprites sprites;
	VersionGroupSummary version_group;
	std::list <PokemonFormName>form_names;
	std::list <PokemonFormName>names;
	std::list <PokemonFormType>types;
	std::list <PokemonFormTriggerCondition>trigger_conditions;
	std::list <PokemonFormFlavorText>flavor_text_entries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormDetail_H_ */
