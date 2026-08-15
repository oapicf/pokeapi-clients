//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/evolution_chain_detail_chain_evolves_to_inner.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_detail_chain.g.dart';

/// EvolutionChainDetailChain
///
/// Properties:
/// * [evolutionDetails] 
/// * [evolvesTo] 
/// * [isBaby] 
/// * [species] 
@BuiltValue()
abstract class EvolutionChainDetailChain implements Built<EvolutionChainDetailChain, EvolutionChainDetailChainBuilder> {
  @BuiltValueField(wireName: r'evolution_details')
  BuiltList<JsonObject?> get evolutionDetails;

  @BuiltValueField(wireName: r'evolves_to')
  BuiltList<EvolutionChainDetailChainEvolvesToInner> get evolvesTo;

  @BuiltValueField(wireName: r'is_baby')
  bool get isBaby;

  @BuiltValueField(wireName: r'species')
  AbilityDetailPokemonInnerPokemon get species;

  EvolutionChainDetailChain._();

  factory EvolutionChainDetailChain([void updates(EvolutionChainDetailChainBuilder b)]) = _$EvolutionChainDetailChain;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainDetailChainBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainDetailChain> get serializer => _$EvolutionChainDetailChainSerializer();
}

class _$EvolutionChainDetailChainSerializer implements PrimitiveSerializer<EvolutionChainDetailChain> {
  @override
  final Iterable<Type> types = const [EvolutionChainDetailChain, _$EvolutionChainDetailChain];

  @override
  final String wireName = r'EvolutionChainDetailChain';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainDetailChain object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'evolution_details';
    yield serializers.serialize(
      object.evolutionDetails,
      specifiedType: const FullType(BuiltList, [FullType.nullable(JsonObject)]),
    );
    yield r'evolves_to';
    yield serializers.serialize(
      object.evolvesTo,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionChainDetailChainEvolvesToInner)]),
    );
    yield r'is_baby';
    yield serializers.serialize(
      object.isBaby,
      specifiedType: const FullType(bool),
    );
    yield r'species';
    yield serializers.serialize(
      object.species,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionChainDetailChain object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainDetailChainBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'evolution_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType.nullable(JsonObject)]),
          ) as BuiltList<JsonObject?>;
          result.evolutionDetails.replace(valueDes);
          break;
        case r'evolves_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionChainDetailChainEvolvesToInner)]),
          ) as BuiltList<EvolutionChainDetailChainEvolvesToInner>;
          result.evolvesTo.replace(valueDes);
          break;
        case r'is_baby':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isBaby = valueDes;
          break;
        case r'species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.species.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionChainDetailChain deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainDetailChainBuilder();
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

