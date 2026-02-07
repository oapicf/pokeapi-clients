--  PokéAPI
--  All the Pokémon data you'll ever need in one place, easily accessible through a modern free open_source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;

package .Servers is
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  List berry firmness
   --  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
   overriding
   procedure Berry_Firmness_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedBerryFirmnessSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get berry by firmness
   --  Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
   overriding
   procedure Berry_Firmness_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.BerryFirmnessDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List berry flavors
   --  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
   overriding
   procedure Berry_Flavor_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedBerryFlavorSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get berries by flavor
   --  Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
   overriding
   procedure Berry_Flavor_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.BerryFlavorDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List berries
   --  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
   overriding
   procedure Berry_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedBerrySummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get a berry
   --  Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
   overriding
   procedure Berry_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.BerryDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List contest effects
   --  Contest effects refer to the effects of moves when used in contests.
   overriding
   procedure Contest_Effect_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedContestEffectSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get contest effect
   --  Contest effects refer to the effects of moves when used in contests.
   overriding
   procedure Contest_Effect_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ContestEffectDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List contest types
   --  Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
   overriding
   procedure Contest_Type_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedContestTypeSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get contest type
   --  Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
   overriding
   procedure Contest_Type_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ContestTypeDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List super contest effects
   --  Super contest effects refer to the effects of moves when used in super contests.
   overriding
   procedure Super_Contest_Effect_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedSuperContestEffectSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get super contest effect
   --  Super contest effects refer to the effects of moves when used in super contests.
   overriding
   procedure Super_Contest_Effect_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.SuperContestEffectDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List encounter conditions
   --  Conditions which affect what pokemon might appear in the wild, e.g., day or night.
   overriding
   procedure Encounter_Condition_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEncounterConditionSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get encounter condition
   --  Conditions which affect what pokemon might appear in the wild, e.g., day or night.
   overriding
   procedure Encounter_Condition_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EncounterConditionDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List encounter condition values
   --  Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
   overriding
   procedure Encounter_Condition_Value_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEncounterConditionValueSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get encounter condition value
   --  Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
   overriding
   procedure Encounter_Condition_Value_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EncounterConditionValueDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List encounter methods
   --  Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
   overriding
   procedure Encounter_Method_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEncounterMethodSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get encounter method
   --  Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
   overriding
   procedure Encounter_Method_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EncounterMethodDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List evolution chains
   --  Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
   overriding
   procedure Evolution_Chain_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEvolutionChainSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get evolution chain
   --  Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
   overriding
   procedure Evolution_Chain_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EvolutionChainDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List evolution triggers
   --  Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
   overriding
   procedure Evolution_Trigger_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEvolutionTriggerSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get evolution trigger
   --  Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
   overriding
   procedure Evolution_Trigger_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EvolutionTriggerDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List genrations
   --  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
   overriding
   procedure Generation_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedGenerationSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get genration
   --  A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
   overriding
   procedure Generation_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.GenerationDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokedex
   --  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
   overriding
   procedure Pokedex_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokedexSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokedex
   --  A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
   overriding
   procedure Pokedex_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokedexDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List version groups
   --  Version groups categorize highly similar versions of the games.
   overriding
   procedure Version_Group_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedVersionGroupSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get version group
   --  Version groups categorize highly similar versions of the games.
   overriding
   procedure Version_Group_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.VersionGroupDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List versions
   --  Versions of the games, e.g., Red, Blue or Yellow.
   overriding
   procedure Version_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedVersionSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get version
   --  Versions of the games, e.g., Red, Blue or Yellow.
   overriding
   procedure Version_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.VersionDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List item attributes
   --  Item attributes define particular aspects of items, e.g."usable in battle" or "consumable".
   overriding
   procedure Item_Attribute_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedItemAttributeSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item attribute
   --  Item attributes define particular aspects of items, e.g."usable in battle" or "consumable".
   overriding
   procedure Item_Attribute_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ItemAttributeDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List item categories
   --  Item categories determine where items will be placed in the players bag.
   overriding
   procedure Item_Category_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedItemCategorySummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item category
   --  Item categories determine where items will be placed in the players bag.
   overriding
   procedure Item_Category_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ItemCategoryDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List item fling effects
   --  The various effects of the move"Fling" when used with different items.
   overriding
   procedure Item_Fling_Effect_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedItemFlingEffectSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item fling effect
   --  The various effects of the move"Fling" when used with different items.
   overriding
   procedure Item_Fling_Effect_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ItemFlingEffectDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List items
   --  An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
   overriding
   procedure Item_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedItemSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List item pockets
   --  Pockets within the players bag used for storing items by category.
   overriding
   procedure Item_Pocket_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedItemPocketSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item pocket
   --  Pockets within the players bag used for storing items by category.
   overriding
   procedure Item_Pocket_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ItemPocketDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get item
   --  An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
   overriding
   procedure Item_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.ItemDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List location areas
   --  Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
   overriding
   procedure Location_Area_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result  : out .Models.PaginatedLocationAreaSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get location area
   --  Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
   overriding
   procedure Location_Area_Retrieve
      (Server : in out Server_Type;
       Id : in Integer;
       Result  : out .Models.LocationAreaDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List locations
   --  Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
   overriding
   procedure Location_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedLocationSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get location
   --  Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
   overriding
   procedure Location_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.LocationDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pal park areas
   --  Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
   overriding
   procedure Pal_Park_Area_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPalParkAreaSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pal park area
   --  Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
   overriding
   procedure Pal_Park_Area_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PalParkAreaDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List regions
   --  A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
   overriding
   procedure Region_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedRegionSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get region
   --  A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
   overriding
   procedure Region_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.RegionDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List machines
   --  Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
   overriding
   procedure Machine_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMachineSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get machine
   --  Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
   overriding
   procedure Machine_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MachineDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move meta ailments
   --  Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
   overriding
   procedure Move_Ailment_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveMetaAilmentSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move meta ailment
   --  Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
   overriding
   procedure Move_Ailment_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveMetaAilmentDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move battle styles
   --  Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
   overriding
   procedure Move_Battle_Style_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveBattleStyleSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move battle style
   --  Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
   overriding
   procedure Move_Battle_Style_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveBattleStyleDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move meta categories
   --  Very general categories that loosely group move effects.
   overriding
   procedure Move_Category_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveMetaCategorySummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move meta category
   --  Very general categories that loosely group move effects.
   overriding
   procedure Move_Category_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveMetaCategoryDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move learn methods
   --  Methods by which Pokémon can learn moves.
   overriding
   procedure Move_Learn_Method_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveLearnMethodSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move learn method
   --  Methods by which Pokémon can learn moves.
   overriding
   procedure Move_Learn_Method_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveLearnMethodDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List moves
   --  Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
   overriding
   procedure Move_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move
   --  Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
   overriding
   procedure Move_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move targets
   --  Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
   overriding
   procedure Move_Target_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveTargetSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move target
   --  Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
   overriding
   procedure Move_Target_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveTargetDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   --  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
   overriding
   procedure Ability_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedAbilitySummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   --  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
   overriding
   procedure Ability_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.AbilityDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List charecterictics
   --  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
   overriding
   procedure Characteristic_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedCharacteristicSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get characteristic
   --  Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
   overriding
   procedure Characteristic_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.CharacteristicDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List egg groups
   --  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
   overriding
   procedure Egg_Group_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedEggGroupSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get egg group
   --  Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
   overriding
   procedure Egg_Group_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.EggGroupDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List genders
   --  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
   overriding
   procedure Gender_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedGenderSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get gender
   --  Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
   overriding
   procedure Gender_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.GenderDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List growth rates
   --  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
   overriding
   procedure Growth_Rate_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedGrowthRateSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get growth rate
   --  Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
   overriding
   procedure Growth_Rate_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.GrowthRateDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List move damage classes
   --  Damage classes moves can have, e.g. physical, special, or non-damaging.
   overriding
   procedure Move_Damage_Class_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedMoveDamageClassSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get move damage class
   --  Damage classes moves can have, e.g. physical, special, or non-damaging.
   overriding
   procedure Move_Damage_Class_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.MoveDamageClassDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List natures
   --  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
   overriding
   procedure Nature_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedNatureSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get nature
   --  Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
   overriding
   procedure Nature_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.NatureDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokeathlon stats
   --  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
   overriding
   procedure Pokeathlon_Stat_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokeathlonStatSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokeathlon stat
   --  Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
   overriding
   procedure Pokeathlon_Stat_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokeathlonStatDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemon colors
   --  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
   overriding
   procedure Pokemon_Color_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonColorSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemon color
   --  Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
   overriding
   procedure Pokemon_Color_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonColorDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemon forms
   --  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
   overriding
   procedure Pokemon_Form_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonFormSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemon form
   --  Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
   overriding
   procedure Pokemon_Form_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonFormDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemom habitas
   --  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
   overriding
   procedure Pokemon_Habitat_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonHabitatSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemom habita
   --  Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
   overriding
   procedure Pokemon_Habitat_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonHabitatDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemon
   --  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
   overriding
   procedure Pokemon_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemon
   --  Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
   overriding
   procedure Pokemon_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemon shapes
   --  Shapes used for sorting Pokémon in a Pokédex.
   overriding
   procedure Pokemon_Shape_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonShapeSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemon shape
   --  Shapes used for sorting Pokémon in a Pokédex.
   overriding
   procedure Pokemon_Shape_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonShapeDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List pokemon species
   --  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
   overriding
   procedure Pokemon_Species_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedPokemonSpeciesSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get pokemon species
   --  A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
   overriding
   procedure Pokemon_Species_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.PokemonSpeciesDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List stats
   --  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
   overriding
   procedure Stat_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedStatSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get stat
   --  Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
   overriding
   procedure Stat_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.StatDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List types
   --  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
   overriding
   procedure Type_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedTypeSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get types
   --  Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
   overriding
   procedure Type_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.TypeDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List languages
   --  Languages for translations of API resource information.
   overriding
   procedure Language_List
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Q : in Swagger.Nullable_UString;
       Result  : out .Models.PaginatedLanguageSummaryList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get language
   --  Languages for translations of API resource information.
   overriding
   procedure Language_Retrieve
      (Server : in out Server_Type;
       Id : in Swagger.UString;
       Result  : out .Models.LanguageDetail_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
