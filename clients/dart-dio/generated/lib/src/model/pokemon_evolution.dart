//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/evolution_condition_expression.dart';
import 'package:openapi/src/model/item_summary.dart';
import 'package:openapi/src/model/evolution_trigger_summary.dart';
import 'package:openapi/src/model/nature_summary.dart';
import 'package:openapi/src/model/region_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_evolution_known_move.dart';
import 'package:openapi/src/model/pokemon_form_summary.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:openapi/src/model/location_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_evolution.g.dart';

/// PokemonEvolution
///
/// Properties:
/// * [versionGroup] - The version group in which these evolution requirements apply.
/// * [isDefault] - Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
/// * [item] - The item required to cause evolution this into Pokémon species.
/// * [trigger] - The type of event that triggers evolution into this Pokémon species.
/// * [gender] - The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
/// * [heldItem] - The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
/// * [knownMove] 
/// * [knownMoveType] 
/// * [location] - The location the evolution must be triggered at.
/// * [minLevel] - The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
/// * [minHappiness] - The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
/// * [minBeauty] - The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
/// * [minAffection] - The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
/// * [nearSpecialRock] - Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
/// * [needsMultiplayer] - Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
/// * [needsOverworldRain] - Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
/// * [partySpecies] - The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
/// * [partyType] - The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
/// * [relativePhysicalStats] - The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
/// * [timeOfDay] - The required time of day. Day or night.
/// * [tradeSpecies] - Pokémon species for which this one must be traded.
/// * [turnUpsideDown] - Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
/// * [region] - The required region in which this evolution can occur.
/// * [requiredPokemonForm] - The Pokémon form required before evolving, or null if unrestricted.
/// * [evolvedPokemonForm] - The Pokémon form produced by this evolution, or null if unspecified.
/// * [usedMove] - The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
/// * [minMoveCount] - The minimum number of times a move must be used in order to evolve into this Pokémon species.
/// * [minSteps] - The minimum number of steps that must be taken in order to evolve into this Pokémon species.
/// * [minDamageTaken] - The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
/// * [allowedNatures] - The natures that allow this evolution, or null if unrestricted.
/// * [conditionExpression] - An additional evolution condition expressed in reverse Polish notation, or null if none.
@BuiltValue()
abstract class PokemonEvolution implements Built<PokemonEvolution, PokemonEvolutionBuilder> {
  /// The version group in which these evolution requirements apply.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  /// Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  /// The item required to cause evolution this into Pokémon species.
  @BuiltValueField(wireName: r'item')
  ItemSummary? get item;

  /// The type of event that triggers evolution into this Pokémon species.
  @BuiltValueField(wireName: r'trigger')
  EvolutionTriggerSummary get trigger;

  /// The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'gender')
  int? get gender;

  /// The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'held_item')
  ItemSummary? get heldItem;

  @BuiltValueField(wireName: r'known_move')
  PokemonEvolutionKnownMove get knownMove;

  @BuiltValueField(wireName: r'known_move_type')
  PokemonEvolutionKnownMove get knownMoveType;

  /// The location the evolution must be triggered at.
  @BuiltValueField(wireName: r'location')
  LocationSummary? get location;

  /// The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_level')
  int? get minLevel;

  /// The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_happiness')
  int? get minHappiness;

  /// The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_beauty')
  int? get minBeauty;

  /// The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_affection')
  int? get minAffection;

  /// Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'near_special_rock')
  bool? get nearSpecialRock;

  /// Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  @BuiltValueField(wireName: r'needs_multiplayer')
  bool? get needsMultiplayer;

  /// Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  @BuiltValueField(wireName: r'needs_overworld_rain')
  bool? get needsOverworldRain;

  /// The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'party_species')
  PokemonSpeciesSummary? get partySpecies;

  /// The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'party_type')
  TypeSummary? get partyType;

  /// The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
  @BuiltValueField(wireName: r'relative_physical_stats')
  int? get relativePhysicalStats;

  /// The required time of day. Day or night.
  @BuiltValueField(wireName: r'time_of_day')
  String? get timeOfDay;

  /// Pokémon species for which this one must be traded.
  @BuiltValueField(wireName: r'trade_species')
  PokemonSpeciesSummary? get tradeSpecies;

  /// Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  @BuiltValueField(wireName: r'turn_upside_down')
  bool? get turnUpsideDown;

  /// The required region in which this evolution can occur.
  @BuiltValueField(wireName: r'region')
  RegionSummary? get region;

  /// The Pokémon form required before evolving, or null if unrestricted.
  @BuiltValueField(wireName: r'required_pokemon_form')
  PokemonFormSummary? get requiredPokemonForm;

  /// The Pokémon form produced by this evolution, or null if unspecified.
  @BuiltValueField(wireName: r'evolved_pokemon_form')
  PokemonFormSummary? get evolvedPokemonForm;

