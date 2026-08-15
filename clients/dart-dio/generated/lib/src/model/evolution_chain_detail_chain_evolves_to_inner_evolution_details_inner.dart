//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.g.dart';

/// EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
///
/// Properties:
/// * [gender] 
/// * [heldItem] 
/// * [item] 
/// * [knownMove] 
/// * [knownMoveType] 
/// * [location] 
/// * [minAffection] 
/// * [minBeauty] 
/// * [minHappiness] 
/// * [minLevel] 
/// * [needsOverworldRain] 
/// * [partySpecies] 
/// * [partyType] 
/// * [relativePhysicalStats] 
/// * [timeOfDay] 
/// * [tradeSpecies] 
/// * [trigger] 
/// * [turnUpsideDown] 
@BuiltValue()
abstract class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner implements Built<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'gender')
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender get gender;

  @BuiltValueField(wireName: r'held_item')
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender get heldItem;

  @BuiltValueField(wireName: r'item')
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender get item;

  @BuiltValueField(wireName: r'known_move')
  JsonObject get knownMove;

  @BuiltValueField(wireName: r'known_move_type')
  JsonObject get knownMoveType;

  @BuiltValueField(wireName: r'location')
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender get location;

  @BuiltValueField(wireName: r'min_affection')
  int get minAffection;

  @BuiltValueField(wireName: r'min_beauty')
  int get minBeauty;

  @BuiltValueField(wireName: r'min_happiness')
  int get minHappiness;

  @BuiltValueField(wireName: r'min_level')
  int get minLevel;

  @BuiltValueField(wireName: r'needs_overworld_rain')
  bool get needsOverworldRain;

  @BuiltValueField(wireName: r'party_species')
  String get partySpecies;

  @BuiltValueField(wireName: r'party_type')
  String get partyType;

  @BuiltValueField(wireName: r'relative_physical_stats')
  String get relativePhysicalStats;

  @BuiltValueField(wireName: r'time_of_day')
  String get timeOfDay;

  @BuiltValueField(wireName: r'trade_species')
  String get tradeSpecies;

  @BuiltValueField(wireName: r'trigger')
  AbilityDetailPokemonInnerPokemon get trigger;

  @BuiltValueField(wireName: r'turn_upside_down')
  bool get turnUpsideDown;

  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner._();

  factory EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner([void updates(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerBuilder b)]) = _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> get serializer => _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerSerializer();
}

class _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerSerializer implements PrimitiveSerializer<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> {
  @override
  final Iterable<Type> types = const [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner, _$EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner];

  @override
  final String wireName = r'EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'gender';
    yield serializers.serialize(
      object.gender,
      specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
    );
    yield r'held_item';
    yield serializers.serialize(
      object.heldItem,
      specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
    );
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
    );
    yield r'known_move';
    yield serializers.serialize(
      object.knownMove,
      specifiedType: const FullType(JsonObject),
    );
    yield r'known_move_type';
    yield serializers.serialize(
      object.knownMoveType,
      specifiedType: const FullType(JsonObject),
    );
    yield r'location';
    yield serializers.serialize(
      object.location,
      specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
    );
    yield r'min_affection';
    yield serializers.serialize(
      object.minAffection,
      specifiedType: const FullType(int),
    );
    yield r'min_beauty';
    yield serializers.serialize(
      object.minBeauty,
      specifiedType: const FullType(int),
    );
    yield r'min_happiness';
    yield serializers.serialize(
      object.minHappiness,
      specifiedType: const FullType(int),
    );
    yield r'min_level';
    yield serializers.serialize(
      object.minLevel,
      specifiedType: const FullType(int),
    );
    yield r'needs_overworld_rain';
    yield serializers.serialize(
      object.needsOverworldRain,
      specifiedType: const FullType(bool),
    );
    yield r'party_species';
    yield serializers.serialize(
      object.partySpecies,
      specifiedType: const FullType(String),
    );
    yield r'party_type';
    yield serializers.serialize(
      object.partyType,
      specifiedType: const FullType(String),
    );
    yield r'relative_physical_stats';
    yield serializers.serialize(
      object.relativePhysicalStats,
      specifiedType: const FullType(String),
    );
    yield r'time_of_day';
    yield serializers.serialize(
      object.timeOfDay,
      specifiedType: const FullType(String),
    );
    yield r'trade_species';
    yield serializers.serialize(
      object.tradeSpecies,
      specifiedType: const FullType(String),
    );
    yield r'trigger';
    yield serializers.serialize(
      object.trigger,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'turn_upside_down';
    yield serializers.serialize(
      object.turnUpsideDown,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'gender':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
          ) as EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
          result.gender.replace(valueDes);
          break;
        case r'held_item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
          ) as EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
          result.heldItem.replace(valueDes);
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
          ) as EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
          result.item.replace(valueDes);
          break;
        case r'known_move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.knownMove = valueDes;
          break;
        case r'known_move_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.knownMoveType = valueDes;
          break;
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender),
          ) as EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
          result.location.replace(valueDes);
          break;
        case r'min_affection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minAffection = valueDes;
          break;
        case r'min_beauty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minBeauty = valueDes;
          break;
        case r'min_happiness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minHappiness = valueDes;
          break;
        case r'min_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minLevel = valueDes;
          break;
        case r'needs_overworld_rain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.needsOverworldRain = valueDes;
          break;
        case r'party_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partySpecies = valueDes;
          break;
        case r'party_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partyType = valueDes;
          break;
        case r'relative_physical_stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.relativePhysicalStats = valueDes;
          break;
        case r'time_of_day':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.timeOfDay = valueDes;
          break;
        case r'trade_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.tradeSpecies = valueDes;
          break;
        case r'trigger':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.trigger.replace(valueDes);
          break;
        case r'turn_upside_down':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.turnUpsideDown = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerBuilder();
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

