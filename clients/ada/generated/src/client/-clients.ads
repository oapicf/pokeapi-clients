--  
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 20220523
--  Contact: blah@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 6.2.1.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-mr");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  
   procedure Ability_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Ability_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_Firmness_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_Firmness_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_Flavor_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Berry_Flavor_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Characteristic_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Characteristic_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Contest_Effect_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Contest_Effect_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Contest_Type_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Contest_Type_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Egg_Group_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Egg_Group_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Condition_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Condition_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Condition_Value_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Condition_Value_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Method_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Encounter_Method_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Evolution_Chain_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Evolution_Chain_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Evolution_Trigger_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Evolution_Trigger_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Gender_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Gender_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Generation_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Generation_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Growth_Rate_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Growth_Rate_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Attribute_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Attribute_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Category_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Category_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Fling_Effect_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Fling_Effect_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Pocket_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Item_Pocket_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Language_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Language_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Location_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Location_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Location_Area_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Location_Area_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Machine_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Machine_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Ailment_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Ailment_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Battle_Style_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Battle_Style_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Category_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Category_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Damage_Class_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Damage_Class_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Learn_Method_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Learn_Method_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Target_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Move_Target_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Nature_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Nature_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pal_Park_Area_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pal_Park_Area_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokeathlon_Stat_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokeathlon_Stat_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokedex_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokedex_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Color_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Color_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Form_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Form_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Habitat_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Habitat_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Shape_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Shape_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Species_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Pokemon_Species_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Region_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Region_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Stat_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Stat_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Super_Contest_Effect_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Super_Contest_Effect_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Type_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Type_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Version_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Version_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

   --  
   procedure Version_Group_List
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Offset : in Swagger.Nullable_Integer;
       Result : out Swagger.UString);

   --  
   procedure Version_Group_Read
      (Client : in out Client_Type;
       Id : in Integer;
       Result : out Swagger.UString);

end .Clients;