  /// The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'used_move')
  MoveSummary? get usedMove;

  /// The minimum number of times a move must be used in order to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_move_count')
  int? get minMoveCount;

  /// The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_steps')
  int? get minSteps;

  /// The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  @BuiltValueField(wireName: r'min_damage_taken')
  int? get minDamageTaken;

  /// The natures that allow this evolution, or null if unrestricted.
  @BuiltValueField(wireName: r'allowed_natures')
  BuiltList<NatureSummary>? get allowedNatures;

  /// An additional evolution condition expressed in reverse Polish notation, or null if none.
  @BuiltValueField(wireName: r'condition_expression')
  EvolutionConditionExpression? get conditionExpression;

  PokemonEvolution._();

  factory PokemonEvolution([void updates(PokemonEvolutionBuilder b)]) = _$PokemonEvolution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonEvolutionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonEvolution> get serializer => _$PokemonEvolutionSerializer();
}

class _$PokemonEvolutionSerializer implements PrimitiveSerializer<PokemonEvolution> {
  @override
  final Iterable<Type> types = const [PokemonEvolution, _$PokemonEvolution];

  @override
  final String wireName = r'PokemonEvolution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonEvolution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    if (object.isDefault != null) {
      yield r'is_default';
      yield serializers.serialize(
        object.isDefault,
        specifiedType: const FullType(bool),
      );
    }
    yield r'item';
    yield object.item == null ? null : serializers.serialize(
      object.item,
      specifiedType: const FullType.nullable(ItemSummary),
    );
    yield r'trigger';
    yield serializers.serialize(
      object.trigger,
      specifiedType: const FullType(EvolutionTriggerSummary),
    );
    if (object.gender != null) {
      yield r'gender';
      yield serializers.serialize(
        object.gender,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'held_item';
    yield object.heldItem == null ? null : serializers.serialize(
      object.heldItem,
      specifiedType: const FullType.nullable(ItemSummary),
    );
    yield r'known_move';
    yield serializers.serialize(
      object.knownMove,
      specifiedType: const FullType(PokemonEvolutionKnownMove),
    );
    yield r'known_move_type';
    yield serializers.serialize(
      object.knownMoveType,
      specifiedType: const FullType(PokemonEvolutionKnownMove),
    );
    yield r'location';
    yield object.location == null ? null : serializers.serialize(
      object.location,
      specifiedType: const FullType.nullable(LocationSummary),
    );
    if (object.minLevel != null) {
      yield r'min_level';
      yield serializers.serialize(
        object.minLevel,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minHappiness != null) {
      yield r'min_happiness';
      yield serializers.serialize(
        object.minHappiness,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minBeauty != null) {
      yield r'min_beauty';
      yield serializers.serialize(
        object.minBeauty,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minAffection != null) {
      yield r'min_affection';
      yield serializers.serialize(
        object.minAffection,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.nearSpecialRock != null) {
      yield r'near_special_rock';
      yield serializers.serialize(
        object.nearSpecialRock,
        specifiedType: const FullType(bool),
      );
    }
    if (object.needsMultiplayer != null) {
      yield r'needs_multiplayer';
      yield serializers.serialize(
        object.needsMultiplayer,
        specifiedType: const FullType(bool),
      );
    }
    if (object.needsOverworldRain != null) {
      yield r'needs_overworld_rain';
      yield serializers.serialize(
        object.needsOverworldRain,
        specifiedType: const FullType(bool),
      );
    }
    yield r'party_species';
    yield object.partySpecies == null ? null : serializers.serialize(
      object.partySpecies,
      specifiedType: const FullType.nullable(PokemonSpeciesSummary),
    );
    yield r'party_type';
    yield object.partyType == null ? null : serializers.serialize(
      object.partyType,
      specifiedType: const FullType.nullable(TypeSummary),
    );
    if (object.relativePhysicalStats != null) {
      yield r'relative_physical_stats';
      yield serializers.serialize(
        object.relativePhysicalStats,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.timeOfDay != null) {
      yield r'time_of_day';
      yield serializers.serialize(
        object.timeOfDay,
        specifiedType: const FullType(String),
      );
    }
    yield r'trade_species';
    yield object.tradeSpecies == null ? null : serializers.serialize(
      object.tradeSpecies,
      specifiedType: const FullType.nullable(PokemonSpeciesSummary),
    );
    if (object.turnUpsideDown != null) {
      yield r'turn_upside_down';
      yield serializers.serialize(
        object.turnUpsideDown,
        specifiedType: const FullType(bool),
      );
    }
    yield r'region';
    yield object.region == null ? null : serializers.serialize(
      object.region,
      specifiedType: const FullType.nullable(RegionSummary),
    );
    yield r'required_pokemon_form';
    yield object.requiredPokemonForm == null ? null : serializers.serialize(
      object.requiredPokemonForm,
      specifiedType: const FullType.nullable(PokemonFormSummary),
    );
    yield r'evolved_pokemon_form';
    yield object.evolvedPokemonForm == null ? null : serializers.serialize(
      object.evolvedPokemonForm,
      specifiedType: const FullType.nullable(PokemonFormSummary),
    );
    yield r'used_move';
    yield object.usedMove == null ? null : serializers.serialize(
      object.usedMove,
      specifiedType: const FullType.nullable(MoveSummary),
    );
    if (object.minMoveCount != null) {
      yield r'min_move_count';
      yield serializers.serialize(
        object.minMoveCount,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minSteps != null) {
      yield r'min_steps';
      yield serializers.serialize(
        object.minSteps,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.minDamageTaken != null) {
      yield r'min_damage_taken';
      yield serializers.serialize(
        object.minDamageTaken,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'allowed_natures';
    yield object.allowedNatures == null ? null : serializers.serialize(
      object.allowedNatures,
      specifiedType: const FullType.nullable(BuiltList, [FullType(NatureSummary)]),
    );
    yield r'condition_expression';
    yield object.conditionExpression == null ? null : serializers.serialize(
      object.conditionExpression,
      specifiedType: const FullType.nullable(EvolutionConditionExpression),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonEvolution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonEvolutionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isDefault = valueDes;
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ItemSummary),
          ) as ItemSummary?;
          if (valueDes == null) continue;
          result.item.replace(valueDes);
          break;
        case r'trigger':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionTriggerSummary),
          ) as EvolutionTriggerSummary;
          result.trigger.replace(valueDes);
          break;
        case r'gender':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.gender = valueDes;
          break;
        case r'held_item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ItemSummary),
          ) as ItemSummary?;
          if (valueDes == null) continue;
          result.heldItem.replace(valueDes);
          break;
        case r'known_move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonEvolutionKnownMove),
          ) as PokemonEvolutionKnownMove;
          result.knownMove.replace(valueDes);
          break;
        case r'known_move_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonEvolutionKnownMove),
          ) as PokemonEvolutionKnownMove;
          result.knownMoveType.replace(valueDes);
          break;
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LocationSummary),
          ) as LocationSummary?;
          if (valueDes == null) continue;
          result.location.replace(valueDes);
          break;
        case r'min_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minLevel = valueDes;
          break;
        case r'min_happiness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minHappiness = valueDes;
          break;
        case r'min_beauty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minBeauty = valueDes;
          break;
        case r'min_affection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minAffection = valueDes;
          break;
        case r'near_special_rock':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.nearSpecialRock = valueDes;
          break;
        case r'needs_multiplayer':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.needsMultiplayer = valueDes;
          break;
        case r'needs_overworld_rain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.needsOverworldRain = valueDes;
          break;
        case r'party_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary?;
          if (valueDes == null) continue;
          result.partySpecies.replace(valueDes);
          break;
        case r'party_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TypeSummary),
          ) as TypeSummary?;
          if (valueDes == null) continue;
          result.partyType.replace(valueDes);
          break;
        case r'relative_physical_stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.relativePhysicalStats = valueDes;
          break;
        case r'time_of_day':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.timeOfDay = valueDes;
          break;
        case r'trade_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary?;
          if (valueDes == null) continue;
          result.tradeSpecies.replace(valueDes);
          break;
        case r'turn_upside_down':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.turnUpsideDown = valueDes;
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(RegionSummary),
          ) as RegionSummary?;
          if (valueDes == null) continue;
          result.region.replace(valueDes);
          break;
        case r'required_pokemon_form':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonFormSummary),
          ) as PokemonFormSummary?;
          if (valueDes == null) continue;
          result.requiredPokemonForm.replace(valueDes);
          break;
        case r'evolved_pokemon_form':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonFormSummary),
          ) as PokemonFormSummary?;
          if (valueDes == null) continue;
          result.evolvedPokemonForm.replace(valueDes);
          break;
        case r'used_move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MoveSummary),
          ) as MoveSummary?;
          if (valueDes == null) continue;
          result.usedMove.replace(valueDes);
          break;
        case r'min_move_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minMoveCount = valueDes;
          break;
        case r'min_steps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minSteps = valueDes;
          break;
        case r'min_damage_taken':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minDamageTaken = valueDes;
          break;
        case r'allowed_natures':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(NatureSummary)]),
          ) as BuiltList<NatureSummary>?;
          if (valueDes == null) continue;
          result.allowedNatures.replace(valueDes);
          break;
        case r'condition_expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EvolutionConditionExpression),
          ) as EvolutionConditionExpression?;
          if (valueDes == null) continue;
          result.conditionExpression.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonEvolution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonEvolutionBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


