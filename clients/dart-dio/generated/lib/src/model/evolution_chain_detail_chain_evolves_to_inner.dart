//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_detail_chain_evolves_to_inner.g.dart';

/// EvolutionChainDetailChainEvolvesToInner
///
/// Properties:
/// * [evolutionDetails] 
/// * [isBaby] 
/// * [species] 
@BuiltValue()
abstract class EvolutionChainDetailChainEvolvesToInner implements Built<EvolutionChainDetailChainEvolvesToInner, EvolutionChainDetailChainEvolvesToInnerBuilder> {
  @BuiltValueField(wireName: r'evolution_details')
  BuiltList<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> get evolutionDetails;

  @BuiltValueField(wireName: r'is_baby')
  bool get isBaby;

  @BuiltValueField(wireName: r'species')
  AbilityDetailPokemonInnerPokemon get species;

  EvolutionChainDetailChainEvolvesToInner._();

  factory EvolutionChainDetailChainEvolvesToInner([void updates(EvolutionChainDetailChainEvolvesToInnerBuilder b)]) = _$EvolutionChainDetailChainEvolvesToInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainDetailChainEvolvesToInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainDetailChainEvolvesToInner> get serializer => _$EvolutionChainDetailChainEvolvesToInnerSerializer();
}

class _$EvolutionChainDetailChainEvolvesToInnerSerializer implements PrimitiveSerializer<EvolutionChainDetailChainEvolvesToInner> {
  @override
  final Iterable<Type> types = const [EvolutionChainDetailChainEvolvesToInner, _$EvolutionChainDetailChainEvolvesToInner];

  @override
  final String wireName = r'EvolutionChainDetailChainEvolvesToInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainDetailChainEvolvesToInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'evolution_details';
    yield serializers.serialize(
      object.evolutionDetails,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner)]),
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
    EvolutionChainDetailChainEvolvesToInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainDetailChainEvolvesToInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'evolution_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner)]),
          ) as BuiltList<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>;
          result.evolutionDetails.replace(valueDes);
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
  EvolutionChainDetailChainEvolvesToInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainDetailChainEvolvesToInnerBuilder();
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

